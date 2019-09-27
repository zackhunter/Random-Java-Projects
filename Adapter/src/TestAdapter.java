
public class TestAdapter implements FullNameInterface
{
	private SimpleName n;
	String fn;
	String ln;
	public TestAdapter(SimpleName nn)
	{
		n = nn;
		fn = n.getName().split(" ")[0];
		ln = n.getName().split(" ")[1];
	}
	public void setFirstName(String f)
	{
		fn = f;
	}
	public void setLastName(String l)
	{
		ln = l;
	}
	public String getFirstName()
	{
		return fn;
	}
	public String getLastName()
	{
		return ln;
	}
}
