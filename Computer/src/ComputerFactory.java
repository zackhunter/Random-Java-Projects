public class ComputerFactory {

	/**
	 * @param factory a ComputerAbstractFactory
	 * @return a Computer object
	 */
	public static Computer getComputer(ComputerAbstractFactory factory)
	{
		return factory.createComputer();
	}
}