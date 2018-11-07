package Rooms;

import People.Person;

public class BandageRoom extends Room {
    Person occupant;
    int xLoc,yLoc;

    public BandageRoom(int x, int y)
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
        System.out.println("Inside the hospital, there's a case that says Break Glass in case of emergency");
        System.out.println("You try using your hands, but the glass just won't break");
        System.out.println("In the case, you see bandages which might be helpful");
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
    }
    public void whatYouSee(Person x)
    {
        System.out.println("There's a hospital on the next block");
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
