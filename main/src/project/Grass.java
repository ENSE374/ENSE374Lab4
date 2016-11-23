package project;

public class Grass extends Animal {
	private int GLivingAbility;

	Grass(String name,int id,int energy,int hungry,int speed)
	{
		super(name,id,hungry,speed,energy);
		setGLivingAbility(2);
	}

	public int getGLivingAbility() {
		return GLivingAbility;
	}

	public void setGLivingAbility(int gLivingAbility) {
		GLivingAbility = gLivingAbility;
	}
	public void grassDecress()
	{
		GLivingAbility--;
		if (GLivingAbility ==0)
		{
			setDeath(true);
		}
		destroy();
	}
	public void print()
	{
		super.print();
		System.out.println("Living Ability:"+GLivingAbility);
	}
	
}
