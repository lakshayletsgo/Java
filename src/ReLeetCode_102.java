import java.util.*;

public class ReLeetCode_102 {
    public static void main(String[] args) {

    }
    private static int timeStamp =0;
    private Map<Integer,User> userMap;
    private class Tweet{
        public int time ;
        public int id ;
        public Tweet next ;
        public Tweet(int id){
            this.id = id;
            next = null;
            time = timeStamp++;
        }
    }
    private class User{
        public int id;
        public Set<Integer> followed;
        public Tweet tweet_head;
        public User(int id) {
            this.id = id;
            followed = new HashSet<>();
            tweet_head = null;
            follow(id);
        }
        public void follow(int id) {followed.add(id);}
        public void unfollow(int id) {followed.remove(id);}
        public void post(int id) {
            Tweet t = new Tweet(id);
            t.next = tweet_head;
            tweet_head = t;
        }
    }
    public ReLeetCode_102() {
        userMap = new HashMap<>();
    }

    public void postTweet(int userId, int tweetId) {
        if (!userMap.containsKey(userId)){
            User u = new User(userId);
            userMap.put(userId,u);
        }
        userMap.get(userId).post(tweetId);
    }


    public List<Integer> getNewsFeed(int userId) {
        List<Integer> list = new LinkedList<>();
        if (!userMap.containsKey(userId)) {return list;}
        Set<Integer> users=  userMap.get(userId).followed;
        PriorityQueue<Tweet> q = new PriorityQueue<Tweet>(users.size(),(a,b)->(b.time-a.time));
        for (int user:users){
            Tweet t = userMap.get(user).tweet_head;
            if (t!=null)q.add(t);
        }
        int n=0;
        while (!q.isEmpty()&&n<10){
            Tweet t = q.poll();
            list.add(t.id);
            n++;
            if (t.next!=null)q.add(t.next);
        }
        return list;
    }

    public void follow(int followerId, int followeeId) {
        if (!userMap.containsKey(followerId)){
            User u = new User(followerId);
            userMap.put(followerId,u);
        }
        if (!userMap.containsKey(followeeId)){
            User u = new User(followeeId);
            userMap.put(followeeId,u);
        }
        userMap.get(followerId).follow(followeeId);
    }

    public void unfollow(int followerId, int followeeId) {
        if (!userMap.containsKey(followerId)||followerId==followeeId)return;
        userMap.get(followerId).unfollow(followeeId);
    }

}
