package com.company;

import java.util.ArrayList;

public class A implements  Watched{
    //ATTRIBUTES
    public ArrayList<AO> observersOfA = new ArrayList<AO>();
    State myState;

    //METHODS
    @Override
    public void setState(State s)
    {

            this.myState = s;
            System.out.println("I 'A' had an state change and now i'm " + s.mood);
            for (AO observer : observersOfA)
            {

                observer.setState(s);

            }

    }
}
