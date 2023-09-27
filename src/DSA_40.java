//Comparable Operation
import java.util.Arrays;

class Student6 implements Comparable<Student6>{
    int age;
    int marks;
    public Student6(int n,int n2){
        this.age = n;
        this.marks = n2;
    }

    public String toString(){
        return marks+"";
    }
    @Override
    public int compareTo(Student6 o) {
        int diff =(int)( this.marks - o.marks);
        return diff;
    }
}
public class DSA_40 {
    public static void main(String[] args) {
        Student6 s1 = new Student6(12,91);
        Student6 s2 = new Student6(15,89);
        Student6 s3 = new Student6(16,70);
        Student6 s4 = new Student6(11,98);
        Student6 s5 = new Student6(18,56);
        Student6[]list = {s1,s2,s3,s4,s5};
        System.out.println(Arrays.toString(list));
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

        System.out.println(s1.compareTo(s2));
    }
}
