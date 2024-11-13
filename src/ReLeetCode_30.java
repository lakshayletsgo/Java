import java.util.HashMap;

public class ReLeetCode_30 {
    public static void main(String[] args) {
        System.out.println(characterReplacement("AABBAA",2));
    }
    public static int characterReplacement(String s, int k) {
//        HashMap<Character,Integer> map = new HashMap<>();
//        int minLetter= Integer.MAX_VALUE;
//        int maxLetter= Integer.MIN_VALUE;
//
//        for (char ch:s.toCharArray()){
//            map.put(ch,map.getOrDefault(ch,0)+1);
//            minLetter = Math.min(minLetter,(int)ch);
//            maxLetter = Math.max(maxLetter,(int)ch);
//        }
//        int c = 0;
//        int max = 0;
//        int temp =k;
//
//        for (int i=minLetter;i<maxLetter+1;i++){
//            char ch = (char)i;
//            if(map.containsKey(ch)){
//                for (int j=0;j<s.length();j++){
//                    if(s.charAt(j)==ch&&temp>0){
//                        c++;
//                        temp--;
//                    }else if (s.charAt(j)!=ch&&temp>0){
//                        c++;
//                        temp--;
//                    }
//                }
//                max = Math.max(c,max);
//            }
//        }
//        return max;





        int[]arr = new int[26];
        int l=0, max=0,res=0;
        for (int r=0;r<s.length();r++){
            arr[s.charAt(r)-'A']++;
            max = Math.max(max,arr[s.charAt(r)-'A']);
            if (r-l+1-max>k){
                arr[s.charAt(l)-'A']--;
                l++;
            }
            res = Math.max(res,r-l+1);
        }
        return res;
    }
}
