import java.util.*;
public class main
{
	public static void main(String args[])
	{
		SimpleName s = new SimpleName("Phuong Nguyen");
		TestAdapter d  = new TestAdapter(s);
		System.out.println(d.getFirstName());
		System.out.println(d.getLastName());
	}
	
}
