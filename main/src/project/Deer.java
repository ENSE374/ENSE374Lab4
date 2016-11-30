package project;


public class Deer extends Herbivore{
	
	public Deer(String name, int id,int hungry,int speed,int energy,int xPosition,int yPosition)
	{
		super(name,id,hungry, speed, energy,xPosition,yPosition);
	}
	
	public boolean eat(LivingThing a)
	{
		if(a.getName().equals("G") || a.getName().equals("T"))
		{
			
			if(super.eat(a))
			{
				return true;
			}
		}
		else{
			System.out.println("Deer meets "+a.getName());
			
		}
		return false;
	}

}
