package project;

public class Omnivore extends Animal{
	private int level;
	
	public Omnivore(String name, int id,int hungry,int speed,int energy)
	{
		super(name,id,hungry, speed, energy);
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
