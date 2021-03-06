package Rooms;

import People.Person;

public class GuitarRoom extends Room {
    Person occupant;
    int xLoc,yLoc;

    public GuitarRoom(int x, int y)
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
        System.out.println("You're on a bustling city block, different types of people everywhere!");
        System.out.println("There's a hippie looking dude playing a guitar for change");
        System.out.println("If you talk to him, maybe he'll give it to you");
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
    }
    public void whatYouSee(Person x)
    {
        System.out.println("You hear some acoustic guitar playing on the next block");
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
