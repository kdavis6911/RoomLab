package Rooms;

import People.Person;

public class OptimusPrimeBlock extends Room {
    Person occupant;
    int xLoc,yLoc;

    public OptimusPrimeBlock(int x, int y)
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
        System.out.println("This city block's ruined! Who could have done this? They might be on your side");
        System.out.println("Making your way through the ruined buildings, you see Optimus Prime of all things!");
        System.out.println("He turns toward you, I'm destroying your city whether you like it or not! He yells");
        System.out.println("He might have one of the codes, but you're not too sure. Maybe you can think of something to do");
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
    }
    public void whatYouSee(Person x)
    {
        System.out.println("Just a bunch of rubble, why was this block destroyed?");
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
