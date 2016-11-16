
public class grass extends plant {
	private int GLivingAbility=2;

	grass(boolean death1,String name1)
	{
		super(death1,name1);
		GLivingAbility=2;
	}
	public int getLivingAbility() {
		return GLivingAbility;
	}
	
	public void print()
	{
		super.print();
		System.out.println("Living Ability:"+GLivingAbility);
		System.out.println("------------------------");
	}
	
}
