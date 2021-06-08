package CO4Q1.graphics;

import java.util.Scanner;
public class rectangle implements area_cal {
    int l,b;
    @Override
    public void area(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle :");
        l = sc.nextInt();
        System.out.println("Enter the breath of the rectangle");
        b = sc.nextInt();
        System.out.println("Area of the rectangle = "+l*b);
    }
}
