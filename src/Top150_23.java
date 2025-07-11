public class Top150_23 {
    public int strStr(String haystack, String needle) {
        int p1=0,p2=0;
        for(int i=0,j=needle.length();j<=haystack.length();i++,j++){
            if(haystack.substring(i,j).equals(needle))return i;
        }
        return -1;
    }
}
