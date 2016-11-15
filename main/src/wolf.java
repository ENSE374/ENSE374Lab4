
public class wolf extends Meat{
	
	private String sounds;
	
	public wolf(){}
	
	public wolf(String name1,int hungry1,int speed1,boolean death1,String sounds1)
	{
		super(hungry1, speed1, death1,name1);
		sounds=sounds1;
	}
	
	public void eat(deer d)
	{
		System.out.println(getName()+" eats "+d.getName());
	}
	
	public void eat(rabbit r)
	{
		System.out.println(getName()+" eats "+r.getName());
	}
	
	public void print()
	{
		super.print();
		System.out.println("sounds: "+sounds);
		System.out.println("------------------------");
	}

}
