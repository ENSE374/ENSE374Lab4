
public class tree extends plant{
	private int TLivingAbility=10;

	tree(boolean death1,String name1)
	{
		super(death1,name1);
		TLivingAbility=10;
	}
	public int getLivingAbility() {
		return TLivingAbility;
	}
	
	public void print()
	{
		super.print();
		System.out.println("Living Ability:"+TLivingAbility);
		System.out.println("------------------------");
	}

}