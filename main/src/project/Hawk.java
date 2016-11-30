package project;

public class Hawk extends Carnivora {
	
	public Hawk(String name, int id,int hungry,int speed,int energy)
	{
		super(name,id,hungry, speed, energy);
	}
	
	public void eat(Animal a)
	{
		if(a.getName().equals("m") || a.getName().equals("s"))
		{
			
			super.eat(a);
		}
		else{
			System.out.println("Hawk meets "+a.getName());
		}
		
	}
}

