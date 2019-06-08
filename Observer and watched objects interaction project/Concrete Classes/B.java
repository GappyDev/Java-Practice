package com.company;

import java.util.ArrayList;

public class B implements Watched {
    //ATTRIBUTES
    public ArrayList<BO> observersOfB = new ArrayList<BO>();
    State myState;

    //METHODS
    @Override
    public void setState(State s)
    {

        this.myState = s;
        System.out.println("I 'B' had an state change and now i'm " + s.mood);
        for (BO observer : observersOfB)
        {

            observer.setState(s);

        }

    }
}
