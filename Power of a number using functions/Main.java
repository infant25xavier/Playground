import java.util.Scanner;
class Main{
  public static int pow(int base,int expo)
  {
    int mul=1;
    while(expo!=0)
    {
      mul=mul*base;
      --expo;
    }return mul;
  }
	public static void main (String[] args){
       Scanner in=new Scanner(System.in);
        int base=in.nextInt();
        int expo=in.nextInt();
         int sod=pow(base,expo);
                             System.out.println(sod);
    }
}
      