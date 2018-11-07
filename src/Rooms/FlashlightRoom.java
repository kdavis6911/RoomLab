package Rooms;

import People.Person;

public class FlashlightRoom extends Room {
    Person occupant;
    int xLoc,yLoc;

    public FlashlightRoom(int x, int y)
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
        System.out.println("Inside your tent, you only have a flashlight. Why you only brought a flashlight is beyond me");
        System.out.println("Take it if you want");
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
    }
    public void whatYouSee(Person x)
    {
        System.out.println("Your tent, no reason to go back since you only brought a flashlight. Why would you do that?");
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
