import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class Day4A54{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of players you want:");
		int n=sc.nextInt();
		sc.nextLine();
		Set<String> players = new TreeSet<>();
		for (int i=0;i<n;i++) {
			players.add(sc.nextLine());
		}
		System.out.println("Output:");
		for(String i:players) {
			System.out.println(i);
		}

	}

}