package Game;

import People.Person;
import Rooms.*;

import java.util.Scanner;

public class Runner {
	

	private static boolean gameOn = true;
	
	public static void main(String[] args)
	{
		Room[][] building = new Room[5][5];
		
		//Fill the building with normal rooms
		for (int x = 0; x<building.length; x++)
		{
			for (int y = 0; y < building[x].length; y++)
			{
				building[x][y] = new Room(x,y);
			}
		}
		
		//Create a random winning room.
		int x = (int)(Math.random()*building.length);
		int y = (int)(Math.random()*building.length);
		building[x][y] = new WinningRoom(x, y);

		x = (int)(Math.random()*building.length);
		y = (int)(Math.random()*building.length);
		building[x][y] = new TankBoss(x, y);

		x = (int)(Math.random()*building.length);
		y = (int)(Math.random()*building.length);
		building[x][y] = new LaserDudeBoss(x, y);

		x = (int)(Math.random()*building.length);
		y = (int)(Math.random()*building.length);
		building[x][y] = new NinjaHouseBoss(x, y);

		x = (int)(Math.random()*building.length);
		y = (int)(Math.random()*building.length);
		building[x][y] = new AliensBoss(x, y);

		x = (int)(Math.random()*building.length);
		y = (int)(Math.random()*building.length);
		building[x][y] = new BomberPlaneBoss(x, y);

		x = (int)(Math.random()*building.length);
		y = (int)(Math.random()*building.length);
		building[x][y] = new AdamSandlerBoss(x, y);

		x = (int)(Math.random()*building.length);
		y = (int)(Math.random()*building.length);
		building[x][y] = new GuitarRoom(x, y);

		x = (int)(Math.random()*building.length);
		y = (int)(Math.random()*building.length);
		building[x][y] = new OptimusPrimeBlock(x, y);

		x = (int)(Math.random()*building.length);
		y = (int)(Math.random()*building.length);
		building[x][y] = new BazookaBlock(x, y);

		x = (int)(Math.random()*building.length);
		y = (int)(Math.random()*building.length);
		building[x][y] = new KnifeBlock(x, y);

		x = (int)(Math.random()*building.length);
		y = (int)(Math.random()*building.length);
		building[x][y] = new MonkeyRoom(x, y);

		x = (int)(Math.random()*building.length);
		y = (int)(Math.random()*building.length);
		building[x][y] = new BandageRoom(x, y);

		x = 0;
		y = 0;
		building[x][y] = new FlashlightRoom(x, y);



		 
		 //Setup player 1 and the input scanner
		String[] inventory = new String[7];
		Person player1 = new Person("FirstName", "FamilyName", 0,0, 30, inventory);
		Scanner in = new Scanner(System.in);
		System.out.println("You're in a city that you want to blow up. You remember putting bombs on a certain block but you forgot where they were");
		System.out.println("Your codes got stolen by 6 people in the city, and they won't give them back without a fight");
		System.out.println("Go around the city, get some weapons, and destroy the people who have your codes so you can blow everything up!");
		System.out.println("Right now you can only look at your surrounding blocks and move, type n, s, e, w to move, and type look n, look e, etc to examine the next block in that direction");
		System.out.println("");
		building[0][0].enterRoom(player1);
		while(gameOn)
		{
			System.out.println("What would you like to do?");
			String move = in.nextLine();
			if(Looking(move, player1, building))
			{
				System.out.print("");

			}
			else {
				System.out.println("You're at the edge of the city, You're staring at a barren desert right now");
			}

			if(validMove(move, player1, building))
			{
				System.out.println("Your coordinates: row = " + player1.getxLoc() + " col = " + player1.getyLoc());
				
			}
			else {
				System.out.println("Please choose a valid move.");
			}

			
		}
		in.close();
	}

	/**
	 * Checks that the movement chosen is within the valid game map.
	 * @param move the move chosen
	 * @param p person moving
	 * @param map the 2D array of rooms
	 * @return
	 */
	public static boolean validMove(String move, Person p, Room[][] map)
	{
		move = move.toLowerCase().trim();
		switch (move) {
			case "n":
				if (p.getxLoc() > 0)
				{
					map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
					map[p.getxLoc()-1][p.getyLoc()].enterRoom(p);
					return true;
				}
				else
				{
					return false;
				}
			case "e":
				if (p.getyLoc()< map[p.getyLoc()].length -1)
				{
					map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
					map[p.getxLoc()][p.getyLoc() + 1].enterRoom(p);
					return true;
				}
				else
				{
					return false;
				}

			case "s":
				if (p.getxLoc() < map.length - 1)
				{
					map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
					map[p.getxLoc()+1][p.getyLoc()].enterRoom(p);
					return true;
				}
				else
				{
					return false;
				}

			case "w":
				if (p.getyLoc() > 0)
				{
					map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
					map[p.getxLoc()][p.getyLoc()-1].enterRoom(p);
					return true;
				}
				else
				{
					return false;
				}
			default:
				break;
					
		}
		return true;
	}
	public static boolean Looking(String move, Person p, Room[][] map)
	{
		move = move.toLowerCase().trim();
		switch (move) {
			case "look n":
				if (p.getxLoc() > 0)
				{
					map[p.getxLoc()-1][p.getyLoc()].whatYouSee(p);
					return true;
				}
				else
				{
					return false;
				}
			case "look e":
				if (p.getyLoc()< map[p.getyLoc()].length -1)
				{
					map[p.getxLoc()][p.getyLoc() + 1].whatYouSee(p);
					return true;
				}
				else
				{
					return false;
				}

			case "look s":
				if (p.getxLoc() < map.length - 1)
				{
					map[p.getxLoc()+1][p.getyLoc()].whatYouSee(p);
					return true;
				}
				else
				{
					return false;
				}

			case "look w":
				if (p.getyLoc() > 0)
				{
					map[p.getxLoc()][p.getyLoc()-1].whatYouSee(p);
					return true;
				}
				else
				{
					return false;
				}
			default:
				break;

		}
		return true;
	}
	public static boolean Using(String move, Person p, Room[][] map)
	{
		move = move.toLowerCase().trim();
		switch (move) {
			case "look n":
				if (p.getxLoc() > 0)
				{
					map[p.getxLoc()-1][p.getyLoc()].whatYouSee(p);
					return true;
				}
				else
				{
					return false;
				}
			case "look e":
				if (p.getyLoc()< map[p.getyLoc()].length -1)
				{
					map[p.getxLoc()][p.getyLoc() + 1].whatYouSee(p);
					return true;
				}
				else
				{
					return false;
				}

			case "look s":
				if (p.getxLoc() < map.length - 1)
				{
					map[p.getxLoc()+1][p.getyLoc()].whatYouSee(p);
					return true;
				}
				else
				{
					return false;
				}

			case "look w":
				if (p.getyLoc() > 0)
				{
					map[p.getxLoc()][p.getyLoc()-1].whatYouSee(p);
					return true;
				}
				else
				{
					return false;
				}
			default:
				break;

		}
		return true;
	}
	public static void gameOff()
	{
		gameOn = false;
	}
	


}
