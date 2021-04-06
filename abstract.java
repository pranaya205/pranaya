abstract class shape
{
int length,breadth,radius;
Scanner input=new Scanner(System.in);
abstract void printarea();
}
class rectangle extends shape
{
void printarea()
{
System.out.println("\n finding the area of rectangle");
System.out.println("enter length and breadth");
length=input.nextint();
breadth=input.nextint();
System.out.println("the area of rectangle is:"+length*breadth);
}
}
class circle extends shape
{
void printarea()
{
System.out.println("\nfinding the area of circle");
System.out.println("enter radius");
radius=input.nextint();
System.out.println("the area of circle is:"+3.14f*radius*radius);
}
}
class square extends shape
{
void printarea()
{
System.out.println("\nfinding the area of square");
System.out.println("enter side");
radius=input.nextint();
System.out.println("the area of circle is:"+side*side);
}
}
class abstract
{
public static void main(String []args)
{
circle cir=new circle();
cir.printarea();
square squ=new square();
squ.printarea();
rectangle rec=new rectangle();
rec.printarea();
}
}