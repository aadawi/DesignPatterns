package factory;

public class EnemyShip {
    private String name;
    private double amtDamage;

    public void followHeroShip(){
        System.out.println(getName()+"  Following hero ship");
    }

    public void enemyShipShoots(){
        System.out.println(getName() +" Attach and does: "+getAmtDamage());
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
     * Getter for amtDamage
     *
     * @return amtDamage
     */
    public double getAmtDamage() {
        return amtDamage;
    }

    /**
     * Setter for amtDamage
     *
     * @param amtDamage
     */
    public void setAmtDamage(double amtDamage) {
        this.amtDamage = amtDamage;
    }
}
