package CO4Q15;

import java.util.*;

public class q15driver {
    public static void main(String[] args) {
        LinkedHashSet <Integer> HS = new LinkedHashSet<>();
        HS.add(1);
        HS.add(2);
        HS.add(3);
        HS.add(4);
        HS.add(5);
        System.out.println("Set = "+HS);
        HS.remove(5);
        System.out.println("Set = "+HS);
        int x=HS.size();
        System.out.println("Size of set object= "+x);
        HS.remove(2);
        System.out.println("Set = "+HS);

    }
}
