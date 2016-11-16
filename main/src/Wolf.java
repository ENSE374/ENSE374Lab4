package project;

import project.Bluejay;
import project.Carnivora;
import project.Mouse;
import project.Rabbit;
import project.Squirrel;

public class Fox extends Carnivora {
	
	public Fox(String name, int id,int hungry,int speed,int energy)
	{
		super(name,id,hungry, speed, energy);
	}
	
	public void eatBluejay(Bluejay b)
	{
		super.eat(b);
	}
	
	public void eatRabbit(Rabbit r)
	{
		super.eat(r);
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

