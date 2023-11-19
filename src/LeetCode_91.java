//https://leetcode.com/problems/count-items-matching-a-rule/submissions/1102201475/
//This was also easy in this I just have to check for the given list whether there are present at the smae spot or not
import java.util.List;
import java.util.Objects;

public class LeetCode_91 {
    public static void main(String[] args) {

    }
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int c=0;
        for(List<String> temp:items){

                if(Objects.equals(ruleKey, "type")){
                    if(Objects.equals(temp.get(0), ruleValue)){
                        c++;
                    }
                } else if (Objects.equals(ruleKey, "color")) {
                    if(Objects.equals(temp.get(1), ruleValue)){
                        c++;
                    }
                }else if (Objects.equals(ruleKey, "name")) {
                    if(Objects.equals(temp.get(2), ruleValue)){
                        c++;
                    }
                }



        }
        return c;
    }
}
