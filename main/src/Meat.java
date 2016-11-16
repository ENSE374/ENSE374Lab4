

public class Meat extends animal{
	private int level=3;
	
	
	public Meat(int hungry1,int speed1,boolean death1,String name1)
	{
		super(name1,hungry1, speed1, death1);
		level=3;
	}
	
	public Meat(){}
	
	
	public void print()
	{
		super.print();
		System.out.println("level: "+level);
	}
	
}
