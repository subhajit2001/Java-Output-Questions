class Out34
{
public static void main(String args[])
{
String y="123asdfghj@gmail.com";
String str2=y.substring(y.length()-5);
System.out.println(str2);
if(str2.equals(".com"))
{
System.out.println(y.substring(1));
}
else
{
System.out.println("y.length()");
System.out.println(y.substring(1));
}
}
}
