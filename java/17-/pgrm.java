class Abc
{
public static void display()//same as 15(static word added)
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
public static void display()
{
System.out.println("inside Pqr display");
}

}


class Mymain
{
public static void main(String[] chirag)
{
Pqr obj = new Pqr();
obj.show();//mtd_hiding rule 1 overriding wala
Abc ob = new Pqr();
ob.show();

}


}