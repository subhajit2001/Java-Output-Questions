class BoxDemo
{
public static void main(String args[])
{
Box mybox=new Box(10,20,15);
double vol;
//mybox.width=10;
//mybox.height=20;
//mybox.depth=15;
vol=mybox.volume();
System.out.println("Volume is"+vol);
}
}
class Box
{
private double width;
private double height;
private double depth;
Box(double w,double h,double d)
{
width=w;
height=h;
depth=d;
}
double volume()
{
double vol=width*height*depth;
return vol;
}
protected void finalize()
{
System.out.println("The object is destroyed");
}
}

