public class Out43
{
public static int func(String str)
{
int i=0;
for(char c:str.toCharArray())
{	i++;}
return i;
}
public static void main(String args[])
{
String s="dev";
System.out.print(func(s));
}
}
