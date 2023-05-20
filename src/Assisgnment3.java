class  ExceptionHandling{
//    private int n = null;
    public String nullReturner(int n){
//        this.n = n;
        return null;
    }
}
public class Assisgnment3 {

    public static void main(String[] args) {
        try{
        ExceptionHandling a2 = new ExceptionHandling();
            System.out.println(a2.nullReturner(2));

    }catch (Exception e){
            System.out.println(e);
        }
}
}
