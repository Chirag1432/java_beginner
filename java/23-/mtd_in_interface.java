interface Abc
{
void show();
default void display()
{
System.out.println("method inside interface:");
}
}

class Pqr implements Abc
{
public void show()
{
System.out.println("method inside class Pqr:");
}

public void display()
{
System.out.println("method overide from interface");
}

}

class Mymain
{
public static void main(String[] chirag)
{
Pqr ob = new Pqr();
ob.display();
ob.show();

Abc ob2 = new Pqr();
ob.display();
ob.show();
}
}