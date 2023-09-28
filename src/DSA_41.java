// Vectors
//They are similar to ArrayList
//Just the difference is we can implement multiple threads at a time in ArrayList
//But in Vector we can implement one at a time
//Vector is comparatively slower

//Enum
//It is used to declare multiple variable at one time
import java.util.Vector;
public class DSA_41 {
    enum Month{
        Januarary,Feburary,March,April,May,June,July,August,September,October,November,December;
//        They are static,final and public by default
//        Since they are final no child can be made

        Month(){
            System.out.println("Contructor called for "+this);
        }

    }
    public static void main(String[] args) {
        Vector<Integer> vector =new Vector<>();
        vector.add(20);
        vector.add(22);
        vector.add(23);
        vector.add(25);
        System.out.println(vector);

        Month m1 = Month.April;
        System.out.println(m1);
    }
}
