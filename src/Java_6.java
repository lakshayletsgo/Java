//Jump Statements
public class Java_6 {
    public static void main(String[]args){

        for(int i=0;i<10;i++){
            if(i==2){
                continue;
            }
            System.out.print(i);
        }
        System.out.println();
//        This will print numbers from 0 to 9 except 2 because it will skip the iteration 2 when i is 2



        for(int i=0;i<10;i++){
            if(i==2){
                break;
            }
            System.out.print(i);
        }
        System.out.println();
//        This will print the values till 2 because it will break out of the loop as i reaches to 2
        }
    }

