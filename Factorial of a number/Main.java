import java.util.Scanner;
class Main{
	public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
      int a= sc.nextInt();
      int fact=1;
      for(int count = 1; count<=a; count++)
      {
      fact = fact *count;
      }
	  System.out.println(fact);
    }
}