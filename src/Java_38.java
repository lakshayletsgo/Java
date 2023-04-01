// finally Block
//Isse jo bhi likhte hai voh run hota hi hai chahey jo bhi ho
//Iss program me agr a aur b ki value sahi hai to try ke andar ka run hoga
//Agr ham uske bahar kuch return ka likhe toh voh run nahi hoga lekin finally use karne ke baad ho jayega
public class Java_38 {
    public static int sum(){
        try {
            int a = 10;
            int b= 0;
            int c = a/b;
            return c;
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("This is the finally block ");
        }
        return 0;

    }
    public static void main(String[] args) {
        System.out.println(sum());
    }
}
