import java.util.*;

class TestClass 
{
    
public static void main(String args[] ) throws Exception 
{

        
Scanner myscan = new Scanner(System.in);

int t = myscan.nextInt();
    
for(int i=0;i<t;i++)
        
{
            
String n = myscan.next();
            
int x = n.length();



String z = n.charAt(x-1)+"";
  //IMPORTANT LINE HE 
int y = Integer.parseInt(z);

if((y%2)==0)
             
System.out.println("YES");
            
else
 
System.out.println("NO");
            
        
}      
    
}

}