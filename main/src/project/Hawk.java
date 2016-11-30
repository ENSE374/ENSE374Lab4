package project;

public class Hawk extends Carnivora {
	
	public Hawk(String name, int id,int hungry,int speed,int energy,int xPosition,int yPosition)
	{
		super(name,id,hungry, speed, energy,xPosition,yPosition);
	}
	
	public boolean eat(LivingThing a)
	{
		if(a.getName().equals("m") || a.getName().equals("s"))
		{
			
			if(super.eat(a))
			{
				return true;
			}
		}
		else{
			System.out.println("Hawk meets "+a.getName());
		}
		return false;
	}
}

