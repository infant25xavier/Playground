import java.util.Scanner;
class Main
{
	public static int square (int a)
    {
      return (a*a);
    }
	public static void main(String args[])
    {
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int sod=square(n);
      System.out.println(sod);
	} 
}