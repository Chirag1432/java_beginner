import java.util.*;
class Mymain
{
public static void main(String[] chirag)
{
Scanner myscan=new Scanner(System.in);
int t=myscan.nextInt();
for(int j=0;j<t;j++)
{
System.out.println("ENter the no. of ammo units:");
int am=myscan.nextInt();
System.out.println("enter the no. of obstacles");
int ob = myscan.nextInt();
int[] a = new int[ob+1];


for(int i=1;i<ob+1;i++)
a[i] = myscan.nextInt();
int sum = am;
for(int i=1;i<=ob;i++)
{
if((sum>0)&&a[i]==1)
{
sum=sum+3-1;
 if(i==ob)
 System.out.println("Yes"+" "+sum);  
}

else if((sum>0)&&a[i]==0) 
{
sum=sum-1;
 if(i==ob)
 System.out.println("Yes"+" "+sum);
}
else if((sum==0)&&(i==ob))
{
 System.out.println("Yes"+" "+sum);
}
else{
System.out.println("No"+" "+(i-1));
break;
}
}//for close inner

}//for close test case
}
}