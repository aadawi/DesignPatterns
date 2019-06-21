package factory;

public class EnemyShipFactory {

    public EnemyShip makeEnemyShip(String type) {
        if ("U".equalsIgnoreCase(type)) {
            return new UFOShip();
        } else if ("R".equalsIgnoreCase(type)) {
            return new RocketEnemyShip();
        } else if ("B".equalsIgnoreCase(type)) {
            return new BigUFOEnemyShip();
        }
        return null;
    }
}
