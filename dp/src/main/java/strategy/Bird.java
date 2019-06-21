package strategy;

public class Bird extends Animal {
    public Bird() {
        super();
        // Set ability to fly polymorphically
        setFLyingAbility(new ItFlays());
        setSound("Tweet");
    }

    public void walk() {
        System.out.println("Walk like a bird");
    }
}
