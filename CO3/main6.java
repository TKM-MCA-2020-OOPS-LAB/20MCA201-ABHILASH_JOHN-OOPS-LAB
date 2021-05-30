// Create an interface having prototypes of functions area() and perimeter(). Create two 
// classes Circle and Rectangle which implements the above interface. Create a menu driven 
// program to find area and perimeter of objects.
import java.util.Scanner;
interface common{
	public void data_input();
	public void area();
	public void perimeter();
	
}

class circle implements common
{
int r;
double pi=3.14,area,Perimeter;
@Override
public void data_input() 
{
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the radius of circle");
	r=sc.nextInt();
    sc.close();
}
	@Override
		public void area() {
		area=pi*r*r;
		System.out.println("Area of circle:"+area);
		
	}
	@Override
		public void perimeter() {
			Perimeter=2*pi*r;
		System.out.println("Perimeter of circle:"+Perimeter);
		
		
	}
}
class Rectangle extends circle{
	int area,Perimeter,b,l;
    @Override
	public void data_input()
	{
		super.data_input();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the length of rectangle");
	l=sc.nextInt();
	System.out.println("Enter the breadth of rectangle");
	b=sc.nextInt();
    sc.close();
	}

	@Override
	public void area()
	{
		area=l*b;
		System.out.println("area of the rectangle is:"+area);
	}
	@Override
	public void perimeter() 
	{
		Perimeter=2*(l+b);
		System.out.println("area of the rectangle is:"+Perimeter);
		
	}
	}

public class main6{
	public static void main(String[] args) {
		
		Rectangle obj2=new Rectangle();
		int choice=0;
		while(choice<3) 
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("....Enter the choice...\n1.Circle:\n2.Rectangle: ");
		choice=sc.nextInt();
        sc.close();
		switch(choice) 
		{
		case 1:
			obj2.data_input();
			obj2.area();
			obj2.perimeter();
			break;
		case 2:
			obj2.data_input();
			obj2.area();
			obj2.perimeter();
			break;
		 default:
			 System.out.println("INVALID CHOICE!");
		}
	 }
	  
	}


}
