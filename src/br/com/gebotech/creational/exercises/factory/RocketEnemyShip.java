package br.com.gebotech.creational.exercises.factory;

public class RocketEnemyShip extends EnemyShip{

    public RocketEnemyShip(){
        setName("Rocket enemy ship");
        setDamage(10.0);
    }

    @Override
    public void test() {
        System.out.println("Inside test method for Rocket enemy ship");
    }
}
