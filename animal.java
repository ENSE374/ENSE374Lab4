package pkg;

public class animal {
	
	private int hungry;
	private int speed;
	private boolean death;
	
	public animal()
	{}
	
	public animal(int hungry1,int speed1,boolean death1)
	{
		
		hungry=hungry1;
		speed=speed1;
		death=death1;
	}

	
	public void setHungry(int hungry1)
	{
		hungry=hungry1;
	}
	
	public int getHungry()
	{
		return hungry;
	}
	
	public void setSpeed(int speed1)
	{
		speed=speed1;
	}
	
	public int getSpeed()
	{
		return speed;
	}
	
	public void setDeath(boolean death1)
	{
		death=death1;
	}
	
	public boolean getDeath()
	{
		return death;
	}
	public void print()
	{
		System.out.println("hungry: "+hungry);
		System.out.println("speed: "+speed);
		System.out.println("death: "+death);
	}
}
