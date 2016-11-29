package project;


public class Squirrel extends Herbivore{
	
	public Squirrel(String name, int id,int hungry,int speed,int energy)
	{
		super(name,id,hungry, speed, energy);
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
