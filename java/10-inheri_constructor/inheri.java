class Abc
{
public Abc()
{
System.out.println("inside Abc constructor");
}
}

class Pqr extends Abc
{
public Pqr()
{
System.out.println("inside pqr constructor");
}
}

class Xyz extends Pqr
{
public Xyz()
{
System.out.println("inside Xyz constructor");
}
}

class Mymain
{
public static void main(String[] chirag)
{
Xyz ob = new Xyz();
}
}

