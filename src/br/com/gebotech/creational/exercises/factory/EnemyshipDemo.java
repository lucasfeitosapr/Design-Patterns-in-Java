package br.com.gebotech.creational.exercises.factory;

public class EnemyshipDemo {

    public static void main(String[] args) {
        EnemyShip enemyShip = EnemyShipFactory.makeEnemyShip(ShipType.UFO);

        System.out.println(enemyShip.getName());

        enemyShip = EnemyShipFactory.makeEnemyShip(ShipType.ROCKET);

        System.out.println(enemyShip.getName());
    }
}
