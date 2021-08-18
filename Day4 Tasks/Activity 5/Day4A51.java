import java.util.ArrayList;
import java.util.Scanner;

public class Day4A51 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<String> s13= new ArrayList<>();
		System.out.println("Enter the top 5 players name in IPL season 13:");
		for (int i=0;i<5;i++) {
			s13.add(sc.nextLine());
		}
		ArrayList<String> s12=new ArrayList<>();
		System.out.println("Enter the top 5 player names in IPL season 12:");
		for(int i=0;i<5;i++)
		{
			s12.add(sc.nextLine());
		}
		System.out.println("Consistent run scorers :");
		for(String i:s13) {
			for(String j:s12) {
				if(i.equals(j)) {
					System.out.println(i);
				}
			}
		}
		

	}

}