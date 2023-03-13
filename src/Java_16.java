class Rectangle{
    int length;
    int breadth;
    Rectangle(int l,int b){
        length = l;
        breadth = b;
    }
    public  int Area(){
        return length*breadth;
    }
}
public class Java_16 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4,5);
        Rectangle r2 = new Rectangle(5,8);
        System.out.println("Area of 4 and 5 is "+r1.Area());
        System.out.println("Area of 5 and 8 is "+r2.Area());
    }
}
