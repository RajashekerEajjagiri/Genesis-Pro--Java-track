import java.util.Scanner;
import java.util.*;

public class Day4A4 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of overs:");
		try {
			
		int no = sc.nextInt();
		System.out.println("Enter the number of runs of each over:");
		int[] runs = new int[no];

		for (int i=0;i<no;i++) {
			runs[i] = sc.nextInt();
		}
		System.out.println("Enter the over number you want:");
		int ov=sc.nextInt();
		System.out.println("Runs scored in this over : "+runs[(ov-1)]);

		}
		catch (Exception e) {
			System.out.println(e);
		}
		}
	
}
