//From this ownwards we will start the DSA
//This is not just dsa it also consist of some important topics that i don't know earlier
//Linear Search
//Linear Search is just a normal search in array
//It has the most time complexity i.e. 0(N)
public class DSA_1 {
    public static void main(String[] args) {
        int [] arr = {23,45,21,34,32};
        int target = 45;
        String name= "Lakshay";
        char ch ='L';
        System.out.println(linearSearch4(name,ch));

    }

//    This will return the index of the element else -1
    static int linearSearch (int [] arr, int target){
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }


//        This will return the  element else -1
    static int linearSearch2 (int [] arr, int target){
        if(arr.length==0){
            return -1;
        }
        for(int element:arr)
            if (element== target) {
                return element;
            }
        return -1;
    }


//    This will return true or false
    static boolean linearSearch3 (int [] arr, int target){
        if(arr.length==0){
            return false;
        }
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==target){
                return true;
            }
        }
        return false;
    }

//    This is linear search for string
    static int linearSearch4(String str ,char ch){
        if(str.length()<=0){
            return -1;
        }
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)==ch){
                return i;
            }
        }
        return -1;
    }
}


