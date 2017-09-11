class mymultithread implements Runnable
{
	String name;
	Thread t;

	mymultithread(String n)
	{
		name = n;

		t = new Thread(this,n);

		System.out.println("New Thread: "+t);
		t.start();
	}

	public void run()
	{
		try
		{
			for(int i=5;i>0;i--)
			{
		System.out.println("\n"+name+" : "+i);
				Thread.sleep(2000);
			}			
		}
		catch(InterruptedException ie)
		{
			System.out.println(ie);
		}
				
		System.out.println("\n"+name+" exiting");
	}
}

class mymain
{
	public static void main(String[] args)
	{
		new mymultithread("ONE");

		new mymultithread("TWO");

		new mymultithread("THREE");	

		try
		{
			for(int i=5;i>0;i--)
			{
				System.out.println("\n Main Thread: "+i);
				Thread.sleep(6000);
			}			
		}
		catch(InterruptedException ie)
		{
			System.out.println(ie);
		}

		System.out.println("\n Main Thread Exiting");		
	}
}
