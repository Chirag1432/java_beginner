class mystringbuilder

{

public static void main(String[] args)

{

StringBuilder str1 = new StringBuilder("Hi");


StringBuilder str2 = str1.append(" Hows");


str2.append(" u?");


System.out.println("str1 is "+str1);


System.out.println("str2 is "+str2);


str1.insert(2,",");

System.out.println("str1 is "+str1);


str1.delete(0,2);


System.out.println("Now str1 is "+str1);


str1.deleteCharAt(0);


System.out.println("Now str1 is "+str1);


str1.reverse();


System.out.println("Reversed str1 is "+str1);


System.out.println("str1 is now proper string"+str1.reverse());


}
}



