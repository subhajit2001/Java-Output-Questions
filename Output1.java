public class Test
{
public void myMethod(Object o)
{
System.out.println("My Object");
}
public void myMethod(String s)
{
System.out.println("My String");
System.out.println(s);
}
public static void main(String args[])
{
Test t = new Test();
t.myMethod(null);
}
}
