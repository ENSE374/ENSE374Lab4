package project;

import java.util.Random;
import java.util.Scanner;

public class Map {
	private String[][] map;
	private int maxX;
	private int maxY;
	public Map (int x, int y)
	{
		map = new String[x][y];
		for (int i = 0; i < x; i++)
		{
			for (int j = 0; j <y; j++)
			{
				map[i][j] = "*";
			}
		}
		maxX = x;
		maxY = y;
	}
	public String[][] getMap() {
		return map;
	}
	public String getValue(int x, int y) {
		 String a = map[x][y];
		 return a;
	}

	public void setMap(String map[][]) {
		this.map = map;
	}
	public void setValue(int x, int y, String value)
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
				System.out.print(map[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	
	public void inserting()
	{
		Scanner scan = new Scanner(System.in);
		String name;
		int id=0;
		int hungry=0;
		int speed=0;
		int energy=0;
		
		Random rand = new Random();
		int x = rand.nextInt(maxX);
		int y = rand.nextInt(maxY);
		
		///////////////////////////////////////
		// some error coordinate such that both animals or plants may be the same, may check follow
		////////////////////////////////////
		System.out.println("Please enter an aminal or a plant:");
		System.out.println("1 for wolf:");
		System.out.println("2 for fox:");
		System.out.println("3 for hawk:");
		System.out.println("4 for deer:");
		System.out.println("5 for rabbit:");
		System.out.println("6 for squirrel:");
		System.out.println("7 for mouse:");
		System.out.println("8 for grasshopper:");
		System.out.println("9 for caterpillar:");
		System.out.println("10 for bluejay:");
		System.out.println("11 for grass:");
		System.out.println("12 for tree:");
		int number = scan.nextInt();
		
		System.out.println("Please enter a name:");
		name = scan.next();
		System.out.println("Please enter an id:");
		id = scan.nextInt();
		System.out.println("Please enter a energy:");
		energy = scan.nextInt();
		if (number != 11 && number !=12)
		{
			System.out.println("Please enter a hungry:");
			hungry = scan.nextInt();
			System.out.println("Please enter a speed:");
			speed = scan.nextInt();
		}
		
		
		switch(number)
		{
		case 1: Wolf w=new Wolf(name,id,hungry,speed,energy);
			setValue(x, y, w.getName());break;
		case 2: Fox f=new Fox(name,id,hungry,speed,energy);
			setValue(x, y, f.getName());break;		
		case 3: Hawk h=new Hawk(name,id,hungry,speed,energy);
			setValue(x, y, h.getName());break;		
		case 4: Deer d=new Deer(name,id,hungry,speed,energy);
			setValue(x, y, d.getName());break;		
		case 5: Rabbit r=new Rabbit(name,id,hungry,speed,energy);
			setValue(x, y, r.getName());break;		
		case 6: Squirrel s=new Squirrel(name,id,hungry,speed,energy);
			setValue(x, y, s.getName());break;		
		case 7: Mouse m=new Mouse(name,id,hungry,speed,energy);
			setValue(x, y, m.getName());break;		
		case 8: Grasshopper gr=new Grasshopper(name,id,hungry,speed,energy);
			setValue(x, y, gr.getName());break;		
		case 9: Caterpillar c=new Caterpillar(name,id,hungry,speed,energy);
			setValue(x, y, c.getName());break;		
		case 10: Bluejay b = new Bluejay(name,id,hungry,speed,energy);
			setValue(x, y, b.getName());break;		
		case 11: Grass g= new Grass(name,id,energy);
			setValue(x, y, g.getName());break;		
		case 12: Tree t = new Tree(name,id,energy);
			setValue(x, y, t.getName());break;	
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

				if (searchingName == getValue(i,j))
				{
					nameFound = true;
					break; // element found 
				}
				System.out.print(j);
			}
			System.out.print(i);
		}
		if (nameFound == true)
		{
			// going up
			if (direction == 1 && i-1 >=0)
			{
				map[i-1][j] = map[i][j];
				map[i][j] = "*";
			}
			// going down 
			else if (direction == 2 && i+1< maxX)
			{
				map[i+1][j] = map[i][j];
				map[i][j] = "*";
			}
			// going left
			else if (direction == 3 && j-1 >=0)
			{
				map[i][j-1] = map[i][j];
				map[i][j] = "*";
			}
			// going right
			else if (direction == 4 && j+1 <= maxY)
			{
				map[i][j+1] = map[i][j];
				map[i][j] = "*";
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
