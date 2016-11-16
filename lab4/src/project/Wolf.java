package project;

public class Wolf extends Carnivora {
	
	public Wolf(String name, int id,int hungry,int speed,int energy)
	{
		super(name,id,hungry, speed, energy);
	}
	
	public void eatDeer(Deer d)
	{
		super.eat(d);
	}
	
	public void eatRabbit(Rabbit r)
	{
		super.eat(r);
	}
}
