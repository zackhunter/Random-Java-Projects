public class ServerFactory implements ComputerAbstractFactory
{
	private String ram;
	private String cpu;
	
	/**Server factory constructor
	 * @param ram the ram
	 * @param cpu the cpu
	 */
	public ServerFactory(String ram, String cpu){
		this.ram=ram;
		this.cpu=cpu;
	}
	
	/**
	 * @return the server object
	 */
	@Override
	public Computer createComputer() {
		return new Server(ram,cpu);
	}
}
