package model;

public class Zombie extends Enemy {//subclass enemy
    public void walk(){
        System.out.println("Zombie Jalan!!!");

    }
    @Override
    public void serang(){
        System.out.println("Zombie Serang!!!");
    }
}
