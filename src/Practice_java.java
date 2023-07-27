//Binary Search
//Binary search is good beacause its time complexity for worst case is O(logN)
//In this we first take the ascending or descending order of the array (Sorted Array)
//We then divide the array in two parts and check whether the target is less than or greater than the middle elements
//And so on we divide the arrray and find the target
public class Practice_java {

//    Return the element greater or equal to the number
public char nextGreatestLetter(char[] letters, char target) {


        int start = 0;
        int end=letters.length-1;
        while(start<=end){

//            Find middle element, We have done (end-start) because (start+end) can sometime exceed the size of int
            int mid = start+ (end-start)/2;

            if(target<letters[mid]){
                end= mid-1;
            }else  {
                start=mid+1;

                }



        }
        return letters[start%letters.length];
    }

}