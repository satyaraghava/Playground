import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   Scanner sc= new Scanner(System.in);
      int n= sc.nextInt();
      for(int fact = 1; fact<=n ;fact++)
      if(n % fact == 0)
      {
      System.out.println(fact);
      }
     }
}