import java.io.DataInputStream;
class Demo2
{
public static void main(String args[])
{
try{
DataInputStream in=new DataInputStream(System.in);
System.out.print("Enter First Number:");
int a=Integer.parseInt(in.readLine());
System.out.print("Enter Second Number:");
int b=Integer.parseInt(in.readLine());
System.out.println(a+"+"+b+"="+(a+b));
}
catch(Exception e){}
}
}

