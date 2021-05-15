package implementations;

import interfaces.Duck;
import interfaces.Turkey;

public class TurkeyAdapter implements Duck {
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        System.out.println("implementations.TurkeyAdapter::implementations.TurkeyAdapter()");
        this.turkey = turkey;
        System.out.println("interfaces.Turkey Reference: " + turkey);
    }

    @Override
    public void quack() {
        System.out.println("interfaces.Turkey Reference: " + turkey);
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
