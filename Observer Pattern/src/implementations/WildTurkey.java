public class WildTurkey implements Turkey {
    public WildTurkey() {
        System.out.println("WildTurkey::WildTurkey()");
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
