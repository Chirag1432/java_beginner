import java.io.*;
class Abc
{
  private int x;
  public void setdata(int y)
	{
		x=y;
	}  

  public void getdata()
	{
	System.out.println("square of "+x+"is:"+(x*x));
	}
}


class Mymain
{
public static void main(String[] chirag) throws IOException
 {
	///InputStreamReader is = new InputStreamReader(System.in);
	///BufferedReader br = new BufferedReader(is);
	//Scanner myscan = new Scanner(System.in);
	Abc ob = new Abc();
	System.out.println("enter the number: ");
	//int z = myscan.nextInt();
	///int z = Integer.parseInt(br.readLine());
	//int z = Integer.parseInt(chirag[2]);
	//ob.setdata(z);
	ob.getdata();
 }

}