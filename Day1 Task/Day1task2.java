import java.util.*;
import java.util.Arrays;
public class Day1task2
{
	public static void main(String[] args) { 
	    int n;
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter your no of Employes details you want to check: ");
		n=sc.nextInt();
		if(n<0)
		 System.out.println("Invalid Input");
		int[] ar=new int[n];
		int l=ar.length;
		System.out.println("Enter Employes salaries: ");
		for(int i=0;i<l;i++)
		{
		 
		ar[i]=sc.nextInt();
		
		if(ar[i]<0)
		  System.out.println("Invalid Input");
		}
		  countRepeaters(ar);
		
	}
		static void countRepeaters(int[] ar)
		{
		    
		    int count=0;
		 for(int i=0;i<ar.length;i++)
		 {
		   for(int j=0;j<ar.length-1-i;j++)
		   {
		       if(ar[i]==ar[j])
		       {
		           count+=1;
		       }
		   }
		} 
		System.out.println(count);
		
	       }
	
}
