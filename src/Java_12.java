//Classes
class student{
    int age;
    String name;
}
class Employee{
    long phoneNumber;
    String name;
    public void printDetails(){
        System.out.println("Phone number of the employee is "+ phoneNumber);
        System.out.println("Name of the employee is "+ name);
    }
}
public class Java_12 {
    public static void main(String[] args) {
        student s1 = new student();
        s1.name = "lakshay";
        s1.age = 19;
        System.out.println(s1.age);
        System.out.println(s1.name);

        Employee e1 = new Employee();
        e1.phoneNumber= 7404783133l;
        e1.name = "lakshay";
        e1.printDetails();

    }
}
