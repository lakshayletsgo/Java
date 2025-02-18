import java.util.*;

public class ReLeetCode_102 {
    public static void main(String[] args) {

    }
    Map<Integer, Set<Integer>> fans = new HashMap<>();
    Map<Integer, LinkedList<Tweet>> tweets = new HashMap<>();
    int cnt = 0;

    public void postTweet(int userId, int tweetId) {
        if (!fans.containsKey(userId)) fans.put(userId, new HashSet<>());
        fans.get(userId).add(userId);
        if (!tweets.containsKey(userId)) tweets.put(userId, new LinkedList<>());
        tweets.get(userId).addFirst(new Tweet(cnt++, tweetId));
    }

    public List<Integer> getNewsFeed(int userId) {
        if (!fans.containsKey(userId)) return new LinkedList<>();
        PriorityQueue<Tweet> feed = new PriorityQueue<>((t1, t2) -> t2.time - t1.time);
        fans.get(userId).stream()
                .filter(f -> tweets.containsKey(f))
                .forEach(f -> tweets.get(f).forEach(feed::add));
        List<Integer> res = new LinkedList<>();
        while (feed.size() > 0 && res.size() < 10) res.add(feed.poll().id);
        return res;
    }

    public void follow(int followerId, int followeeId) {
        if (!fans.containsKey(followerId)) fans.put(followerId, new HashSet<>());
        fans.get(followerId).add(followeeId);
    }

    public void unfollow(int followerId, int followeeId) {
        if (fans.containsKey(followerId) && followeeId != followerId) fans.get(followerId).remove(followeeId);
    }

    class Tweet {
        int time;
        int id;

        Tweet(int time, int id) {
            this.time = time;
            this.id = id;
        }
    }
}
