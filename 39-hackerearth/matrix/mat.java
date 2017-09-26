import java.util.*;
class Mymain
{
public static void main(String[] chirag)
{
Scanner myscan=new Scanner(System.in);
int t = myscan.nextInt();
for(int u=1;u<=t;u++)
{
//System.out.println("Enter the values of N,M and K");
int n=myscan.nextInt();
int m=myscan.nextInt();
int k=myscan.nextInt();
//System.out.println("n:"+n+"m:"+m+"k:"+k);
int[][] a1 = new int[n+1][m+1];
int[][] a2 = new int[m+1][k+1];
System.out.println("Enter array one:");
   for(int i=1;i<n+1;i++)
   {
    for(int j=1;j<m+1;j++)
    {
     a1[i][j]=myscan.nextInt();
    }
     //System.out.print("\n");
   }
   
System.out.println("Enter array two:");

   for(int i=1;i<m+1;i++)
   {
    for(int j=1;j<k+1;j++)
    {
     a2[i][j]=myscan.nextInt();
    }
     //System.out.print("\n");
   }

int[][] a3 = new int[n+1][k+1];
int sum=0;
System.out.println("multiplication:(a1*a2)");
  for(int i=1;i<n+1;i++)
  { 
   for(int j=1;j<k+1;j++)
   {
    sum=0;
   for(int l=1;l<m+1;l++)
	{
	sum = sum + a1[i][l]*a2[l][j];
	}
    a3[i][j]=sum;
   }
  }



   for(int i=1;i<n+1;i++)
   {
    for(int j=1;j<k+1;j++)
    {
	System.out.print(a3[i][j]+" ");     
    }
    System.out.print("\n");
    }

}
}}