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
		
		Random rand2 = new Random();
		System.out.println("Please enter the number of the organism in this world: ");
		int amount=scan.nextInt();
		for(int k=0;k<=amount;k++)
		{
			Random rand = new Random();
			int x = rand.nextInt(maxX);
			int y = rand.nextInt(maxY);
			
			while(map[x][y]!="*")
			{
				Random randa = new Random();
				x = randa.nextInt(maxX);
				y = randa.nextInt(maxY);
			}
			
			
			int RandomAnimal = rand2.nextInt(12);
			switch(RandomAnimal)
			{
			case 1: Wolf w=new Wolf("w",13,23,22,44);
				setValue(x, y, w.getName());break;
			case 2: Fox f=new Fox("f",12,23,22,44);
				setValue(x, y, f.getName());break;		
			case 3: Hawk h=new Hawk("h",12,23,22,44);
				setValue(x, y, h.getName());break;		
			case 4: Deer d=new Deer("d",12,23,22,44);
				setValue(x, y, d.getName());break;		
			case 5: Rabbit r=new Rabbit("r",12,23,22,44);
				setValue(x, y, r.getName());break;		
			case 6: Squirrel s=new Squirrel("s",12,23,22,44);
				setValue(x, y, s.getName());break;		
			case 7: Mouse m=new Mouse("m",12,23,22,44);
				setValue(x, y, m.getName());break;		
			case 8: Grasshopper gr=new Grasshopper("g",12,23,22,44);
				setValue(x, y, gr.getName());break;		
			case 9: Caterpillar c=new Caterpillar("c",12,23,22,44);
				setValue(x, y, c.getName());break;		
			case 10: Bluejay b = new Bluejay("b",12,23,22,44);
				setValue(x, y, b.getName());break;		
			case 11: Grass g= new Grass("G",12,23);
				setValue(x, y, g.getName());break;		
			case 12: Tree t = new Tree("T",12,22);
				setValue(x, y, t.getName());break;
			}

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
