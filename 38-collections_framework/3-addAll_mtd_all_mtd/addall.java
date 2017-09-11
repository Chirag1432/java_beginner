//add list2 to list1

import java.util.*;
class mymain
{
public static void main(String[] chirag)
{
ArrayList<String> list1 = new ArrayList<String>();
list1.add("chirag");
list1.add("gupta");
list1.add("list1");

System.out.println("printing element of list1");
for(String a:list1)
System.out.println(a);
ArrayList<String> list2 = new ArrayList<String>();
list2.add("chirag");
list2.add("gupta");
list2.add("list2");


System.out.println("printing element of list2");
for(String a:list2)
System.out.println(a);


System.out.println("on combining both list using addAll method");
list1.addAll(list2);


System.out.println("using removeAll mtd");
list1.removeAll(list2);
System.out.println("After removing");
for(String a:list1)
System.out.println(a);


System.out.println("\n\n\n");
System.out.println("on retaining both list using retainAll method");
list1.retainAll(list2);

System.out.println("using retainAll mtd");
list1.retainAll(list2);
System.out.println("After retaining");

for(String a:list1)
System.out.println("checking"+a);

}
}

