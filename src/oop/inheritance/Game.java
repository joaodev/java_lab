package oop.inheritance;

public class Game {

    public static void main(String[] args) {

        Monster monster = new Monster();
        monster.x = 10;
        monster.y = 10;

        Hero hero = new Hero(10, 11);

        System.out.println("Monster life: " + monster.life);
        System.out.println("Hero life " + hero.life);

        monster.attack(hero);
        hero.attack(monster);

        System.out.println("Monster life: " + monster.life);
        System.out.println("Hero life " + hero.life);
    }
}
