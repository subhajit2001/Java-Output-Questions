class Test
{
int x=1;
static int y=3;
public static void main(String args[])
{
Test t1=new Test();
Test t2=new Test();
System.out.println(t1.x);
System.out.println(t1.y);
System.out.println(t2.x);
System.out.println(t2.y);
t1.x+=2;
t1.y+=2;
System.out.print(t1.x);
System.out.println(t2.x);
System.out.print(t2.y);
System.out.println(t1.y);
}
}
