//Constructors
class Student2{
    String name;
    int Studentid;

//    If we want to set a default value we can use the constructor
    public Student2(){
        name = "Enter-Your-Name-Here";
        Studentid  = 00;

    }
    public Student2(String name1){
        name = name1;
    }
    public Student2(int Id1){
        Studentid = Id1;
    }
    public Student2(String name2, int id1){
        name = name2;
        Studentid = id1;
    }

    public void display(){
        System.out.println("The constructor name is "+ name+" and its id is "+Studentid);
    }

//    These all are constructors and this is constructor overloading. Ham jo bhi argument pass karege uske hisaab se call hoga

}
public class Java_15 {
    public static void main(String[] args) {
        Student2 s1 = new Student2();
        Student2 s2 = new Student2("Constructor2");
        Student2 s3 = new Student2(3);
        Student2 s4 = new Student2("Constructor4",4);
        s1.display();
        s2.display();
        s3.display();
        s4.display();
    }
}
