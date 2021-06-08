//Create an Arithmetic package that has classes and interfaces for the 4 basic arithmetic
//operations. Test the package by implementing all operations on two given numbers
package CO4Q2;
import CO4Q2.operations.add;
import CO4Q2.operations.divide;
import CO4Q2.operations.multiply;
import CO4Q2.operations.subtract;

import java.util.Scanner;
public class driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number");
        int a = sc.nextInt();
        System.out.println("Enter the Second Number");
        int b = sc.nextInt();
        add obj1 =new add();
        obj1.cal(a,b);
        subtract obj2 =new subtract();
        obj2.cal(a,b);
        multiply obj3 = new multiply();
        obj3.cal(a,b);
        divide obj4 = new divide();
        obj4.cal(a,b);
    }

}
