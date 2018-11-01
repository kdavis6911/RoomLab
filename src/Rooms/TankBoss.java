package Rooms;

import People.Person;

public class TankBoss {
    Person occupant;
    int xLoc,yLoc;

    public Room(int x, int y)
    {
        xLoc = x;
        yLoc = y;
    }

    /**
     * Method controls the results when a person enters this room.
     * @param x the Person entering
     */
    public void enterRoom(Person x)
    {
        System.out.println("There's a tank here, at first it looks idle, but someone comes out of the top!");
        System.out.println("We'll destroy you before you destroy our city! He shouts");
        System.out.println("This guy has to have one of the codes! Maybe there's a better way of getting if from them, other than destroying the tank");
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
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
