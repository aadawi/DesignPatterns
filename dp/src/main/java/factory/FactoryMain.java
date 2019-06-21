package factory;

import java.util.Scanner;

public class FactoryMain {

    public static void main(String[] args) {

        EnemyShip enemyShip = null;
        for (int i = 0; i > -1; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter enemy ship type? (U/R/B):");
            String input = scanner.next();

            EnemyShipFactory enemyShipFactory = new EnemyShipFactory();
            enemyShip = enemyShipFactory.makeEnemyShip(input);
            if (enemyShip == null) {
                System.out.println("War Ended");
                break;
            }
            doStuffEnmey(enemyShip);
        }

    }

    private static void doStuffEnmey(EnemyShip enemyShip) {
        enemyShip.followHeroShip();
        enemyShip.enemyShipShoots();
    }
}
