//Hash Map
//It is used to store the data and perform any operation in 0(1) complexity
//For const complexity it takes a key and value to get the value the key is converted to a hashcode and then stored
//So basically we give the index and we access the element from the key in 0(1)
import java.util.HashMap;

public class DSA_60 {
    public static void main(String[] args) {
        HashMap<String,Integer> list = new HashMap<>();
        list.put("Lakshay",99);
        list.put("Rahul",95);
        list.put("Mohit",91);

//        This will give the value for the key lakshay
        System.out.println(list.get("Lakshay"));  //99

//        This will get the value of the key and if it is not there it will give a default value which we have specified
        System.out.println(list.getOrDefault("Mohan",23));  //23

        System.out.println(list.containsKey("Lakshay")); //true


    }

}
