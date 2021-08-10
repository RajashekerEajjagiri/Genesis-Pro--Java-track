import java.util.*;
public class Ramya
{
	public static void main(String[] args) { 
	    int salary,ns,savings;
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter your salary: ");
		salary=sc.nextInt();
		System.out.println("Enter your number of Shifts: ");
		ns=sc.nextInt();
		
		
		if(salary>8000)
		{
		    System.out.println("Salary too Large ");
		}
		if(ns<0)
		{
		    System.out.println("Shifts too small");
		} 
		
		if(salary<0)
		{
		    System.out.println("Salary too small");
		}
		
		  int spd=(2*salary/100)*ns; //cal of other shifts 2% per day
		  savings=(50*salary/100)+spd;
		  System.out.println("");
		  System.out.println("Ramya savings was:"+savings);
	
	}
}
