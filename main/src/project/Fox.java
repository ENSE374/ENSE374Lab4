package project;

public class Fox extends Carnivora {
	
	public Fox(String name, int id,int hungry,int speed,int energy)
	{
		super(name,id,hungry, speed, energy);
	}
	
	public void eat(Animal a)
	{
		if(a.getName().equals("r") || a.getName().equals("s")|| a.getName().equals("m")|| a.getName().equals("b"))
		{
			
			super.eat(a);
		}
		else{
			System.out.println("Fox meets "+a.getName());
		}
		
	}
}

