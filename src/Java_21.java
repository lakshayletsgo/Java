import java.util.Random;
import java.util.Scanner;

// Making a Guess the number game
class game{
    int num;
    int userInput;
    int noOfGuess;
    public void setNoOfGuess(int noOfGuess){
        this.noOfGuess = noOfGuess;
    }
    public int getnoOfGuess(){
        return noOfGuess;
    }
    game(){
    Random rc = new Random();
    this.num = rc.nextInt(100);
    }
    void setUserInput(){
        Scanner sc= new Scanner(System.in);
        this.userInput = sc.nextInt();
    }
    boolean chechCorrect(){
        noOfGuess++;
        if(num>userInput){
            System.out.println("Your number is too LOW!!");
        } else if (num < userInput) {
            System.out.println("Your number is too HIGH!!");
        } else if(num==userInput) {
            System.out.println("You guesses it right. Your number is "+ num);
            return true;
        }
        return false;
    }


}
public class Java_21 {
    public static void main(String[] args) {

        game g1 = new game();

        boolean b = false;
        while (!b)
        {g1.setUserInput();
         b = g1.chechCorrect();
        System.out.println(b);}
        System.out.println("No of guesses are "+g1.noOfGuess);
    }
}
