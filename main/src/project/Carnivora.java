package project;

public class Carnivora extends LivingThing{
	private int level;
	
	public Carnivora(String name, int id,int hungry,int speed,int energy,int xPosition,int yPosition)
	{
		super(name,id,hungry, speed, energy,xPosition,yPosition);
		setLevel(3);
	}
	
	public Carnivora(){}
	
	
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
