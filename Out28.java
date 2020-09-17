class Example
{
private int x=10;
public static void main(String args[])
{
Example obj=new Example();
obj.Example();
obj.Example();
}
public void Example()
{
System.out.println(x);
this.x=this.x+2;
}
}
