package project;

public class Herbivore extends LivingThing{
	private int level;
	
	public Herbivore(String name, int id,int hungry,int speed,int energy,int xPosition,int yPosition)
	{
		super(name,id,hungry, speed, energy,xPosition,yPosition);
		setLevel(1);
	}
	
	public Herbivore(){}
	
	
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
	public boolean eat(LivingThing a)
	{
		if (super.eat(a)){
			return true;
		}
		return false;
	}
}
