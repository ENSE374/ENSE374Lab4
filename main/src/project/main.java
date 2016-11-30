package project;

import java.util.Random;
import java.util.Scanner;


public class main{
	static Scanner scan = new Scanner(System.in);
	public static void main (String[] args)
	{
		int maxX = 10;
		int maxY = 10;
		Map map = new Map(maxX,maxY);
		int selection;
		
		System.out.println("Instruction");
		System.out.println("Wolf --- w");
		System.out.println("Fox ---	 f");
		System.out.println("Hawk --- h");
		System.out.println("Deer --- d");
		System.out.println("Rabbit --- r");
		System.out.println("Squirrel --- s");
		System.out.println("Mouse --- m");
		System.out.println("Grasshopper --- g");
		System.out.println("Caterpillar --- c");
		System.out.println("Bluejay --- b");
		System.out.println("Grass --- G");
		System.out.println("Tree --- T");
		System.out.println("---------------------------------------------------");
		do
		{
			System.out.println("Saskatchewan prairies........");
			System.out.println("------------------------");
			System.out.println("Please enter a selection:");
			System.out.println("Press <1> for setting organism in the environment");
			System.out.println("Press <2> for moving");
			System.out.println("Press <3> for the Introductions");
			System.out.println("Press <0> for exiting the program");
			
			selection = scan.nextInt();
			if (selection == 1)
			{

				map.inserting();
				map.printMap();
			
			}
			else if (selection == 2)
			{
				System.out.println("Please give the date that the world can has: ");
				int day = scan.nextInt();
				int initial;
				for( initial=1; initial<=day; initial++)
				{
					System.out.println("Day "+initial+": ");
					System.out.println("-------------------");
					
					Random rand = new Random();
					int numbersOfAnimals=rand.nextInt(7)+3;
					
					for(int i=0;i<numbersOfAnimals;i++)
					{
						map.moving();
						
						
					}
					
					map.starvation();
					map.printMap();
					System.out.println("-------------------");
					System.out.println("                   ");
					
				}
				
			}
			
			else if(selection == 0)
			{
				System.out.println("Thanks for using!");
				break;
			}
			else if(selection == 3)
			{
				System.out.println("This is a small program that based on the food chain on Saskatchewan prairies.");
				System.out.println("Users can get some basic information about the relationships about different ");
				System.out.println("animals especially for childrens.");
				System.out.println("               developers: Shuaihao Zhao, Xioajie Chen, Jinpeng Chen, Jiawei Huo");
				break;
			}
			else 
			{
				System.out.println("Your input is something wrong. try that again");
			}
		}while (true);
	}
	
}
