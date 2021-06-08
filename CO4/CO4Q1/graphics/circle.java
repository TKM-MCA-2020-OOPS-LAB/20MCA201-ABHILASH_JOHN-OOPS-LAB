package CO4Q1.graphics;

import java.util.Scanner;

public class circle implements  area_cal{
    int radius;
    @Override
    public void area() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input radius of circle : ");
        radius = sc.nextInt();
        String area = Double.toString(Math.PI*radius*radius);
        System.out.println("Area of the circle is : "+area);
        sc.close();
    }
}
