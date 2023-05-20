import java.io.FileWriter;
import java.util.Scanner;

public class Jva_project {
    public static void main(String[] args) {
        int i;
        String Id,Pass;
        Scanner sc = new Scanner(System.in);
        Id= sc.next();
        Pass= sc.next();
        try {
            FileWriter f1 = new FileWriter("Java_Project.txt");
            f1.write("UserId:     \t\t\t\t\t  Password:  \n");
            f1.write(Id);
            f1.write("    \t\t\t\t\t\t");
            f1.write(Pass);
            f1.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
