package project;

public class Wolf extends Carnivora {
	
	public Wolf(String name, int id,int hungry,int speed,int energy,int xPosition,int yPosition)
	{
		super(name,id,hungry, speed, energy,xPosition,yPosition);
	}
	
	public boolean eat(LivingThing a)
	{
		if(a.getName().equals("d") || a.getName().equals("r"))
		{
			
			super.eat(a);
			return true;
		}
		else{
			System.out.println("Wolf meets "+a.getName());
			return false;
		}
		
	}
}
