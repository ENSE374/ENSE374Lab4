package project;

public class Fox extends Carnivora {
	
	public Fox(String name, int id,int hungry,int speed,int energy,int xPosition,int yPosition)
	{
		super(name,id,hungry, speed, energy,xPosition,yPosition);
	}
	
	public boolean eat(LivingThing a)
	{
		if(a.getName().equals("r") || a.getName().equals("s")|| a.getName().equals("m")|| a.getName().equals("b"))
		{
			
			if(super.eat(a))
			{
				return true;
			}
		}
		else{
			System.out.println("Fox meets "+a.getName());
		}
		return false;
	}
}

