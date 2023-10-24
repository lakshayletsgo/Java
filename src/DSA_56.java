//File Handling
//First we have to know that there are two types of input
//1. Byte
//2. char
// What we enter from our keyboard it is byte and char is from file
//To make use of byte reader we have classes that name has input or output stream in it
//To make use of char reader we have to use the classes that name has reader or writer in it
//Here we have Input stream reader --> It is used to read byte data and convert it to char data
//Then we have file Reader--> It is used to read a file and print it
//It takes char as input
//We have then BufferReader which takes reader in which is a byte char data For that we can either provide it through fileReader or through by using inputStreamReader that will convert the byte data of the keyboard to char

//Output Stream writer is used to write character and it takes unicode number
//If the range is exceeded it will throw an error


import java.io.*;

public class DSA_56 {
    public static void main(String[] args) {
//        try(InputStreamReader isr = new InputStreamReader(System.in)) {
//            System.out.print("Enter the text: ");
//            int letter = isr.read();
//            while(isr.ready()){
//                System.out.println((char)letter);
//                letter = isr.read();
//
//            }
//            isr.close();
//            System.out.println();
//        }catch (IOException e){
//            System.out.println(e.getMessage());
//        }


//        try(FileReader fr = new FileReader("Note.txt")){
//            int letter = fr.read();
//            while (fr.ready()){
//                System.out.print((char)letter);
//                letter = fr.read();
//            }
////            fr.close();
//            System.out.println();
//        }catch (IOException e){
//            System.out.println(e.getMessage());
//        }
//
//        try (BufferedReader br = new BufferedReader( new InputStreamReader(System.in))){
//            System.out.println("Read Line: "+br.readLine());
//
//        }catch (IOException e){
//
//            System.out.println(e.getMessage());
//        }
//        try (BufferedReader br2 = new BufferedReader( new FileReader("Note.txt"))){
//            System.out.println("Read Line: "+br2.readLine());
//
//        }catch (IOException e){
//            System.out.println(e.getMessage());
//        }
//        try{
//
////            THis is used to print char only and it take only unicode character
//            OutputStream os = System.out;
//            os.write(100);
//            System.out.println();
//        }catch (IOException e){
//            System.out.println(e.getMessage());
//        }


//        To use the string or character we can use the outputStreamWriter as it has writer in it name we can write any string and char
//        try (OutputStreamWriter osw = new OutputStreamWriter(System.out);){
//            osw.write("My name is lakshay");
//            System.out.println();
//            System.out.println("Hello");
//        }catch (IOException e){
//            System.out.println(e.getMessage());
//        }


////      Similarly to write in a file we can use fileWriter and we have to pass the name of the file in the file braces
//        try(FileWriter fw = new FileWriter("Note.txt",true)) {
//            fw.write("Hello my name is lakshay");
////            This will delete the entire text from the file and only store the text hello my name is lakshay
//
////            To append the data we have call another constructor of the fileWriter where is has boolean input
////            We just have to pass true with the name of the file
//        }catch (IOException e){
//            System.out.println(e.getMessage());
//        }

//        Similarly we have bufferWriter we can use to write in a file
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("Note.txt",true))){
            bw.write("Hello");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }


//        To create a new File we have use the file class
        try {
            File f1  =new File("Lakshayas.txt");
            f1.createNewFile();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
