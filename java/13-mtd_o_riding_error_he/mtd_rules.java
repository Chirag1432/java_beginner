import java.io.*;
class Abc
{
public void show() throws Exception
{
System.out.println("inside Abc show(overriden_mtd)");
}
}

class Pqr extends Abc
{
public void show() throws IOException
{
System.out.println("inside Pqr show(overriding_mtd)");
}
}

class Mymain
{
public static void main(String[] chirag)
{
Pqr ob = new Pqr();
ob.show();
}
}