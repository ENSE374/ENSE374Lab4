package project;


public class Grasshopper extends Herbivore{
	
	public Grasshopper(String name, int id,int hungry,int speed,int energy)
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
			System.out.println("Grasshopper meets "+a.getName());
		}
		
	}
	

}
