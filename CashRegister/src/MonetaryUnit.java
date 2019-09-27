public class MonetaryUnit 
{
	/** Represents how much the monetary unit is worth */
    private double value;
    /** Represents the name of the monetary unit */
    private String name;
    /** Constructor 
	 * @param ammount the value of the monetary unit
	 * @param unit the name of the monetary unit
	 */    
    public MonetaryUnit(double ammount, String unit)
    {
    	value = ammount;
    	name = unit;
    }
    /** returns the value of the monetary unit */
    public double getValue()
    {
    	return value;
    }
    /** returns the name of the monetary unit */
    public String getName()
    {
    	return name;
    }
    /** sets a the valuye of the monetary unit
	 * @param amount the value
	 */
    public void setValue(double amount)
    {
    	value = amount;
    }
    /** sets the name
	 * @param unit the name 
	 */
    public void setName(String unit)
    {
    	name = unit;
    }
}