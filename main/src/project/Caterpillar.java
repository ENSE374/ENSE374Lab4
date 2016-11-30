package project;


public class Caterpillar extends Herbivore{
	
	public Caterpillar(String name, int id,int hungry,int speed,int energy)
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
			System.out.println("Caterpillar meets "+a.getName());
		}
		
	}

}