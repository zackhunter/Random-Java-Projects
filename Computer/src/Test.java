
public class Test {
	public static void main(String[] args) 
	{
		
		Computer pc = new PCFactory("10 GB","3.7 GHz").createComputer();
		Computer ser = new ServerFactory("32 GB","1.2 GHz").createComputer();
		System.out.println("AbstractFactory PC:" + pc);
		System.out.println("AbstractFactory Server:" + ser);
	}
}