package implementations;

import interfaces.Turkey;

public class WildTurkey implements Turkey {
    public WildTurkey() {
        System.out.println("implementations.WildTurkey::implementations.WildTurkey()");
    }

    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
