package project;

import java.util.Random;
import java.util.Scanner;

public class Map {
	private LivingThing[][] map;
	private int maxX;
	private int maxY;
	public Map (int x, int y)
	{
		map = new LivingThing[x][y];
		for (int i = 0; i < x; i++)
		{
			for (int j = 0; j <y; j++)
			{
				map[i][j]=new LivingThing();
				map[i][j].setName("*");
			}
		}
		maxX = x;
		maxY = y;
	}
	/*public String[][] getMap() {
		return map;
	}*/
	public LivingThing getValue(int x,int y) {
		
		 int energy=map[x][y].getEnergy();
		 String name = map[x][y].getName();
		 int id=map[x][y].getId();
		 int hungry=map[x][y].getHungry();
		
		 return map[x][y];
	}

	/*public void setMap(String map[][]) {
		this.map = map;
	}*/
	public void setValue(int x, int y, LivingThing object)
	{
		map[x][y] = object;
		object.setxPosition(x);
		object.setyPosition(y);
	}
	
	public void printMap()
	{
		///// show the inserted map
		for (int i = 0; i < maxX; i++)
		{
			for (int j = 0; j < maxY; j++)
			{
				System.out.print(map[i][j].getName()+"\t");
			}
			System.out.println();
		}
	}
	
	
	public void inserting()
	{
		Scanner scan = new Scanner(System.in);
		
		Random rand2 = new Random();
		System.out.println("Please enter the number of the organism in this world: ");
		int amount=scan.nextInt();
		int k=0;
		while(k<amount)
		{
			Random rand = new Random();
			int x = rand.nextInt(maxX);
			int y = rand.nextInt(maxY);
			
			while(!map[x][y].getName().equals("*"))
			{
				Random randa = new Random();
				x = randa.nextInt(maxX);
				y = randa.nextInt(maxY);
			}
			
			
			int RandomAnimal = rand2.nextInt(12)+1;
			switch(RandomAnimal)
			{
			case 1: Wolf w=new Wolf("w",13,23,22,44,x,y);
				setValue(x, y, w);break;
			case 2: Fox f=new Fox("f",12,23,22,44,x,y);
				setValue(x, y, f);break;		
			case 3: Hawk h=new Hawk("h",12,23,22,44,x,y);
				setValue(x, y, h);break;		
			case 4: Deer d=new Deer("d",12,23,22,44,x,y);
				setValue(x, y, d);break;		
			case 5: Rabbit r=new Rabbit("r",12,23,22,44,x,y);
				setValue(x, y, r);break;		
			case 6: Squirrel s=new Squirrel("s",12,23,22,44,x,y);
				setValue(x, y, s);break;		
			case 7: Mouse m=new Mouse("m",12,23,22,44,x,y);
				setValue(x, y, m);break;		
			case 8: Grasshopper gr=new Grasshopper("g",12,23,22,44,x,y);
				setValue(x, y, gr);break;		
			case 9: Caterpillar c=new Caterpillar("c",12,23,22,44,x,y);
				setValue(x, y, c);break;		
			case 10: Bluejay b = new Bluejay("b",12,23,22,44,x,y);
				setValue(x, y, b);break;		
			case 11: Grass g= new Grass("G",12,10,0,0,x,y);
				setValue(x, y, g);break;		
			case 12: Tree t = new Tree("T",12,10,0,0,x,y);
				setValue(x, y, t);break;
			}

			k++;
		}
		
		
	}
	
	public void moving()
	{
		boolean nameFound = false;
		String searchingName1="";
		Random rand = new Random();
		int RandomAnimal = rand.nextInt(12)+1;
		switch(RandomAnimal)
		{
		case 1: searchingName1="w";
			break;
		case 2: searchingName1="f";
			break;		
		case 3: searchingName1="h";
			break;		
		case 4: searchingName1="d";
			break;		
		case 5: searchingName1="r";
			break;		
		case 6: searchingName1="s";
			break;		
		case 7: searchingName1="m";
			break;		
		case 8: searchingName1="gr";
			break;		
		case 9: searchingName1="c";
			break;		
		case 10: searchingName1="b";
			break;		
		case 11: searchingName1="G";
			break;		
		case 12: searchingName1="T";
			break;
		}
		
		int i = 0;
		int j = 0;
		for (i = 0; i < maxX;i++)
		{
			for (j = 0;j < maxY; j++)
			{

				if (map[i][j].getName().equals(searchingName1))
				{
					nameFound = true;
					break;
					
				}
					
			}
			if(nameFound == true)
			{
				break;
			}//System.out.print(j);
		}
		if(searchingName1.equals("G")||searchingName1.equals("T"))
		{
			System.out.println("Plant grows well after the rain.");
		}
		else if (nameFound == true)
		{
			Random rand2 = new Random();
			int direction=rand2.nextInt(4)+1;
			
			Random rand3 = new Random();
			int movesteps=rand3.nextInt(4)+1;
			// going up
			if (direction == 1 && i-movesteps >=0)
			{
				
				if(map[i-movesteps][j].getName().equals("*"))
				{
					map[i-movesteps][j] = map[i][j];
					map[i][j]= new LivingThing();
					map[i][j].setName("*");
				System.out.println(map[i-movesteps][j].getName()+" walks "+movesteps+" steps in the up direction.");
				}
				else
				{
					if (map[i][j].eat(map[i-movesteps][j]))
					{
						System.out.println(map[i][j].getName()+" walks "+movesteps+" steps in the up direction.");
						map[i-movesteps][j] = map[i][j];
						map[i][j]= new LivingThing();
						map[i][j].setName("*");

					}
					else if (map[i-movesteps][j].eat(map[i][j]))
					{
						System.out.println(map[i][j].getName() +" walks "+movesteps+" steps in the up direction.");
						System.out.println(map[i][j].getName() +" has been eaten!!!");
						map[i][j]= new LivingThing();
						map[i][j].setName("*");
					}
					else
					{
						// no change  of both 
						System.out.println("because " + map[i][j].getName()+" walks "+movesteps+" steps in the up direction.");
						System.out.println(map[i][j].getName() + " go back to the original position!");
					}
					//map[i][j].eat(map[i-movesteps][j]);
				}
			}
			// going down 
			else if (direction == 2 && i+movesteps< maxX)
			{
				if(map[i+movesteps][j].getName().equals("*"))
				{
				map[i+movesteps][j] = map[i][j];
				map[i][j]= new LivingThing();
				map[i][j].setName("*");
				System.out.println(map[i+movesteps][j].getName()+" walks "+movesteps+" steps in the down direction.");
				}
				else
				{
					if (map[i][j].eat(map[i+movesteps][j]))
					{
						System.out.println(map[i][j].getName()+" walks "+movesteps+" steps in the down direction.");
						map[i+movesteps][j] = map[i][j];
						map[i][j]= new LivingThing();
						map[i][j].setName("*");

					}
					else if (map[i+movesteps][j].eat(map[i][j]))
					{
						System.out.println(map[i][j].getName() +" walks "+movesteps+" steps in the down direction.");
						System.out.println(map[i][j].getName() +" has been eaten!!!");
						map[i][j]= new LivingThing();
						map[i][j].setName("*");
					}
					else
					{
						// no change  of both 
						System.out.println("because " + map[i][j].getName()+" walks "+movesteps+" steps in the down direction.");
						System.out.println(map[i][j].getName() + " go back to the original position!");
					}
					//map[i][j].eat(map[i-movesteps][j]);
				}
				}
			// going left
			else if (direction == 3 && j-movesteps >=0)
			{
				if(map[i][j-movesteps].getName().equals("*"))
				{
				map[i][j-movesteps] = map[i][j];
				map[i][j]= new LivingThing();
				map[i][j].setName("*");
				System.out.println(map[i][j-movesteps].getName()+" walks "+movesteps+" steps in the left direction.");
				}
				else
				{
					if (map[i][j].eat(map[i][j-movesteps]))
					{
						System.out.println(map[i][j].getName()+" walks "+movesteps+" steps in the left direction.");
						map[i][j-movesteps] = map[i][j];
						map[i][j]= new LivingThing();
						map[i][j].setName("*");

					}
					else if (map[i][j-movesteps].eat(map[i][j]))
					{
						System.out.println(map[i][j].getName() +" walks "+movesteps+" steps in the left direction.");
						System.out.println(map[i][j].getName() +" has been eaten!!!");
						map[i][j]= new LivingThing();
						map[i][j].setName("*");
					}
					else
					{
						// no change  of both 
						System.out.println("because " + map[i][j].getName()+" walks "+movesteps+" steps in the left direction.");
						System.out.println(map[i][j].getName() + " go back to the original position!");
					}
					//map[i][j].eat(map[i-movesteps][j]);
				}
				}
			// going right
			else if (direction == 4 && j+movesteps < maxY)
			{
				if(map[i][j+movesteps].getName().equals("*"))
				{
				map[i][j+movesteps] = map[i][j];
				map[i][j]= new LivingThing();
				map[i][j].setName("*");
				System.out.println(map[i][j+movesteps].getName()+" walks "+movesteps+" steps in the right direction.");
			
				}
				else
				{
					if (map[i][j].eat(map[i][j+movesteps]))
					{
						System.out.println(map[i][j].getName()+" walks "+movesteps+" steps in the right direction.");
						map[i][j+movesteps] = map[i][j];
						map[i][j]= new LivingThing();
						map[i][j].setName("*");

					}
					else if (map[i][j+movesteps].eat(map[i][j]))
					{
						System.out.println(map[i][j].getName() +" walks "+movesteps+" steps in the right direction.");
						System.out.println(map[i][j].getName() +" has been eaten!!!");
						map[i][j]= new LivingThing();
						map[i][j].setName("*");
					}
					else
					{
						// no change  of both 
						System.out.println("because " + map[i][j].getName()+" walks "+movesteps+" steps in the right direction.");
						System.out.println(map[i][j].getName() + " go back to the original position!");
					}
					//map[i][j].eat(map[i-movesteps][j]);
				}
				}
			else
			{
				System.out.println("The animal in the position row="+i +",col="+j+" is taking a break.");
			}
			//System.out.print(i);
		}
		if(nameFound == false)
		{
			System.out.println("Sunny weather, some animals are enjoying the sunshine.");
		}
	}
	
	
	
	public void starvation()
	{
		for (int i = 0; i <maxX; i++)
		{
			for (int j = 0; j<maxY; j++)
			{
				if (!map[i][j].getName().equals("*") && !map[i][j].getName().equals("T") && !map[i][j].getName().equals("G"))
				{
					map[i][j].setEnergy(map[i][j].getEnergy() -5);
					System.out.println(map[i][j].getName() + "'s energy is "+ map[i][j].getEnergy()+ " ." );
					if (map[i][j].getEnergy() <=0)
					{
						map[i][j].setDeath(true);
						System.out.println(map[i][j].getName() + "died due to starvation." );
						map[i][j]= new LivingThing();
						map[i][j].setName("*");
					}
				}

			}
		}
	}
}
