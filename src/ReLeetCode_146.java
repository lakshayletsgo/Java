import java.util.*;

public class ReLeetCode_146 {
    public static void main(String[] args) {

    }
    public List<String> findItinerary(List<List<String>> tickets) {
        Map<String,List<String>> map = new HashMap<>();
        List<String> ans = new ArrayList<>();
        Deque<String>stack = new ArrayDeque<>();
        for (List<String>ticket:tickets){
            String departure = ticket.get(0);
            String arrival = ticket.get(1);
            map.computeIfAbsent(departure,k->new ArrayList<>()).add(arrival);
        }
        for (List<String>destinations:map.values())destinations.sort(Collections.reverseOrder());
        stack.push("JFK");
        while (!stack.isEmpty()){
            String currentAirport = stack.peek();
            if(map.containsKey(currentAirport)&&!map.get(currentAirport).isEmpty())stack.push(map.get(currentAirport).remove(map.get(currentAirport).size()-1));
            else ans.add(stack.pop());
        }
        Collections.reverse(ans);
        return ans;
    }
}
