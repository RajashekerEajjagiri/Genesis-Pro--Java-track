import java.util.*;
public class Day1task1
{
	public static void main(String[] args) { 
	    int sal,ns,savings;
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter your salary: ");
		sal=sc.nextInt();
		System.out.println("Enter your number of Shifts: ");
		ns=sc.nextInt();
		
		if(sal>8000)
		{
		    System.out.println("Salary too Large ");
		}
		if(ns<0)
		{
		    System.out.println("Shifts too small");
		} 
		
		if(sal<0)
		{
		    System.out.println("Salary too small");
		}
		
		calculate(sal,ns);
		
	}
		static void calculate(int salary,int Shifts)
		{
		  int spd=(2*salary/100)*Shifts; //cal of other shifts 2% per day
		  int savings=(50*salary/100)+spd;
		  System.out.println("");
		  System.out.println("Ramya savings was:"+savings);
		}
	
}
