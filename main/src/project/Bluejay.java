package project;
public class Bluejay extends Omnivore{
	
	public Bluejay(String name, int id,int hungry,int speed,int energy)
	{
		super(name,id,hungry, speed, energy);
	}
	
	public void eatGrass(Grass g)
	{
		super.eat(g);
		if (getHungry() <50)
		{
			g.grassDecress();

			System.out.println(getName()+" ate "+g.getName());
		}

	}
	
	public void eatGrasshopper(Grasshopper g)
	{
		super.eat(g);
	}
	
	public void eatCaterpillar(Caterpillar c)
	{
		super.eat(c);
	}
	
}
