import java.util.HashSet;
import java.util.Scanner;

public class Day4A53{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of players you want to be entered:");
		int n=sc.nextInt();
		sc.nextLine();
		HashSet<String> players = new HashSet<>();
		for (int i=0;i<n;i++) {
			players.add(sc.nextLine());
		}
		System.out.println(players.size());
		
	}

}