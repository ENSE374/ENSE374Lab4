

public class fox extends Meat{
	private String sounds;
	
	public fox(String name1,int hungry1,int speed1,boolean death1,String sounds1)
	{
		super(hungry1, speed1, death1,name1);
		sounds=sounds1;
	}
	
	public void print()
	{
		super.print();
		System.out.println("sounds: "+sounds);
		System.out.println("------------------------");
	}
}
