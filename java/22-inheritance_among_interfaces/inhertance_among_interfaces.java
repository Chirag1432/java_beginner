interface Abc
{
void show();
}

interface Xyz extends Abc
{
void display();
} 

class Pqr implements Xyz
{
public void show()
{
System.out.println("Abc interface,class Pqr");
}
public void display()
{
System.out.println("Xyz interface,class Pqr");
}
}

class Mymain
{
public static void main(String[] chirag)
{
Pqr ob = new Pqr();
ob.show();
ob.display();

Abc ob1 = new Pqr();
ob1.show();
//ob1.display();//error

Xyz ob2 = new Pqr();
ob2.show();//no error because Xyz interface inherits Abc
ob2.display();
}
}