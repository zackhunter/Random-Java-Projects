public class PC extends Computer
{
	private String ram;
	private String cpu;
	
	/**Constructor
	 * @param ram the ram
	 * @param cpu the bpu
	 */
	public PC(String ram, String cpu)
	{
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