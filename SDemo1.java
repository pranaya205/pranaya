class student
{
private int regno;
private String name;
student (int regno,String name)
{
this.regno=regno;
this.name=name;
}
public void display()
{
System.out.println("register no:"+regno);
System.out.println("name:"+name);
}
}
class SDemo1
{
public static void main(String a[])
{
student s1=new student(201,"sullu");
student s2=new student(202,"vitee");
s1.display();s2.display();
}
}