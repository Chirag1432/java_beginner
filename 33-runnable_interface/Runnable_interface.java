class Abc_runnable implements Runnable
{
Thread t;
Abc_runnable()
{
t=new Thread(this,"CHILD_THREAD");
System.out.println("child thread:"+t);
t.start();
}
public void run()
{
try{
for(int i=5;i>0;i--)
{
System.out.println("Child thread he:  "+i);
Thread.sleep(4000);
}
}
catch(InterruptedException ie)
{
System.out.println(ie);
}
}
}

class Mymain
{
public static void main(String[] chirag)
{
System.out.println("Main thread will exexcute at first");
Abc_runnable ar = new Abc_runnable();

try
{
for(int i=5;i>0;i--)
{
System.out.println("Main Thread: "+i);
Thread.sleep(1000);
}			
}
catch(InterruptedException ie)
{
System.out.println(ie);
}

System.out.println("it is not compulsory that main thread exits at last");


}

}