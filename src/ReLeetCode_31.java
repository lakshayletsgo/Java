import java.util.HashMap;

public class ReLeetCode_31 {
    public static void main(String[] args) {
        System.out.println(checkInclusion("ab","eidbaooo"));
    }
    public static boolean checkInclusion(String s1, String s2) {
//        HashMap<Character,Integer> map1 = new HashMap<>();
//        HashMap<Character,Integer> map2 = new HashMap<>();
//
//        for (char ch:s1.toCharArray()){
//            map1.put(ch,map1.getOrDefault(ch,0)+1);
//
//        }
//        for (int i=0;i<s2.length();i++){
//            if(!map1.containsKey(s2.charAt(i))){
//                return false;
//            }else{
//                for (int j=i;j<s1.length();j++){
//                    if(!map1.containsKey(s2.charAt(j))&&((map1.get(s2.charAt(i))<=0))){
//                        return false;
//                    }
//                    map1.put(s2.charAt(j), map1.get(s2.charAt(j))-1);
//                }
//            }
//        }
//        return true;

        int[] freq = new int[26];
        for(int i=0;i<s1.length();i++){
            freq[s1.charAt(i)-'a']++;
        }
        int start=0;
        int end=0;
        while(end<s2.length()){

            freq[s2.charAt(end)-'a']--;
            while(freq[s2.charAt(end)-'a']<0){
                freq[s2.charAt(start)-'a']++;
                start++;
            }
            boolean flag = true;
            for(int i=0;i<26;i++){
                if(freq[i]!=0){
                    flag = false;
                    break;
                }
            }
            if(flag && end-start+1==s1.length()) return true;
            end++;
        }
        return false;

    }
}
