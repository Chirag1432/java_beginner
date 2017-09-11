import java.util.*;
class Mymain
{
public static void main(String[] chirag)
{
ArrayList<String> al= new ArrayList<String>();//using genric 
al.add("chirag");
al.add("anuj");
al.add("xyz");
al.add("pqr");

//printing through for each loopppp
/*
for(String x:al)
System.out.println(x);
*/
//printing through iterator interface
Iterator itr = al.iterator();
while(itr.hasNext()){
String s = (String)itr.next();//mtlb itr.next() object type mein tha;
System.out.println(s);
}
}
}
