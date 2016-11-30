package project;


public class Grasshopper extends Herbivore{
	
	public Grasshopper(String name, int id,int hungry,int speed,int energy)
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
	

}
