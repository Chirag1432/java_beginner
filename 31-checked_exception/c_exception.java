import java.io.*;
class Abc
{
public void show() throws IOException 
//declared c exception compile time pe check hote 
{
 try
 {
  throw new IOException("inside show wala io exception");
 }
 catch(IOException ae)
 {
 System.out.println(ae.getMessage());
 System.out.println("inside catch show wala");
 throw ae;
 }
}
}
class Mymain
{
public static void main(String[] chirag)
{
  try
     {
       Abc ob = new Abc();
       ob.show();
      }
catch(IOException ae)
{
//System.out.println(ae.getMessage());

System.out.println("inside main ioexception");


}

}
}