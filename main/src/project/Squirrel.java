package project;


public class Squirrel extends Herbivore{
	
	public Squirrel(String name, int id,int hungry,int speed,int energy,int xPosition,int yPosition)
	{
		super(name,id,hungry, speed, energy,xPosition,yPosition);
	}
	
	
	public boolean eat(LivingThing a)
	{
		if(a.getName().equals("T"))
		{
			
			if(super.eat(a))
			{
				return true;
			}
		}
		else{
			System.out.println("Squirrel meets "+a.getName());
		}
		return false;
	}

}
