package br.com.gebotech.creational.exercises.factory;

public abstract class EnemyShip {

    private static String name;
    private static Double amtDamage;

    public void followHeroShip(){
        System.out.println(getName() + " is following the hero");
    }

    public void displayEnemyShip(){
        System.out.println(getName() + " is on the screen");
    }

    public void enemyShipShoots(){
        System.out.println(getName() + " attacks and does " + getDamage());
    }

    public String getName(){
        return name;
    }

    public void setName(String newName){
        name = newName;
    }

    public void setDamage(Double damage){
        amtDamage = damage;
    }

    public Double getDamage() {
        return amtDamage;
    }

    public abstract void test();
}
