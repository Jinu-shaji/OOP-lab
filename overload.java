import java.util.*;
class overloadDemo
{
    void area(float x)
    {
		
		
        System.out.println("Area of the square is = "+Math.pow(x, 2));
    }
    void area(float x, float y)
    {
        System.out.println("Area of the rectangle is = "+x*y);
    }
    void area(double x)
    {
        double z = 3.14 * x * x;
        System.out.println("Area of the circle is = "+z);
    }
}
class overload 
{
     public static void main(String[] args) 
	{
		Scanner num=new Scanner(System.in);
		float side,l,b;
		double r;
		System.out.println("\n Enter the side of square : ");
        side=num.nextFloat();
		System.out.println("\n Enter length of rectangle : ");
        l=num.nextFloat();
		System.out.println("\n Enter the breadth of rectangle: ");
        b=num.nextFloat();
		System.out.println("\n Enter the radius of circle : ");
        r=num.nextDouble();
	   overloadDemo ob = new overloadDemo();
	   ob.area(side);
	   ob.area(l,b);
	   ob.area(r);
        }
}