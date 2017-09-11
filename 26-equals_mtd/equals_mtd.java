class Student
{
private int roll_no;
public Student(int r)
{
roll_no = r;
}

@Override

public boolean equals(Object o)
{
if(!(o instanceof Student))
{
Student ref = (Student) o;
return this.roll_no == ref.roll_no;
}
@Override
public String toString()
{
return"Roll NO :" + roll_no;
}
}

class Mymain
{
public static void main(String[] chirag)
{
Student ob1 = new Student(12);
Student ob2 = new Student(23);

if(ob1.equals(ob2))
System.out.println("Both object are equal");
else
{
System.out.println("Both object are notequal");
System.out.println("For ob1"+ob1);
System.out.println("For ob2"+ob2);
} 

}

}
