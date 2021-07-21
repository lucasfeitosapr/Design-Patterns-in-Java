package br.com.gebotech.creational.exercises.factory;

public class UFOEnemyShip extends EnemyShip {

    public UFOEnemyShip(){
        setName("UFO Enemy Ship");
        setDamage(15.0);
    }

    @Override
    public void test(){
        System.out.println("Inside test method for UFO Enemy Ship");
    }

}
