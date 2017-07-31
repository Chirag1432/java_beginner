class Abc
{
public void display()
{
System.out.println("inside ABC display");
}

public void show()
{
System.out.println("Inside class Abc");
}
}

class Pqr extends Abc
{
public void show()
{
System.out.println("Inside class Pqr");
}
public void print()
{
System.out.println("inside Pqr print");
}
}


class Mymain
{
public static void main(String[] chirag)
{
Abc ob = new Pqr();//upcasting
ob.show();
//ob.print();
ob.display();
}
}