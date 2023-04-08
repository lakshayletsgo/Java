import java.io.FileWriter;

//Practice
public class Java_48 {
    public static void main(String[] args) {
//        Writing a table in a file
        int i=10;
        String table = "";
        for(int j=0;j<=10;j++){
            table = table+ i+"X"+j+"=" +i*j;
            table+="\n";
        }
        try {
            FileWriter f11=  new FileWriter("NewFile.txt");
            f11.write(table);
            f11.close();
        }catch (Exception e){
            System.out.println(e);
        }


    }
}
