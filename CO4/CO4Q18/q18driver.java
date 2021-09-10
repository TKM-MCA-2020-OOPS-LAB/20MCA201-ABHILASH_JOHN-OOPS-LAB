package CO4Q18;

import java.util.*;

public class q18driver {

    public static void main(String args[]) {

        Map<String, String> map = new HashMap<>();
        System.out.println("Enter the limit:");
        Scanner inp = new Scanner(System.in);
        int n= inp.nextInt();
        System.out.println("Enter the Roll number and Name");
        while(n!=0) {

            String e= inp.next();
            String s= inp.next();
            map.put(e, s);
            n--;
        }

        System.out.println("HashMap:"+map);
        Map<String, String> treeMap = new TreeMap<>();
        treeMap.putAll(map);
        System.out.println("TreeMap:"+treeMap);
    }
}
