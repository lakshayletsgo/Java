import java.util.*;
public class Top150_45 {
    public boolean isHappy(int n) {

        int temp = n;
        Set<Integer> set = new HashSet<>();
        int ans=0;
        set.add(n);


        while(true){
            while(temp>0){
                int rem = temp%10;
                temp=temp/10;
                ans =ans+( rem*rem);
            }
            if(ans==1){return true;}
            if(!set.contains(ans)){
                set.add(ans);
                temp = ans;
                ans =0;
            }else return false;

        }

    }
}
