package strategy;

public class StrategyMain {

    public static void main(String[] args) {

        Animal bill = new Dog();
        Animal tweety = new Bird();

        System.out.println("D == "+ bill.tryToFly());
        System.out.println("B == "+ tweety.tryToFly());

        bill.setFLyingAbility(new ItFlays());

        System.out.println("D == "+ bill.tryToFly());
    }
}
