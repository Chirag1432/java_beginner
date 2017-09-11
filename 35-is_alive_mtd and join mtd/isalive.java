class alive_thread extends Thread
{
	public void run()
        {
       		System.out.println("r1 ");
       		
		try
		{
	       	   Thread.sleep(1000);
    		   //System.out.println(t2.isAlive());
		}
		catch(InterruptedException ie){}
       
  	     System.out.println("r2 ");
  	}

	public static void main(String[] args)
	{
		
		alive_thread t1=new alive_thread();
		alive_thread t2=new alive_thread();
  		try{
		System.out.println(t2.isAlive());
		t1.start(); 
System.out.println(t1.isAlive());
		t1.join();
   		System.out.println(t1.isAlive());
		t2.start();
		}
		catch(Exception e){ }	
		try{
		Thread.sleep(7000);
		}
		catch(Exception e){}
		
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
	}
}
