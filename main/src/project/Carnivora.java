package project;

public class Carnivora extends Animal{
	private int level;
	
	public Carnivora(String name, int id,int hungry,int speed,int energy)
	{
		super(name,id,hungry, speed, energy);
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

}
