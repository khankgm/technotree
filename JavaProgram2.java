/* Java Program Example - Check Original Equals Reverse or Not */
		
import java.util.Scanner;

public class JavaProgram
{
    public static void main(String args[])
    {
       int num, orig, rev=0, rem;
       Scanner scan = new Scanner(System.in);
	   
       System.out.print("Enter a Number : ");
       num = scan.nextInt();
	   
       orig=num;
	   
       while(num>0)
       {
           rem = num%10;
           rev = rev*10 + rem;
           num = num/10;
       }
       if(orig == rev)
       {
           System.out.print("Reverse is Equal to Original");
       }
       else
       {
           System.out.print("Reverse is not Equal to Original");
       }
    }
}
