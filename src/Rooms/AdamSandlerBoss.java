package Rooms;

import People.Person;

public class AdamSandlerBoss extends Room {
    Person occupant;
    int xLoc,yLoc;

    public AdamSandlerBoss(int x, int y)
    {
        super(x, y);
        xLoc = x;
        yLoc = y;
    }

    /**
     * Method controls the results when a person enters this room.
     * @param x the Person entering
     */
    public void enterRoom(Person x)
    {
        System.out.println("On this block, you see a suspicious looking dude wearing glasses and a fake nose");
        System.out.println("You walk up to him and rip them off his face, Oh my God! It's Adam Sandler!");
        System.out.println("He tells you that someone dropped a piece of paper with some weird writing on it");
        System.out.println("He shows it to you, it's a code! Lucky you! You snatch it from him then run like the wind!");
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
    }
    public void whatYouSee(Person x)
    {
        System.out.println("There's a crowd, but you hear of someone famous coming to this city, he could be on that block");
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
