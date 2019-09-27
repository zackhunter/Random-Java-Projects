/*
* Author: Zack Hunter
* Date: 3/6/2017
* Description: Creates a die class, a player class that has 3 die and it calculates the amount of 
* 			   points you earn based off of your rolls
* */
import java.util.Scanner;

public class main
{
	public static void main(String[] args)
	{
		//DIe [] dies = new DIe [3];
		Player pguy = new Player();	
		boolean keepLooping = true;
		pguy.takeTurn();
		while (keepLooping)
		{
			Scanner in = new Scanner(System.in);
			System.out.print("Play again? (Y/N) ");
			String yesOrNo = in.nextLine();
			if (yesOrNo.equals("Y"))
			{
				pguy.takeTurn();
			}
			else if (yesOrNo.equals("N"))
			{
				System.out.println("Final Score = " + pguy.getPoints() + " points");
				keepLooping = false;
			}
			else
			{
				System.out.println("Sorry that was not an appropriate responce try again.");
			}
		}
		
		
	}
}
