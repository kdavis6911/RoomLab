package Bosses;

import People.Person;

public class Ninja {
    int bhealth;

    

    public boolean cantleave(Person x)
    {
        if (this.bhealth>0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
