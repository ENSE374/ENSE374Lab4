package project;


public class LivingThing {
	private String name;
	private int id;
	private int hungry;//ept
	private int speed;//ept
	private boolean death;
	private int energy;//ept
	private int xPosition;
	private int yPosition;
	
	public LivingThing()
	{
		 name=null;
	   	 id=0;
		 hungry=0;//ept
		 speed=0;//ept
		 death=true;
		 energy=0;//ept
	}
	
	public LivingThing(String name, int id,int hungry,int speed,int energy,int xPosition,int yPosition)
	{
		this.hungry=hungry;
		this.speed=speed;
		death = false;
		this.name =name;
		this.id = id;
		this.energy = energy;
		this.xPosition = xPosition;
		this.yPosition = yPosition;
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
		System.out.println("Name: "+name);
		System.out.println("id"+id);
		System.out.println("hungry: "+hungry);
		System.out.println("speed: "+speed);
		System.out.println("death: "+death);
		System.out.println("x: "+xPosition);
		System.out.println("y: "+yPosition);

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEnergy() {
		return energy;
	}

	public void setEnergy(int energy) {
		this.energy = energy;
	}
	public void disappear(/*Map m*/)
	{
		
		if ( death == true)
		{
			System.out.println(name+" has dead and removed from the world");
			
			int x= getxPosition();
			int y= getyPosition();
			//m.setValue(x, y, object);
		}
	}

	
	public boolean eat(LivingThing a)
	{
		if (hungry <50)
		{
			a.setDeath(true);
			setEnergy(a.getEnergy() + getEnergy());
			System.out.println(name+" meets "+a.getName()+",and eats it!");
			a.disappear();
			
			return true;
		}
		else
		{
			System.out.println(name+" cannot eat "+a.getName());
			return false;
		}
	}
	
	/*public void eat(Herbivore h)
	{
		if (hungry <50)
		{
			h.setDeath(true);
			h.disappear();
			System.out.println(name+" ate "+h.getName());
		}
		else
		{
			System.out.println(name+" cannot eat "+h.getName());
		}
	}
	public void eat(Omnivore o)
	{
		if (hungry <50)
		{
			o.setDeath(true);
			o.disappear();
			System.out.println(name+" ate "+o.getName());
		}
		else
		{
			System.out.println(name+" cannot eat "+o.getName());
		}
	
	}	
	public void eat(Grass p)
	{
		if (hungry <50)
		{
			
			// in the children classes
		}
		else
		{
			System.out.println(name+" cannot eat "+p.getName());
		}
	}
	
	public void eat(Tree p)
	{
		if (hungry <50)
		{
			
			// in the children classes
		}
		else
		{
			System.out.println(name+" cannot eat "+p.getName());
		}
	}
	*/
	public void destroy()
	{
		if (death == true)
		{
			
			System.out.println(name+" has dead and removed from the world");
		}
	}

	public int getxPosition() {
		return xPosition;
	}

	public void setxPosition(int xPosition) {
		this.xPosition = xPosition;
	}

	public int getyPosition() {
		return yPosition;
	}

	public void setyPosition(int yPosition) {
		this.yPosition = yPosition;
	}
	
}

	