
public class Mouse extends Herbivore{
	private String sounds;
	
	public Mouse(){}
	
	public Mouse(String name1,int hungry1,int speed1,boolean death1,String sounds1)
	{
		super(hungry1, speed1, death1,name1);
		sounds=sounds1;
	}
	
	public void eat(Tree t)
	{
		System.out.println(getName()+" eats "+t.getName());
	}
	
	public void eat(Grass g)
	{
		System.out.println(getName()+" eats "+g.getName());
	}
	
	
	public void print()
	{
		super.print();
		System.out.println("sounds: "+sounds);
		System.out.println("------------------------");
	}

}
