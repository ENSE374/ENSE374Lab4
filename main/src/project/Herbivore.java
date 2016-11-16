package project;

import project.Animal;
import project.Plant;

public class Herbivore extends Animal{
	private int level;
	
	public Herbivore(String name, int id,int hungry,int speed,int energy)
	{
		super(name,id,hungry, speed,energy);
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
	public void eat(Plant p)
	{
		super.eat(p);
	}
}