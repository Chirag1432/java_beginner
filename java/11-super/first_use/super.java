class Abc
{
private int c,v;
//public Abc(int x, int y)
//{
//c=x;
//v=y;
//}

public void display1()
{
System.out.println("values of c and v are"+c+" "+v);
}
}

class Pqr extends Abc
{
private int b,n;
public Pqr(int p, int q)//,int a,int s)
{
//super(a,s);
b=p;
n=q;
}

public void display()
{
System.out.println("values of b and n are"+b+" "+n);
}
}

class Mymain
{
public static void main(String[] chirag)
{
Pqr ob = new Pqr(10,20);//,30,40);
ob.display1();
ob.display();
}
}