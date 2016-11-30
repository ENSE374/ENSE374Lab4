package project;
public class Bluejay extends Omnivore{
	
	public Bluejay(String name, int id,int hungry,int speed,int energy)
	{
		super(name,id,hungry, speed, energy);
	}
	
	public void eat(Animal a)
	{
		if(a.getName().equals("c") || a.getName().equals("g")|| a.getName().equals("T"))
		{
			
			super.eat(a);
		}
		else{
			System.out.println("Bluejay meets "+a.getName());
		}
		
	}
	
}
