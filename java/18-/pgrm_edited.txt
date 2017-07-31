class Abc
{
public static void display()
{
System.out.println("inside Abc display");
}
public void show(Pqr x)
{
System.out.println("inside Abc show");
x.display();
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
Pqr ob = new Pqr();
ob.show(ob);
}

//meko chiye ke pqr display he call ho 
}