public class PCFactory implements ComputerAbstractFactory
{
	private String ram;
	private String cpu;
	
	/**PC constructor
	 * @param ram the ram
	 * @param cpu the cpu
	 */
	public PCFactory(String ram, String cpu)
	{
		this.ram = ram;
		this.cpu = cpu;
	}
	
	/**
	 * @return a PC object
	 */
	public Computer createComputer()
	{
		return new PC(ram,cpu);
	}

}