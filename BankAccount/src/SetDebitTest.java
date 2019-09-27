import static org.junit.Assert.*;
import org.junit.Test;
public class SetDebitTest
{
	private BankAccount number1, number2; // Test fixtures
	@Before
	public void setUp() throws Exception
	{
		System.out.println("Run @Before"); // for illustration
		number1 = new BankAccount("Checking",11);
		number2 = new BankAccount("Savings",22);
	}
	@After
	public void tearDown() throws Exception
	{
		System.out.println("Run @After"); // for illustration
	}
	@Test
	public void testSetDebit()
	{
		System.out.println("Run @Test testGetterSetter"); // for illustration
		int value = 33;
		number1.setDebit(value);
		assertEquals("error in getter/setter", value, number1.getBalance());
	}
}
