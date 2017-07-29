import java.io.*;
class Abc
{
public static void main(String[] chirag) throws IOException
{
InputStreamReader is = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(is);
System.out.println("Enter your NAMe:");
String s = br.readLine();
System.out.println("Your name is: "+s);
}
}