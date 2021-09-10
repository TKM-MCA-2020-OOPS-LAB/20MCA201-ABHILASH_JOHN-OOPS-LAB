package CO4Q17;
import java.util.*;
public class q17driver {
    public static void main(String args[])
    {
        Map<Integer, String> hm2= new HashMap<Integer, String>();
        hm2.put(new Integer(1), "All");
        hm2.put(new Integer(2), "are");
        hm2.put(new Integer(3), "Equal");

        System.out.println(hm2);
        hm2.put(new Integer(2), "Core");
        System.out.println(hm2);

        hm2.remove(new Integer(1));
        System.out.println(hm2);
    }
}