//Binary Search for Rotated Sorted Array
// Sorted Array --> [2,3,13,15,65]
// 1 Rotated Sorted Array --> [65,2,3,13,15]
// 2 Rotated Sorted Array --> [15,65,2,3,13]
// 3 Rotated Sorted Array --> [13,15,65,2,3]

//Here we are first finding which is the largest number(pivot)
//For that we have used the rule that we first check whether the mid element is greater than the begining value
//If it the first value is greater than the middle value it means pivot is in first half otherwise in second
//We then just apply binary search to find the pivot and when we found the pivot we then check whether the target is greater than the start value
//If it greater than the start value then the value must be lying between the pivot and begining otherwise it will be lying in between pivot and end

public class DSA_9 {
    public static void main(String[] args) {
        int []arr = {5,6,7,8,1,2,2,3,4,4};
        int target = 2;
        System.out.println(search(arr,target));
    }
    static  int search(int []arr,int target){
        int pivot = findPivot(arr);
        if(pivot==-1){
            return binarySearch(arr,target,0,arr.length);
        }
        if(arr[pivot]==target){
            return pivot;
        }
        if(target>=arr[0]){
            return binarySearch(arr,target,0,pivot-1);
        }else{
            return binarySearch(arr,target,pivot+1,arr.length-1);
        }
    }

    static int binarySearch(int []arr,int target,int start,int end){
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]<target){
                start= mid+1;
            } else if (arr[mid]>target){
                end = mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    static int findPivot(int []arr){
        int start= 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(mid<end&&arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(mid>start&&arr[mid]>arr[mid+1]){
                return mid;
            }
            if(arr[start]>=arr[mid]){
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
        return -1;
    }
    static int findPivotDuplicate(int []arr){
        int start= 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(mid<end&&arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(mid>start&&arr[mid]>arr[mid+1]){
                return mid;
            }
            if(arr[start]==arr[mid]&&arr[end]==arr[mid]){
                if(arr[start]>arr[start+1]){
                    return start;
                }
                start++;
                if(arr[end]<arr[end-1]){
                    return end-1;
                }
                end--;
            } else if (arr[start] < arr[mid]||(arr[start]==arr[mid]&&arr[mid]>arr[end])) {
                start = mid+1;
            }else {
                end = mid-1;
            }
        }
        return -1;
    }

}
