package project;

import java.util.Random;
import java.util.Scanner;

public class main{
	static Scanner scan = new Scanner(System.in);
	public static void main (String[] args)
	{

		Map map = new Map(5,5);
		int selection;
		/////////////////////////////////////////////////////////////////////////
		///////////ask for the selection/////////////

		do
		{
			System.out.println("Saskatchewan prairies........");
			System.out.println("------------------------");
			System.out.println("Please enter a selection:");
			System.out.println("1 for inserting a new element in the environment");
			System.out.println("2 for moving");
			System.out.println("0 for exit the program");
			selection = scan.nextInt();
			if (selection == 1)
			{

				map.inserting();
				map.printMap();
			
			}
			else if (selection == 2)
			{
				System.out.println("Please enter a name of an animal or a plant");
				String inputName = scan.next();
				System.out.println("Please enter the direction: \n 1 for up \n 2 for down \n 3 for left \n 4 for right");
				int direction = scan.nextInt();
				
				map.moving(inputName, direction);
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
		}while (true);
	}
	
}
