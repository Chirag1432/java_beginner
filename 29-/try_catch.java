class Abc
{
public void calculate(int x)
{
int y=10;
int ans = 0;
try
{
ans = y/x;
}
catch(ArithmeticException ae)//specific catch_mtlb_not_for_all_exception
{
System.out.println("please do not divide no. by zero.");
ae.printStackTrace();
}
System.out.println("value of ans:"+ans);
System.out.println("Hi hows u ?");
}
}

class Mymain
{
public static void main(String[] chirag)
{
Abc ob = new Abc();
ob.calculate(2);
ob.calculate(0);
ob.calculate(10);
}
}