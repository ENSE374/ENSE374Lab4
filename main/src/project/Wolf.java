package project;

public class Wolf extends Carnivora {
	
	public Wolf(String name, int id,int hungry,int speed,int energy)
	{
		super(name,id,hungry, speed, energy);
	}
	
	public void eat(Animal a)
	{
		if(a.getName().equals("d") || a.getName().equals("r"))
		{
			
			super.eat(a);
		}
		else{
			System.out.println("Wolf meets "+a.getName());
		}
		
	}
}
