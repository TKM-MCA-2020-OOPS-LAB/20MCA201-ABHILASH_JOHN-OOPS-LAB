package CO4Q14;
import java.util.*;
public class q14driver {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();
        dq.add(1);
        dq.add(2);
        dq.add(3);
        System.out.println("Inserting three elements : ");
        for (Integer integer : dq) {
            System.out.println(integer);
        }
        dq.pop();
        System.out.println("After popping : ");
        for (Integer integer : dq) {
            System.out.println(integer);
        }
        dq.remove(3);
        System.out.println("Removing the element 3 :"+dq);
    }
}

