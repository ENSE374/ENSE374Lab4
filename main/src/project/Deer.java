package project;


public class Deer extends Herbivore{
	
	public Deer(String name, int id,int hungry,int speed,int energy)
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
	
	public void eatTree(Tree t)
	{
		super.eat(t);
		if (getHungry() <50)
		{
			t.TreeDecress();

			System.out.println(getName()+" ate "+t.getName());
		}

	}

}
