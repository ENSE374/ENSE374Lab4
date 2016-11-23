package project;

import java.util.Random;
import java.util.Scanner;

public class Map {
	private Animal[][] map;
	private int maxX;
	private int maxY;
	public Map (int x, int y)
	{
		map = new Animal[x][y];
		for (int i = 0; i < x; i++)
		{
			for (int j = 0; j <y; j++)
			{
				map[i][j]=new Animal();
				map[i][j].setName("*");
			}
		}
		maxX = x;
		maxY = y;
	}
	/*public String[][] getMap() {
		return map;
	}*/
	public Animal getValue(int x,int y) {
		
		 int energy=map[x][y].getEnergy();
		 String name = map[x][y].getName();
		 int id=map[x][y].getId();
		 int hungry=map[x][y].getHungry();
		
		 return map[x][y];
	}

	/*public void setMap(String map[][]) {
		this.map = map;
	}*/
	public void setValue(int x, int y, Animal value)
	{
		map[x][y] = value;
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
			
			
			int RandomAnimal = rand2.nextInt(12);
			switch(RandomAnimal)
			{
			case 1: Wolf w=new Wolf("w",13,23,22,44);
				setValue(x, y, w);break;
			case 2: Fox f=new Fox("f",12,23,22,44);
				setValue(x, y, f);break;		
			case 3: Hawk h=new Hawk("h",12,23,22,44);
				setValue(x, y, h);break;		
			case 4: Deer d=new Deer("d",12,23,22,44);
				setValue(x, y, d);break;		
			case 5: Rabbit r=new Rabbit("r",12,23,22,44);
				setValue(x, y, r);break;		
			case 6: Squirrel s=new Squirrel("s",12,23,22,44);
				setValue(x, y, s);break;		
			case 7: Mouse m=new Mouse("m",12,23,22,44);
				setValue(x, y, m);break;		
			case 8: Grasshopper gr=new Grasshopper("g",12,23,22,44);
				setValue(x, y, gr);break;		
			case 9: Caterpillar c=new Caterpillar("c",12,23,22,44);
				setValue(x, y, c);break;		
			case 10: Bluejay b = new Bluejay("b",12,23,22,44);
				setValue(x, y, b);break;		
			case 11: Grass g= new Grass("G",12,0,0,0);
				setValue(x, y, g);break;		
			case 12: Tree t = new Tree("T",12,0,0,0);
				setValue(x, y, t);break;
			}

			k++;
		}
		
		
	}
	
	public void moving(String searchingName, int direction)
	{
		boolean nameFound = false;
		int i = 0;
		int j = 0;
		for (i = 0; i < maxX;i++)
		{
			for (j = 0;j < maxY; j++)
			{

				if (map[i][j].getName().equals(searchingName))
				{
					nameFound = true;
					break; // element found 
				}
				//System.out.print(j);
			}
			//System.out.print(i);
		}
		if (nameFound == true)
		{
			// going up
			if (direction == 1 && i-1 >=0)
			{
				map[i-1][j] = map[i][j];
				
				map[i][j]= new Animal();
				map[i][j].setName("*");
			}
			// going down 
			else if (direction == 2 && i+1< maxX)
			{
				map[i+1][j] = map[i][j];
				map[i][j]= new Animal();
				map[i][j].setName("*");
			}
			// going left
			else if (direction == 3 && j-1 >=0)
			{
				map[i][j-1] = map[i][j];
				map[i][j]= new Animal();
				map[i][j].setName("*");
			}
			// going right
			else if (direction == 4 && j+1 < maxY)
			{
				map[i][j+1] = map[i][j];
				map[i][j]= new Animal();
				map[i][j].setName("*");
			}
			else
			{
				System.out.println("Cannot move to this direction because it is out of border");
			}
		}
		else
		{
			System.out.println("Name cannot be found");
		}
	}
}
