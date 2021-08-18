import java.util.Scanner;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of matches:");
		int n=sc.nextInt();
		int hal=0;
		int cen=0;
		System.out.println("Enter the match scores:");
		List<Integer> runs = new ArrayList<>();
		for(int i=0;i<n;i++) {
			runs.add(sc.nextInt());			
		}
		for(int a:runs) {
			if(a>49 && a<100) {
				hal+=1;
			}
			if(a>99) {
				cen+=1;
			}
		}
		System.out.println("No Of Half centuries and Centuries: ");
		System.out.println(hal);
		System.out.println(cen);
	}

}
