import java.util.Scanner;
import java.util.*;

abstract class Match{
	private int currentscore;
	private float currentover;
	private int target;
	public void setinfo(int currentscore,float currentover,int target) {
		this.currentscore=currentscore;
		this.currentover=currentover;
		this.target=target;
	}
	public float[] getdata() {
		float[] a = new float[3];
		a[0]=this.currentscore;
		a[1]=this.currentover;
		a[2]=this.target;
		return a;
	}
	abstract public float calculateRunRate(int currentscore,int target,int balls);
	abstract public int calculateBalls(float currentover);
	abstract public void display(double reqRunrate, int balls);
}

class ODIMatch extends Match{
	
	
	public int calculateBalls(float currentover) {
		int tb=300;
		
		int over=(int)currentover;
		
		return (int)(tb-((over*6)+(currentover-over)*10));
	}
	
	
	public float calculateRunRate(int currentscore,int t,int b) {
		float f=(t- currentscore);
		float ball=(b/6);
		float res=f/ball;
		return (res);
	}

	
	public void display(double reqRunrate, int balls) {
		System.out.println("Need " +(float)(reqRunrate*(int)(balls/6))+ "runs in "  +balls+  "balls");
		System.out.println("Required Runrate is " +(float)reqRunrate);
		
	}
	
}

class TestMatch extends Match{
	
	
	public int calculateBalls(float currentover) {
		int tb=540;
		
		int over=(int)currentover;
		
		return (int)(tb-((over*6)+(currentover-over)*10));
	}
	
	
	public float calculateRunRate(int currentscore,int t,int b) {
		float f=(t- currentscore);
		float ball=(b/6);
		float res=f/ball;
		return (res);
	}

	
	public void display(double reqRunrate, int balls) {
		System.out.println("Need " +(int)(reqRunrate*(balls/6))+ "runs in "  +balls + "balls");
		
	}
	
}

class T20Match extends Match{
	
	
	public int calculateBalls(float currentover) {
		int tb=120;
		
		int over=(int)currentover;
		
		return (int)(tb-((over*6)+(currentover-over)*10));
	}
	
	
	public float calculateRunRate(int currentscore,int t,int b) {
		float f=(t- currentscore);
		float ball=(b/6);
		float res=f/ball;
		return (res);
	}

	
	public void display(double reqRunrate, int balls) {
		System.out.println("Need " +(int)(reqRunrate*(balls/6)) + "runs in " + balls + "balls");
		
	}
	
}

class MainMatch{
	MainMatch(){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Match formt : \n1.ODI \n2.T20 \n3.Test");
	int i=sc.nextInt();
	System.out.println("Enter the Current score");
	int currentscore = sc.nextInt();
	System.out.println("Enter the current over");
	float currentover = sc.nextFloat();
	System.out.println("Enter the Target Score");
	int target=sc.nextInt();
	System.out.println("Requirements:");
	
	if(i==1){
			ODIMatch o=new ODIMatch();
			o.setinfo(currentscore, currentover, target);
			int b=o.calculateBalls(currentover);
			double rs = o.calculateRunRate(currentscore, target, b);
			System.out.println(target- currentscore);
			o.display(rs, b);
			
	}
	else if(i==2){
		T20Match o=new T20Match();
		o.setinfo(currentscore, currentover, target);
		int b=o.calculateBalls(currentover);
		double rs = o.calculateRunRate(currentscore, target, b);
		System.out.println(target- currentscore);
		o.display(rs, b);
		
		
	}
	else{
		TestMatch o=new TestMatch();
		o.setinfo(currentscore, currentover, target);
		int b=o.calculateBalls(currentover);
		double rs = o.calculateRunRate(currentscore, target, b);
		System.out.println(target- currentscore);
		o.display(rs, b);
		
	}
	
  }
}

public class Day3task3 {

	public static void main(String[] args) {
		
		new MainMatch();
	}

}