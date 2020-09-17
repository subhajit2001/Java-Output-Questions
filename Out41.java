class A
{
public void hello()
{
System.out.println("Hello");
}
public static void main(String args[])
{
A obj=new A();
obj.hello();
}
//String str="hello";
//Hello.main();
}
class Hello
{
public static void main()
{
System.out.println("In another main");
A ob=new A();
ob.hello();
}
}

