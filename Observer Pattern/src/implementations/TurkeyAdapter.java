public class TurkeyAdapter implements Duck {
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        System.out.println("TurkeyAdapter::TurkeyAdapter()");
        this.turkey = turkey;
        System.out.println("Turkey Reference: " + turkey);
    }

    @Override
    public void quack() {
        System.out.println("Turkey Reference: " + turkey);
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
