//Array list
//Array list are used because in array we can't rearrange fast enough if we delete a midddle array value and wants to remove them
// .size() length deta hai
// .add() value add karta hai
// .get() value deta hai
// .addAll() use karke ham ek array list me dusri ko add bhi kar skte hai aur pehle index ki kisme dalna hai aur phir arraylist ka naam
// agr hame kissi particular index pe add karna hai toh .add() me hi pehle index likh de

// .clear() method se Ham ek array list ko clear bhi kar skte hai
// .contains() isse ham pata kar skte hai ki ek element ek arraylist me hai ya nahi  (Yeh boolean type value return karta hai )
// .indexOf() yeh hame kissi element ka index batata hai
// .lastIndexOf() hame kissi arraylist me last index dega of an element
// .set() isse ham ek particular index par value change kar skte hai
import java.util.*;
public class Java_41 {
    public static void main(String[] args) {
        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(23);
        l2.add(43);
        l2.add(12);
        l2.add(76);
        l2.add(0,12);
        l2.add(0,13);

        ArrayList<Integer> l1 =  new ArrayList<>();
        l1.add(1);
        l1.add(4);
        l1.add(7);

        l2.addAll(2,l1);

        l1.clear();
        System.out.println(l2.indexOf(4));
        System.out.println(l2.contains(23));
        System.out.println(l2.lastIndexOf(12));
        l2.set(1,24);
//        Ab value 13 0 index pe hogi
        for(int i=0;i<l2.size();i++){
            System.out.print(l2.get(i));
            System.out.print(",");
        }

    }
}
