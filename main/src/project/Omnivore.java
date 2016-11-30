package project;

public class Omnivore extends LivingThing{
	private int level;
	
	public Omnivore(String name, int id,int hungry,int speed,int energy,int xPosition,int yPosition)
	{
		super(name,id,hungry, speed, energy,xPosition,yPosition);
		setLevel(2);
	}
	
	public Omnivore(){}
	
	
	public void print()
	{
		super.print();
		System.out.println("Level: " +level);
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

}
