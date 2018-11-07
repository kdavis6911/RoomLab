package Rooms;

import People.Person;

public class KnifeBlock extends Room {
    Person occupant;
    int xLoc,yLoc;

    public KnifeBlock(int x, int y)
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
        System.out.println("As you walk through the huge crowd, you spot a knife on the ground!");
        System.out.println("Who would be stupid enough to drop a knife in the city? And nobody's picking it up?");
        System.out.println("Guess it's yours");
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
    }
    public void whatYouSee(Person x)
    {
        System.out.println("Just a crowd");
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
