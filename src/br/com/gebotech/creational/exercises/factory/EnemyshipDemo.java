package br.com.gebotech.exercises.factory;

import br.com.gebotech.factory.Website;
import br.com.gebotech.factory.WebsiteFactory;
import br.com.gebotech.factory.WebsiteType;

public class EnemyshipDemo {

    public static void main(String[] args) {
        EnemyShip enemyShip = EnemyShipFactory.makeEnemyShip(ShipType.UFO);

        System.out.println(enemyShip.getName());

        enemyShip = EnemyShipFactory.makeEnemyShip(ShipType.ROCKET);

        System.out.println(enemyShip.getName());
    }
}
