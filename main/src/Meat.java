

public class Meat extends animal{
	
	private String name;
	
	public Meat(int hungry1,int speed1,boolean death1,String name1)
	{
		super(hungry1, speed1, death1);
		name=name1;	
	}
	
	public void setName(String name1)
	{
		name=name1;
	}
	
	public String getName()
	{
		return name;
	}
	
	public Meat(){}
	
	
	public void print()
	{
		super.print();
		System.out.println("name: "+name);
	}
	
}
