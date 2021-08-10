import java.util.*;

public class Day1task3
{
	public static void main(String[] args) {
	    
	    int n;
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter travelld Distance:");
		n=sc.nextInt();
		if(n<0)
		    System.out.println("Invalid Input");
		else    
		 productDigits(n);
	}  
	
	    static void  productDigits(int p)
	    {
	        int r,sum=1;
	        while(p!=0)
	        {
	         r=p%10;
	         sum*=r;
	         p=p/10;
	        }
	        System.out.println(sum);
	    }
}
