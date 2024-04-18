class OverloadDemo
{
    void area(float x)
    {
        System.out.println("Area of the square is "+x*x+" sq units");
    }
    void area(float x, float y)
    {
        System.out.println("Area of the rectangle is "+x*y+" sq units");
    }
    void area(double x)
    {
        double z = 3.14*x*x;
        System.out.println("Area of the circle is "+z+" sq units");
    }
}
class Overload 
{
     public static void main(String args[]) 
	{
	   OverloadDemo ob = new OverloadDemo();
	   ob.area(5);
	   ob.area(10,20);
	   ob.area(2.5);
        }
}

