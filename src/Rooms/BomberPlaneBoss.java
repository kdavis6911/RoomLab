package Rooms;

import People.Person;

public class BomberPlaneBoss {
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
        System.out.println("Wow! You're standing in front of the city's military generals!");
        System.out.println("He jumps into his plane without saying a word, and you kinda just stand there as he flies up");
        System.out.println("All of a sudden, you see bombs drop from the plane! This guy has one of the codes for sure!");
        System.out.println("Your opponent's all the way up in the air, so you have to be a good shot, use something with range!");
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
