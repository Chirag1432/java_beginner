import java.util.*;
class Mymain
{
public static void main(String[] chirag)
{
Scanner myscan=new Scanner(System.in);
HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
HashMap<Integer,String> hm2 = new HashMap<Integer,String>();
int t=myscan.nextInt();

String[] sbt =new String[t];
for(int we=0; we<t; we++)
{
//System.out.println("enter the number of string u want:");
int q= myscan.nextInt();
int count[] =new int[q];


for(int w=0; w<q; w++)
count[w]=0;

//int r=0;
for(int p=0;p<q;p++)
{
hm.clear();
hm2.clear();
//System.out.println("enter the String:");
String n = myscan.next();
//int count=0;
char[] cj = n.toCharArray();
for(char x:cj)
{
if(hm.containsKey(x))
{
//hm.put()
}
else
{
hm.put(x,1);
count[p]++;
}
}
//System.out.println(count[p]);
hm2.put(count[p],n);
} //outer for


/*for(int y=0;y<q;y++)
{
//int cv=;
System.out.println(count[y]);
}*/

Arrays.sort(count);
int srt=count[0];

sbt[we]=hm2.get(srt);


//System.out.println(hm2.get(srt));
//System.out.println(srt);
//int ye=0
//while(srt==count[ye])
//{}


}


for(int op=0;op<t;op++)
System.out.println(sbt[op]);




}
}



