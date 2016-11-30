package project;

public class Hawk extends Carnivora {
	
	public Hawk(String name, int id,int hungry,int speed,int energy)
	{
		super(name,id,hungry, speed, energy);
	}
	
	public void eatSquirrel(Squirrel s)
	{
		super.eat(s);
	}
	public void eatMouse(Mouse m)
	{
		super.eat(m);
	}
}

