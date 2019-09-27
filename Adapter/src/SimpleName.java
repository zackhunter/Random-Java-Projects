//Adaptee class
class SimpleName implements NameInterface
{
	private String name;
	public SimpleName(String n)
	{
		name = n;
	}
	public void setName(String n) 
	{
		name = n;
	}

	public String getName() 
	{
		return name;
	}
}
