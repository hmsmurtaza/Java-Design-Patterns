import implementations.MallardDuck;
import implementations.TurkeyAdapter;
import implementations.WildTurkey;
import interfaces.Duck;

public class DuckTestDrive {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();

        WildTurkey wildTurkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);

        System.out.println("The interfaces.Turkey says...");
        wildTurkey.gobble();
        wildTurkey.fly();

        System.out.println("\nThe interfaces.Duck says...");
        testDuck(mallardDuck);

        System.out.println("\nThe implementations.TurkeyAdapter says...");
        testDuck(turkeyAdapter);
    }

    private static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
