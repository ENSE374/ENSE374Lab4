package project;


public class Caterpillar extends Herbivore{
	
	public Caterpillar(String name, int id,int hungry,int speed,int energy,int xPosition,int yPosition)
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
			System.out.println("Caterpillar meets "+a.getName());
			
		}
		return false;
	}

}