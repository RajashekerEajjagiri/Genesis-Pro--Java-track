import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Day4A43{

	public static void main(String[] args) throws Exception 
	{
		InputStreamReader sr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(sr);
		System.out.println("Enter the Total runs scored:");
		try {
			int run = Integer.parseInt(br.readLine());
			System.out.println("Enter the total overs faced:");
			int ball = Integer.parseInt(br.readLine());
			float runrate=run/ball;
			System.out.println("Current Run Rate :"+((float)(run)/(int)(ball)));
		}
		catch (Exception e) {
			System.out.println(e);
		}
		finally {
			
		}

	}

}
