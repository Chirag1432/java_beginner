class Abc
{
@Override
public String toString()
{
return"This is Abc class Object:";
} 
}

class Pqr extends Abc
{
@Override
public String toString()
{
return"This is Pqr class Object:";
} 
}

class Mymain
{
public static void main(String[] chirag)
{
Abc ob1 = new Abc();
Pqr ob2 = new Pqr();
Abc ob3 = new Pqr();
System.out.println(ob1);
System.out.println(ob2);
System.out.println(ob3);
}
}