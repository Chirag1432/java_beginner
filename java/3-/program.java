class Abc
{
public static void main(String[] chirag)
{
char c1 = 'd';//UNICODE FORM
char c2 = 84;//NUMERIC FORM
c1++;
c2++;
System.out.println(c1+" "+c2);
double a = 295.04;
int b = 300;
byte c = (byte)a;//295.04-256
byte d = (byte)b;//300-256 jab tak minus karo jab tak range mein ne aa jaata
System.out.println(c+" "+d);

}
}