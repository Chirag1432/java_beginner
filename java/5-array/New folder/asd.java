import java.util.*;
class Abc
{
public static void main(String[] chirag)
{
Scanner myscan = new Scanner(System.in);
int[][] arr = new int[3][3];
for(int i=0;i<=2;i++)
{
for(int j=0;j<=2;j++)
arr[i][j]=myscan.nextInt();
}
for(int x[]:arr)
{
for(int z:x)
System.out.println(+z);
}

}
}