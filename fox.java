

public class fox extends Meat{
	private String sounds;
	
	public fox(String name1,int hungry1,int speed1,boolean death1,String sounds1)
	{
		super(hungry1, speed1, death1,name1);
		sounds=sounds1;
	}
	
	public void eat(bluejay b)
	{
		System.out.println(getName()+" eats "+b.getName());
	}
	
	public void eat(rabbit r)
	{
		System.out.println(getName()+" eats "+r.getName());
	}
	
	public void eat(mouse m)
	{
		System.out.println(getName()+" eats "+m.getName());
	}
	
	public void eat(squirrel s)
	{
		System.out.println(getName()+" eats "+s.getName());
	}
	
	
	public void print()
	{
		super.print();
		System.out.println("sounds: "+sounds);
		System.out.println("------------------------");
	}
}
