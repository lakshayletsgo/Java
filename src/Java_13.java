//Getter and Setter
class Student11{
    private String name;
    private int id;

     public String getName(){
        return name;
     } //These are constructors used mostly when we use private classes
    public void setName(String n){
        name = n;
    }


    public void setId(int a){
        id = a;
    }
    public int getId() {
        return id;
    }
}
public class Java_13 {
    public static void main(String[] args) {
        Student11 s1 = new Student11();
        s1.setName("Lakshay");
        System.out.println(s1.getName());
        s1.setId(587);
        System.out.println(s1.getId());
    }
        }
