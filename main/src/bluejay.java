
public class bluejay extends Omnivore{
	private String sounds;
	
	public bluejay(){}
	
	public bluejay(String name1,int hungry1,int speed1,boolean death1,String sounds1)
	{
		super(hungry1, speed1, death1,name1);
		sounds=sounds1;
	}
	
	public void eat(grass g)
	{
		System.out.println(getName()+" eats "+g.getName());
	}
	
	public void eat(grassHopper gh)
	{
		System.out.println(getName()+" eats "+gh.getName());
	}
	
	public void eat(caterpillar p)
	{
		System.out.println(getName()+" eats "+p.getName());
	}
	
	public void print()
	{
		super.print();
		System.out.println("sounds: "+sounds);
		System.out.println("------------------------");
	}

}
