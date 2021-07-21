package br.com.gebotech.creational.exercises.factory;

public class EnemyShipFactory {

    public static EnemyShip makeEnemyShip(ShipType shipType){
        switch (shipType){
            case UFO: return new UFOEnemyShip();
            case ROCKET: return new RocketEnemyShip();
            default: return null;
        }
    }
}
