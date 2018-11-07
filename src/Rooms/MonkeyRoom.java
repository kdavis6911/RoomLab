package Rooms;

import People.Person;

public class MonkeyRoom extends Room {
    Person occupant;
    int xLoc,yLoc;

    public MonkeyRoom(int x, int y)
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
        System.out.println("There's a small petting zoo here! You got sheep, bunnies, guinea pigs");
        System.out.println("And a monkey? Is a monkey supposed to be here?");
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
    }
    public void whatYouSee(Person x)
    {
        System.out.println("A petting zoo? Dude, bunnies are some of the greatest animals on earth!");
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
