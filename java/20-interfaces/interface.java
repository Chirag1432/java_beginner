interface Abc
{
float pi = 3.14f;
void show();
}

class Pqr implements Abc
{
public void show()
{
System.out.println("This is Show mtd of Abc interface implemented by Pqr class ");
}
public void display()
{
System.out.println("inside display of Pqr class");
}
}

class Mymain
{
public static void main(String[] chirag)
{
Abc ob = new Pqr();
ob.show();
//ob.display();
System.out.println("value of pi is:"+Abc.pi);
}
}