package LoginPage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.*;

public class LoginPage {
    public static void main() {
//        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);
        Scanner sc2= new Scanner(System.in);
        System.out.println("If you are a new user press N or already existing user press E");
        char x = sc.next().charAt(0);
        if(x=='N')
        {
        System.out.print("Create a username :");
        String username = sc.next();
        System.out.print("Create a password : ");
        String password = sc2.nextLine();
        try{

        FileWriter f1 = new FileWriter("newLoginInfo.txt");
        f1.write(username);
        f1.write(":");
        f1.write(password);
        f1.close();
            System.out.println("Loginned Successfully!!");
             }catch (Exception e){
                    System.out.println(e);
                                    }
        }
        else{
            Scanner scanner = new Scanner(System.in);
        String username, password;

        System.out.print("Enter username: ");
        username = scanner.nextLine();

        System.out.print("Enter password: ");
        password = scanner.nextLine();

        try {
            File file = new File("loginInfo.txt");
            Scanner fileScanner = new Scanner(file);

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split(":");
                String fileUsername = parts[0];
                String filePassword = parts[1];

                if (!username.equals(fileUsername)) {
                    System.out.println("Invalid Username");
                    return;
                } else if (!password.equals(filePassword)) {
                    System.out.println("Invalid Password");
                    return;
                }else{
                    System.out.println("Loggined Successfully!!");
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
            e.printStackTrace();
        }
}
        sc.close();
        sc2.close();
    }
}




