import java.util.Scanner;
class Student{
    int roll_no;
    String name;
}
public class Main {
    public static void main(String[]args){
        Student s1 = new Student();
        Scanner sc = new Scanner(System.in);
        s1.roll_no = sc.nextInt();
        Scanner st = new Scanner(System.in);
        s1.name = st.nextLine();
        System.out.println(s1.name);
        System.out.println(s1.roll_no);
    }
}

