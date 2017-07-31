interface Abc
{
void show();
}

interface Xyz
{
void display();
}

class Pqr implements Abc,Xyz
{
public void show()
{
System.out.println("This is Show mtd of Abc interface implemented by Pqr class ");
}
public void display()
{
System.out.println("This is Show mtd of Xyz interface implemented by Pqr class ");
}
}

class Mymain
{
public static void main(String[] chirag)
{
Pqr ob = new Pqr();
ob.display();
ob.show();

Xyz ob1 = new Pqr();
ob1.display();
//ob1.show();//error because of abstract mtd

Abc ob2 = new Pqr();
ob2.show();
//ob2.display();//error because of abstract mtd
}
}