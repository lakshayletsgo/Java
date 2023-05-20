public class Assisgnment2 {
    public static void main(String[] args) {
        try{
            throw new Exception("This is Exception main");
        }catch (Exception e){
//            System.out.println("This is main Exception ");
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("I was here");
        }
    }
}
