class Out44
{
public static void main(String args[])
{
Out44 a=new Out44();
System.out.print(a.fun(2));
}
public int fun(int x)
{
try
{
int y=50;
return y/x;
}
finally
{
return 10;
}
}
}
