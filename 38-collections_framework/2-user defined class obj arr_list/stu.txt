import java.util.*;
class Student
{
String name;
int age;
String batch;
Student(String n,int a,String b)
{
name=n;
age=a;
batch=b;
}
}

class Mymain
{
public static void main(String[] chirag)
{
Student s1 = new Student("chirag",20,"x9");
Student s2 = new Student("anuj",16,"not_joined");
Student s3 = new Student("aadi",19,"iit indore");
ArrayList<Student> al = new ArrayList<Student>();
al.add(s1);
al.add(s2);
al.add(s3);
//for printing

for(Student ob : al)
System.out.println(ob.name+" "+ob.age+" "+ob.batch);
}
}