public abstract class Cake 
{
	String name;
	String type;
	int price;

	public String getName(){
		return name;
	}
	public String getType(){
		return type;
	}
	public int getPrice(){
		return price;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setPrice(int price){
		this.price=price;
	}
	public void setType(String type){
		this.type=type;
	}

	public abstract void recipe();
	public abstract void comments();
	/**
	 * prints out info about the cake
	 */
	public void aboutCake(){
		System.out.println("I am "+name+" Cake");
		System.out.print("My Fans  : ");
		comments();
		System.out.println("You can get a "+name+" Cake at "+price);
	}
}