class Abc
{
public static void display()
{
System.out.println("inside abc display");
}
}

class Pqr extends Abc
{
public static void display()
{
System.out.println("inside Pqr display");
}
}

class Mymain
{
public static void main(String[] chirag)
{
Pqr.display();
Abc.display();
Abc ob = new Pqr();//mixed object
ob.display();//mtd_hiding
}
}