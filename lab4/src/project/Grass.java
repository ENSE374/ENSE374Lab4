package project;

public class Grass extends Plant {
	private int GLivingAbility;

	Grass(String name,int id,int energy)
	{
		super(name,id,energy);
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
