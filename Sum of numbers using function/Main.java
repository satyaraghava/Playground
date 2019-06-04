import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      System.out.println(sum_of_a_number(n));
    } 
  public static int sum_of_a_number(int a)
   {
   int sum=0;
    for(int i =1; i<=a; i++)
    {
    sum = sum+i;
    }
   return sum;
   }
}