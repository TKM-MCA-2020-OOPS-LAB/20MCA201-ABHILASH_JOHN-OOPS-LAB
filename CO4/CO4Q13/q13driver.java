package CO4Q13;

import java.util.PriorityQueue;

public class q13driver {
    public static void main(String[] args) {
        PriorityQueue <Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(20);
        pq.add(15);
        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq.peek());
    }
}
