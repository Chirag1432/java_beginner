abstract class Abc
{
abstract public void show();
public void display()
{
System.out.println("inside Abc display:");
}
}
class Pqr extends Abc
{
public void show()
{
System.out.println("inside Pqr show");
}
public void display()
{
System.out.println("inside Pqr display:");
}
}

class Mymain
{
public static void main(String[] chirag)
{
Abc ob = new Pqr();
ob.display();
ob.show();
}
}