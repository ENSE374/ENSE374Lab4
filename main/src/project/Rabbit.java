package project;


public class Rabbit extends Herbivore{
	
	public Rabbit(String name, int id,int hungry,int speed,int energy)
	{
		super(name,id,hungry, speed, energy);
	}
	
	public void eat(Animal a)
	{
		if(a.getName().equals("G"))
		{
			
			super.eat(a);
		}
		else{
			System.out.println("Rabbit meets "+a.getName());
			System.out.println("Rabbit meets "+a.getName());
			huo22
		}
		
	}
	

}