import java.util.Scanner;



	class Innings{
		private String teamname;
		private String innings;
		private int runs;
		Innings(String teamname,String innings,int runs){
			this.teamname=teamname;
			this.innings =innings;
			this.runs=runs;
		}
		public void getinfo() {
			System.out.println();
			System.out.println("Team Name : "+ this.teamname);
			System.out.println("Innings : "+this.innings);
			if(this.innings.toLowerCase().equals("first"))
			{
				System.out.println("Scored : "+this.runs);
				System.out.println("Need "+(this.runs+1)+" to win");
			}
			if(this.innings.toLowerCase().equals("second"))
		    {
				System.out.println("Scored : "+this.runs);
				System.out.println("Match Ended");
			}
			
		}
	}
	class InningsMain{
		InningsMain(){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the TeamName:");
			String teamname = sc.nextLine();
			System.out.println("Enter Session:");
			String innings = sc.nextLine();	
			System.out.println("Enter Runs:");
			int runs = sc.nextInt();
			
			Innings i = new Innings(teamname,innings,runs);
			
			i.getinfo();
		}
	}
public class Day2task3 {
	public static void main(String[] args) {
		 new InningsMain();

		
	}
	
}