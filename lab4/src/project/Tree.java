package project;

public class Tree extends Plant {
	private int GLivingAbility;

	Tree(String name,int id,int energy)
	{
		super(name,id,energy);
		setGLivingAbility(10);
	}

	public int getGLivingAbility() {
		return GLivingAbility;
	}

	public void setGLivingAbility(int gLivingAbility) {
		GLivingAbility = gLivingAbility;
	}
	public void TreeDecress()
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
