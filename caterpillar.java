
public class caterpillar extends Herbivore{
	private String sounds;
	
	public caterpillar(){}
	
	public caterpillar(String name1,int hungry1,int speed1,boolean death1,String sounds1)
	{
		super(hungry1, speed1, death1,name1);
		sounds=sounds1;
	}
	
	public void eat(tree t)
	{
		System.out.println(getName()+" eats "+t.getName());
	}
	
	public void print()
	{
		super.print();
		System.out.println("sounds: "+sounds);
		System.out.println("------------------------");
	}
}
