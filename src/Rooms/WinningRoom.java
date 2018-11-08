package Rooms;

import Game.Runner;
import People.Person;

public class WinningRoom extends Room
{

	public WinningRoom(int x, int y) {
		super(x, y);

	}

	/**
	 * Triggers the game ending conditions.
	 * @param x the Person entering
	 */
	@Override
	public void enterRoom(Person x) {

		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
		System.out.println("Oh yeah! Now you remember! Here are the bombs you placed. A giant stick of dynamite and an old fashioned black bomb!");
		System.out.println("When you get all six codes, you can be done with this city!");
	}
	public void whatYouSee(Person x)
	{
		System.out.println("A huge black thing and a huge red thing are on this block, they look kinda dangerous");
	}


}
