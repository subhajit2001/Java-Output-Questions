public class Instance
{
{
System.out.print("Hello");
System.out.print("Instance Init");
}
Instance(int a,int b)
{
System.out.println(a+b);
}
Instance()
{
System.out.print("Done");
}
public static void main(String[] args)
{
//Instance i=new Instance();
Instance i2=new Instance(10,20);
}
}
