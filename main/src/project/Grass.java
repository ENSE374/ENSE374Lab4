package project;

public class Grass extends LivingThing {
	private int GLivingAbility;

	Grass(String name,int id,int energy,int hungry,int speed,int xPosition, int yPosition)
	{
		super(name,id,hungry,speed,energy,xPosition,yPosition);
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
	
	public boolean eat(LivingThing a)
	{
		return false;
	}
}
