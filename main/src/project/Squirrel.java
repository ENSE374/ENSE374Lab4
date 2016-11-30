package project;


public class Squirrel extends Herbivore{
	
	public Squirrel(String name, int id,int hungry,int speed,int energy)
	{
		super(name,id,hungry, speed, energy);
	}
	
	
	public void eat(Animal a)
	{
		if(a.getName().equals("T"))
		{
			
			super.eat(a);
		}
		else{
			System.out.println("Squirrel meets "+a.getName());
		}
		
	}

}
