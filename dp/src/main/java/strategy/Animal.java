package strategy;

public class Animal {

    private String name;
    private String sound;
    private int weight;

    private Flys flyingType;

    public String tryToFly(){
        return flyingType.fly();
    }

    public void setFLyingAbility(Flys flyingType) {
        this.flyingType = flyingType;
    }

    /**
     * Getter for name
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for name
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for sound
     *
     * @return sound
     */
    public String getSound() {
        return sound;
    }

    /**
     * Setter for sound
     *
     * @param sound
     */
    public void setSound(String sound) {
        this.sound = sound;
    }

    /**
     * Getter for weight
     *
     * @return weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Setter for weight
     *
     * @param weight
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }
}
