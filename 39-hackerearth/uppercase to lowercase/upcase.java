import java.util.*;

class Mymain
{
public static void main(String[] chirag)
{
Scanner myscan = new Scanner(System.in);
System.out.println("enter the string:");
String s = myscan.next();

char[] c = s.toCharArray();//string ko direct char array mein convert kar diya
System.out.println("display in char array:");

for(char i:c)
{
if(Character.isUpperCase(i))
System.out.print(Character.toLowerCase(i));
else
System.out.print(Character.toUpperCase(i));
}
}
}