package strategy;

public class Dog extends Animal {

    public Dog() {
        super();
        // Set ability to fly polymorphically
        setFLyingAbility(new CanNotFly());
        setSound("Hao Hao");
    }

    public void digHole() {
        System.out.println("I'm diging a hole");
    }
}
