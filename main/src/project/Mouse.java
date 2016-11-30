package project;


public class Mouse extends Herbivore{
	
	public Mouse(String name, int id,int hungry,int speed,int energy)
	{
		super(name,id,hungry, speed, energy);
	}
	
	public void eat(Animal a)
	{
		if(a.getName().equals("T") || a.getName().equals("G"))
		{
			
			super.eat(a);
		}
		else{
			System.out.println("Mouse meets "+a.getName());
		}
		
	}

}