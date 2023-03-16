//Practice
//In this we have created a rectangle and cuboid class which is an extended of rectangle
//If we pass 3 dimensions we can get area of base rectangle  and volume of cuboid
// We have super in cuboid class here which calls the rectangle class constructor
class rectangle{
    public int length;
    public int breadth;
    rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    public int area(){
        return this.length* this.breadth;
    }
}
class cuboid extends rectangle{
    public int heigth;
    cuboid(int length1,int breadth1,int heigth){
        super(length1,breadth1);
        this.heigth = heigth;
    }
    public int volume(){
        return this.heigth*this.breadth*this.length;
    }
}
public class Java_22 {
    public static void main(String[] args) {
//        rectangle r1 = new rectangle(20,30);
        cuboid c1 = new cuboid(23,45,31);
        System.out.println("Area of base rectangle is "+c1.area()+" and volume of cuboid is "+c1.volume());
    }
}
