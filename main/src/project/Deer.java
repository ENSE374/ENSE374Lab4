package project;


public class Deer extends Herbivore{
	
	public Deer(String name, int id,int hungry,int speed,int energy)
	{
		super(name,id,hungry, speed, energy);
	}
	
	public void eat(Animal a)
	{
		if(a.getName().equals("G") || a.getName().equals("T"))
		{
			
			super.eat(a);
		}
		else{
			System.out.println("Deer meets "+a.getName());
		}
		
	}

}
