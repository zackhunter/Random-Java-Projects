public class CashRegister 
{
	/** Represents the ammount of the purchase */
    private double purchase;
    /** Represents the ammount of the payment */
    private double payment;
    /** sets the purchase
	 * @param ammount the value of the purchase
	 */
    public void recordPurchase(double ammount)
    {
        purchase = ammount;
    }
    /** calculates the payment value
	 * @param unitCount the amount of the specified unit
	 * @param unitType the type of unit
	 */
    public void enterPayment(int unitCount, MonetaryUnit unitType)
    {
    	payment += unitCount * unitType.getValue();
    }
    /** calculates and returns the amount of change that is due */
    public double giveChange()
    {
        return payment - purchase;
    }
}