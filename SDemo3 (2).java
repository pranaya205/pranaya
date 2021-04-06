class Employee
{
public int eid;
public String eName;
Employee(int eid,String eName)
{
eid=eid;
eName=eName;
}
public void display()
{
System.out.println("Emloyee id no:"+eid);
System.out.println("Employee name:"+eName);
}
}
class SDemo3
{
public static void main(String [] args)
{
Employee s1=new Employee(201,"rani");
Employee s2=new Employee(202,"vani");
s1.display();
s2.display();
}
}
