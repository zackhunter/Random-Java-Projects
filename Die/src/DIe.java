
public class DIe
{
	/** Represents the number of sides on the die */
	private int sides;
	/** Represents the value of the die */
	private int dieVal;
	/** Constructor 
	 * @param s The number of sides this die has 
	 */
	public DIe(int s) 
	{
		sides = s;
		dieVal = roll();
	}
	/** Rolls the die and returns the result 
	 * @return result of die roll */
	public int roll()
	{
		dieVal = (int)(Math.random() * sides) + 1;return dieVal;
	}
	/** Retrieves the value of the die 
	 * @return value of the die */
	public int getDieVal()
	{
		return dieVal;
	}
	/** Sets the die to the parameter value  
	 * @param value value to set die to 
	 * @return value of the die */
	public boolean setDiceVal(int value) 
	{
		if ( value > 0 && value <= sides ) 
		{
			dieVal = value;
			return true;  //successfully set the value
		}
		return false; //failed to set the value}
	}
	/** finds if 2 dice are equal to eachother 
	 * @param d a dice
	 * @return if they are equal*/
	public boolean equals(DIe d)
	{
		if (getDieVal() == d.getDieVal())
		{
			return true;
		}
		return false;
	}
	/** finds if 3 dice are a series 
	 * @param di1 a dice, di2 another dice
	 * @return if they are a series*/
	public boolean compareTo(DIe di1, DIe di2)
	{
		/*
		if(dieVal == 1 && di1.dieVal == 2 && di2.dieVal == 3)
		{
			return true;
		}
		else if (dieVal == 3 && di1.dieVal == 2 && di2.dieVal == 1)
		{
			return true;
		}
		else if (dieVal == 1 && di1.dieVal == 3 && di2.dieVal == 2)
		{
			return true;
		}
		else if (dieVal == 3 && di1.dieVal == 1 && di2.dieVal == 2)
		{
			return true;
		}
		else if (dieVal == 2 && di1.dieVal == 3 && di2.dieVal == 1)
		{
			return true;
		}
		else if (dieVal == 2 && di1.dieVal == 1 && di2.dieVal == 3)
		{
			return true;
		}
		*/
		if ((di1.getDieVal() == dieVal +1) && (di2.getDieVal() == dieVal +2))//if 1,2,3
		{
			return true;
		}
		else if ((di2.getDieVal() == dieVal +1) && (di1.getDieVal() == dieVal +2))//if 1,3,2
		{
			return true;
		}
		else if ((di2.getDieVal() == di1.getDieVal() +1) && (dieVal == di1.getDieVal() +2))//if 3,1,2
		{
			return true;
		}
		else if ((dieVal == di1.getDieVal() +1) && (di2.getDieVal() == di1.getDieVal() +2))//if 2,1,3
		{
			return true;
		}
		else if ((dieVal == di2.getDieVal() +1) && (di1.getDieVal() == di2.getDieVal() +2))//if 2,3,1
		{
			return true;
		}
		else if ((di1.getDieVal() == di2.getDieVal() +1) && (dieVal == di2.getDieVal() +2))//if 3,2,1
		{
			return true;
		}
		return false;
	}
}
