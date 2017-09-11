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
catch(Exception ae)//genralised catch block mtlb sab exception ke liye
{
//System.out.println("please do not divide no. by zero.");
System.out.println("EXCEPTION IS"+ae+"\nmsg is"+ae.getMessage());
ae.printStackTrace();
}

/*catch(ArithmeticException ae)//specific catch_mtlb_not_for_all_exception
{//UNREACHABLE CODE mtlb COMPILE TIME ERROR
System.out.println("please do not divide no. by zero.");
ae.printStackTrace();
}*/

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