
public class Player
{
	/** Represents the points or score */
	private int points;
	//private DIe d1;
	//private DIe d2;
	//private DIe d3;
	/** Represents the three dice */
	private DIe [] dies = new DIe [3];
	/** Constructor 
	 * @param p The points the Player has
	 */
	public Player()
	{
		points = 0;
		
		for (int i=0;i<3;i++)
		{
			dies[i] = new DIe(6);
		}
		
		//dies[0] = new DIe(6);
		//dies[1]= new DIe(6);
		//dies[2] = new DIe(6);
	}
	/** Finds if all the dice are equal
	 * @param dice the array of dice 
	 * @return  if they are all equal*/
	public boolean addIfAllEquaL(DIe [] dice)
	{
		if (dice[0].equals(dice[1]) && dice[0].equals(dice[2]))
		{
			return true;
		}
		return false;
	}
	/** Finds if two of the dice are equal
	 * @param dice the array of dice 
	 * @return  if two are equal*/
	public boolean addIfTwoEqual(DIe [] dice)
	{
		if (dice[0].equals(dice[1]))
		{
			return true;
		}
		else if (dice[1].equals(dice[2]))
		{
			return true;
		}
		else if (dice[2].equals(dice[0]))
		{
			return true;
		}
		return false;
	}
	/** Finds if the dice are a series
	 * @param dice the array of dice 
	 * @return  if they are a series*/
	public boolean addIfSeries(DIe [] dice)
	{
		if (dice[0].compareTo(dice[1], dice[2]))
		{
			return true;
		}
		return false;
	}
	/** Creates a string of the dice rolls
	 * @return  the dice rolling string*/
	public String toString()
	{
		//DIe d1 = dice[0].dieVal;
		//int something = d1.dieVal;
		String theString = "Rolling Dice...D1=" + dies[0].getDieVal() + ", D2=" + dies[1].getDieVal() + 
						   ", D3=" + dies[2].getDieVal();
		return theString;
	}
	/** finds the amount of points
	 * @return  the amount of points*/
	public int getPoints()
	{
		return points;
	}
	/** rolls the dice, adds points, and prints out appropriate messages */
	public void takeTurn()
	{
		for (int i=0;i<3;i++)
		{
			dies[i] = new DIe(6);
		}
		System.out.println(toString());
		if (addIfAllEquaL(dies))
		{
			System.out.println("You got 3 of a kind!");
			points = points + 3;
		}
		else if (addIfTwoEqual(dies))
		{
			System.out.println("You got a pair!");
			points = points + 1;
		}
		else if (addIfSeries(dies))
		{
			System.out.println("You got a series of 3!");
			points = points + 2;
		}
		else
		{
			System.out.println("Awww. Too bad.");
		}
		System.out.println("Score = " + points + " points");
		
	}
}
