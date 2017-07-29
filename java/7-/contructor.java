class Abc
{
private int x;
public Abc(int x)
  {
   this.x=x;
  }
public void getdata()
   {
    System.out.println("square:"+(x*x));
   }
}

class Mymain
{
public static void main(String[] chirag)
{
Abc ob1;
Abc ob2 = new Abc(7);
//ob1.getdata();
ob2.getdata();
}

}
