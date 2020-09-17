import com.address.Address;
import com.person.Person;
class Employee
{
Address add;
Person p1;
Employee(String name, int age, String addr)
{
add = new Address(addr);
p1 = new Person(name, age);
add.show();
p1.show();
}
public static void main(String args[])
{
Employee ob = new Employee("Subhajit Saha", 18, "Kolkata, West Bengal, India");
}
}
