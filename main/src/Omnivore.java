
public class Omnivore extends animal{
	private int level=2;
	
	public Omnivore(int hungry1,int speed1,boolean death1,String name1)
	{
		super(name1,hungry1, speed1, death1);
		level=2;
	}
	
	public Omnivore(){}
	
	
	public void print()
	{
		super.print();
		System.out.println("level: "+level);
	}

}