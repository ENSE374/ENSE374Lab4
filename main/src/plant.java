
public class plant {
	private boolean death;
	private String name;
	
	plant(boolean death1,String name1)
	{
		death=death1;
		name=name1;
	}
	
	public boolean getDeath() {
		return death;
	}
	
	public void setDeath(boolean death) {
		this.death = death;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void print()
	{
		System.out.println("Plant Name: "+name);
		System.out.println("Death: "+death);
		
	}
}