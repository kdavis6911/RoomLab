package Rooms;

import People.Person;

public class AliensBoss extends Room {
    Person occupant;
    int xLoc,yLoc;

    public AliensBoss(int x, int y)
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
        System.out.println("What the heck? You can't believe your eyes as you step forward a little more.");
        System.out.println("Yes, Aliens. We come in peace! They chant, as their giant alien ship hangs in the background");
        System.out.println("One of them holds their hand out, you're hesitant, but you shake it anyway");
        System.out.println("You yell as electricity runs through your body! They all start laughing, it's on now! Make your first move");
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
    }
    public void whatYouSee(Person x)
    {
        System.out.println("Some blurry gray things are standing there, eerily, try preparing before you approach them");
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
