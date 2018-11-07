package Rooms;

import People.Person;

public class NinjaHouseBoss extends Room {
    Person occupant;
    int xLoc,yLoc;

    public NinjaHouseBoss(int x, int y)
    {
        super(x,y);
        xLoc = x;
        yLoc = y;
    }

    /**
     * Method controls the results when a person enters this room.
     * @param x the Person entering
     */
    public void enterRoom(Person x)
    {
        System.out.println("There's a small house here, not really that inviting, but you go inside anyway");
        System.out.println("It's pitch black, but your eyes adjust after a minute.");
        System.out.println("Huge mistake! A ninja drops down from the ceiling, and waits for you to make your first move!");
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
    }
    public void whatYouSee(Person x)
    {
        System.out.println("A small house looms eerily in the distance, along with some grass and a tree");
    }

    /**
     * Removes the player from the room.
     * @param x
     */
    public void leaveRoom(Person x)
    {
        occupant = null;
    }
}
