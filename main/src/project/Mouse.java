package project;


public class Mouse extends Herbivore{
	
	public Mouse(String name, int id,int hungry,int speed,int energy,int xPosition,int yPosition)
	{
		super(name,id,hungry, speed, energy,xPosition,yPosition);
	}
	
	public boolean eat(LivingThing a)
	{
		if(a.getName().equals("T") || a.getName().equals("G"))
		{
			
			if(super.eat(a))
			{
				return true;
			}
		}
		else{
			System.out.println("Mouse meets "+a.getName());
		}
		return false;
	}

}