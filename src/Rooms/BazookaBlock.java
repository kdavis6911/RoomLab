package Rooms;

import People.Person;
import Rooms.Room;

public class BazookaBlock extends Room {
    Person occupant;
    int xLoc,yLoc;

    public BazookaBlock(int x, int y)
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
        System.out.println("In the crowd, you spot a military dude carrying a bazooka, and he knows you're out to destroy the city");
        System.out.println("He will shoot you on sight, if you want that bazooka, you can't draw attention to yourself");
        System.out.println("Try and take him out somehow!");
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
    }
    public void whatYouSee(Person x)
    {
        System.out.println("There's a crowd, but there's a small metal thing sticking up, maybe you should check it out");
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
