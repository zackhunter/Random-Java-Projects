/**
This program tests the CashRegister class.
*@author Zack Hunter
*
*/
public class CashRegisterTester
{
    public static void main(String[] args)
    {
    	/** Represents the value of a nickel */
        final double NICKEL_VALUE = 0.05;
        /** Represents the value of a dime */
        final double DIME_VALUE = 0.1;
        /** Represents the value of a quarter */
        final double QUARTER_VALUE = 0.25;
        /** Represents the value of a dollar */
        final double DOLLAR_VALUE = 1.0;
        CashRegister myRegister = new CashRegister();
        myRegister.recordPurchase(1.82);
        myRegister.enterPayment(1, new MonetaryUnit(DOLLAR_VALUE, "dollar bill"));
        myRegister.enterPayment(3, new MonetaryUnit(QUARTER_VALUE, "quarter"));
        myRegister.enterPayment(2, new MonetaryUnit(NICKEL_VALUE, "nickel"));
        
        double myChange = myRegister.giveChange();
        System.out.println("Change: " + myChange);
        System.out.println("Expected: 0.03");
    }
}