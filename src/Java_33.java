// Error and Exception
// There are three types of errors
// 1. Syntax Error
// 2. Logical Error
// 3. Runtime Error
public class Java_33 {
    public static void main(String[] args) {
        int a = 10;
        int b  = 0;
        System.out.println("a/b is ");
        try {

            System.out.println(a/b); //This will throw an error and the code after this won't be executed

        }catch (Exception e){    // Exception is an class an e is an object
            System.out.println("There is an error and the error is:");
            System.out.println(e);
        }

    }
}
