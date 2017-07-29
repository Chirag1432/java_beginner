class Abc
{
public void show()
{
System.out.println("inside Abc class");
}
}

class Pqr extends Abc
{
public void disp()
{
System.out.println("inside Pqr class");
}
}

class Mymain
{
public static void main(String[] chirag)
{
Pqr ob1 = new Pqr();
ob1.disp();
ob1.show();
}
}




