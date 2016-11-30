package project;

import java.util.Random;
import java.util.Scanner;

public class main{
	static Scanner scan = new Scanner(System.in);
	public static void main (String[] args)
	{

		Map map = new Map(10,10);
		int selection;
		/////////////////////////////////////////////////////////////////////////
		///////////ask for the selection/////////////

		Wolf w=new Wolf("w",13,23,22,44);
		Fox f=new Fox("f",12,23,22,44);
		Squirrel s=new Squirrel("s",12,23,22,44);
		Deer d=new Deer("d",12,23,22,44);
		Grass g= new Grass("G",12,0,0,0);
		Mouse m=new Mouse("m",12,23,22,44);
		Hawk h=new Hawk("h",12,23,22,44);
		
		w.eat(s);
		s.print();
		/*do
		{
			System.out.println("Saskatchewan prairies........");
			System.out.println("------------------------");
			System.out.println("Please enter a selection:");
			System.out.println("Press <1> for setting organism in the environment");
			System.out.println("Press <2> for moving");
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
					System.out.println("-------------------");
					System.out.println("                   ");
				}
				
				map.printMap();
			}
			else if (selection != 0)
			{
				System.out.println("Your input is something wrong. try that again");
			}
			else 
			{
				break;
			}
		}while (true);*/
	}
	
}
