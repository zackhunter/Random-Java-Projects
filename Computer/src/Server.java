public class Server extends Computer
{
	private String ram;
	private String cpu;
	
	/**Server constructor
	 * @param ram the ram
	 * @param cpu the cpu
	 */
	public Server(String ram, String cpu){
		this.ram=ram;
		this.cpu=cpu;
	}
	/**
	 * @return the ram
	 */
	@Override
	public String getRAM() {
		return this.ram;
	}
	/**
	 * @return the cpu
	 */
	@Override
	public String getCPU() {
		return this.cpu;
	}
}

