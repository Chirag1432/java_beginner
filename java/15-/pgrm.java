class Abc
{
public void display()
{
System.out.println("inside Abc display");
}
public void show()
{
System.out.println("inside Abc show");
display();
}


}

class Pqr extends Abc
{
public void display()
{
System.out.println("inside Pqr display");
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