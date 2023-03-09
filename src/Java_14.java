class Employee1{
    int salary;
    String name;
    int year;
    String Address;


//    This is a constructor so that we can make arrays of object
//    The name of the constructor and the class should be same
    Employee1(int id1,String name1,int year1,String Address1){
        salary = id1 ;
        name = name1;
        year = year1;
        Address = Address1;
    }

//    This is a method in a function used to display the object
    void display(){
        System.out.println(name+"  "+year+"  "+salary+"  "+Address);

    }

}
public class Java_14 {
    public static void main(String[] args) {
        Employee1 []e1 = new Employee1[4];
        e1[0] = new Employee1(78000,"Robert",1994,"64c");
        e1[1] = new Employee1(82000,"Sam",2000,"68D");
        e1[2] = new Employee1(84000,"John",1999,"26B");
        e1[3] = new Employee1(79000,"Mohan",2004,"78B");
        e1[0].display();
        e1[1].display();
        e1[2].display();
        e1[3].display();
    }
}