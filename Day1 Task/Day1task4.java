import java.util.*;
import java.util.Arrays;
public class Day1task4
{
	public static void main(String[] args) {
	    int n;
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an array:");
		n=sc.nextInt();
		
		if(n<0)
		    System.out.println("Invalid array size");
		int[] med=new int[n];
		int[] hel=new int[n];
		for(int i=0;i<n;i++)
		{
		   med[i]=sc.nextInt();
		   
		   if(med[i]<0){
		    System.out.println("Invalid Input");
		    System.exit(0);}
		}
		
		for(int i=0;i<n;i++)
		{
		   hel[i]=sc.nextInt();
		   
		   if(hel[i]<0){
		    System.out.println("Invalid Input");
		    System.exit(0);} 
		}
		
		highestFeedBack(med,hel,n);
	}
	
	   static void highestFeedBack(int medical[],int healthcare[],int size)
	  {
	       for(int i=0; i<size; i++) 
		{ 
		
			if(medical[i]==0 && healthcare[i]==0) {
				continue;
			   }
				if(medical[i]>healthcare[i]) {
					System.out.println(i+1);
					System.out.println(medical[i]);
				}
				else {
					System.out.println(i+1);
					System.out.println(healthcare[i]);
				}
				
					
			
		}
	       
	  
	  }
}
