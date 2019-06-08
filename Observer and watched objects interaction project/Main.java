package com.company;

public class Main {

    //CLIENT CODE

    //Starting point
    public static void main(String[] args)
    {

        //A and B Objects instance
        A a = new A();
        B b = new B();

        //c,d,e,f objects instance
        C c1 = new C();
        C c2 = new C();
        D d1 = new D();
        D d2 = new D();
        E e1 = new E();
        E e2 = new E();
        F f1 = new F();
        F f2 = new F();

        //adding observers to a and b
        a.observersOfA.add(c1);
        a.observersOfA.add(c2);
        a.observersOfA.add(d1);
        a.observersOfA.add(d2);
        b.observersOfB.add(e1);
        b.observersOfB.add(e2);
        b.observersOfB.add(f1);
        b.observersOfB.add(f2);
        //state message
        a.setState(new State("Happy"));
        b.setState(new State("Sad"));

    }
}
