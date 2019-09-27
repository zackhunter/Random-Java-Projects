public abstract class Computer 
{
	public abstract String getRAM();
	public abstract String getCPU();
	
	/**Overrides the toString method
	 * @return the String with the variable values
	 */
	@Override
	public String toString(){
		return "RAM = "+this.getRAM()+", CPU = "+this.getCPU();
	}
}