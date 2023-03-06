//Strings and Its Methods
import java.util.Scanner;


public class Java_7 {
    public static void main(String[]args){
        String a,b,c,d;
        Scanner sc = new Scanner(System.in);
        a = sc.nextLine(); //This will take entire line as a input
        b = sc.next();//This will take only a word as a input
        System.out.println(a);
        System.out.println(b);

        System.out.println(a.length()); //This returns length of string a
        System.out.println(a.toLowerCase()); //This converts a to a lower case
        System.out.println(a.toUpperCase()); //This converts a to a upper case
        System.out.println(a.trim()); //This removes all the spaces from the string from the begning and end
        System.out.println(b.substring(2,4)); //This creates a  string from old string taking words from older one whose starting index is 2 and ending index is 4
        System.out.println(b.replace('l','h')); //This replaces the l letter with h letter
        System.out.println(b.startsWith("la")); //This will return true or false if there is la in the begning of b
        System.out.println(b.endsWith("afs")); //This will also return true or false
        System.out.println(b.charAt(3)); //This will return the letter from the string with index 3
        System.out.println(b.indexOf("h")); //This will return the index number
        System.out.println(b.lastIndexOf('a')); //If there are multiple a in the string b then it will return the last a index
        System.out.println(b.equals("lakshay")); //This will return true or false
        System.out.println(b.equalsIgnoreCase("LAKSHAY")); //This is same as above it ignores all the uppercase or lowercase

    }
}
