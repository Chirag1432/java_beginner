class Abc
{
public void calculate(int x)
{
int y=10;
int ans = y/x;
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
ob.calculate(0);//error dekhna (printstacktrace) 
ob.calculate(10);
}
}