package People;

/**
 * Person represents the player as they move through the game.
 */
public class Person {
	String firstName;
	String familyName;
	int xLoc, yLoc;
	int health;
	String[] inventory;


	public int getxLoc() {
		return xLoc;
	}

	public void setxLoc(int xLoc) {
		this.xLoc = xLoc;
	}

	public int getyLoc() {
		return yLoc;
	}

	public void setyLoc(int yLoc) {
		this.yLoc = yLoc;
	}

	public void sethealth(int health) { this.health = health; }

	public int gethealth(int health) { return health; }

	public void setinv (String[] inventory) { this.inventory = inventory; }

	public String[] getinv (String[] inventory) { return inventory; }

	public Person (String firstName, String familyName, int xLoc, int yLoc, int health, String[] inventory)
	{
		this.firstName = firstName;
		this.familyName = familyName;
		this.xLoc = xLoc;
		this.yLoc = yLoc;
		this.health = health;
		this.inventory = inventory;
	}


}
