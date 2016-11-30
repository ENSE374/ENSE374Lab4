package project;
public class Bluejay extends Omnivore{
	
	public Bluejay(String name, int id,int hungry,int speed,int energy,int xPosition,int yPosition)
	{
		super(name,id,hungry, speed, energy,xPosition,yPosition);
	}
	
	public boolean eat(LivingThing a)
	{
		if(a.getName().equals("c") || a.getName().equals("g")|| a.getName().equals("T"))
		{
			
			if(super.eat(a))
			{
				return true;
			}
		}
		else{
			System.out.println("Bluejay meets "+a.getName());
			
		}
		return false;
		
	}
	
}
