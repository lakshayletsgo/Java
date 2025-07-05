import java.util.HashSet;
import java.util.Random;

public class Top150_11 {
    public HashSet<Integer> hashSet ;
    public Random random ;

    public Top150_11() {
        hashSet = new HashSet<>();
        random = new Random();
    }

    public boolean insert(int val) {
        if (hashSet.contains(val)) return false;
        hashSet.add(val);
        return true;
    }

    public boolean remove(int val) {
        if (!hashSet.contains(val)) return false;
        hashSet.remove(val);
        return true;
    }

    public int getRandom() {
        Integer[] arrayNumbers = hashSet.toArray(new Integer[hashSet.size()]);
        return arrayNumbers[random.nextInt(hashSet.size())];
    }
}
