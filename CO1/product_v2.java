// Define a class ‘product’ with data members pcode, pname and price. Create 3 objects of 
// the class and find the product having the lowest price.
public class product_v2 {
int pcode;
String pname;
double price;
product_v2(int code, String name,double rate){
pcode=code;
pname=name;
price=rate;
}
void display(){
    System.out.println(pcode+"\t\t"+pname+"\t\t"+price);
}
static void lowest(double p1, double p2, double p3){
    if(p1<p2&&p1<p3)
    {    
        System.out.println("Product 1 has the lowest price");
    }
    else if(p2<p1&&p2<p3){
        System.out.println("Product 2 has the lowest price");
    }
    else if(p3<p1&&p2>p3)
    {
        System.out.println("Product 3 has the lowest price");

    }
} 
public static void main(String[] args) {
    product_v2 obj1=new product_v2(1,"Shampoo",400);
    product_v2 obj2=new product_v2(2,"Glass",20);
    product_v2 obj3=new product_v2(3,"Book",100);
    System.out.println("\nProduct Information\n\nProduct_Code\tProduct_Name\tProduct_Price");
    obj1.display();
    obj2.display();
    obj3.display();
    lowest(obj1.price,obj2.price,obj3.price);
}
    
}
