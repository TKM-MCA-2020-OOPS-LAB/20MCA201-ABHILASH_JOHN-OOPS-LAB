package CO4Q12;
import  java.util.*;

public class q12driver {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(11);
        st.push(22);
        st.push(33);
        st.push(44);
        System.out.println("Stack = "+st);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the position : ");
        int x = sc.nextInt();
        st.remove(x);
        System.out.println("Stack = "+st);
    }
}
