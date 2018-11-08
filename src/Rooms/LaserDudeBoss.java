package Rooms;

import People.Person;

public class LaserDudeBoss extends Room {
    Person occupant;
    int xLoc,yLoc;

    public LaserDudeBoss(int x, int y)
    {
        super (x, y);
        xLoc = x;
        yLoc = y;
    }

    /**
     * Method controls the results when a person enters this room.
     * @param x the Person entering
     */
    public void enterRoom(Person x)
    {
        System.out.println("You walk into an alleyway, and strangely, there's some guy with goggles working on a machine");
        System.out.println("What's that? You ask, This is my patented Around the World Laser! He screams");
        System.out.println("Once I finish this baby, a laser will shoot, going all the way around the world, meeting at the back of the laser!");
        System.out.println("Then, one spin of this baby will destroy everything on earth!");
        System.out.println("This guy is mad! You want to destroy this stupid city, not the world! Use something to stop his plan!");
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
    }
    public void whatYouSee(Person x)
    {
        System.out.println("Through the crowd, you see an alleyway and a huge silver thing in it, treasure maybe? Try preparing before checking out some random silver thing in an alleyway");
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
