package OO.Inheritance.Challenge03.Test;

import OO.Inheritance.Challenge03.Direction;
import OO.Inheritance.Challenge03.Hero;
import OO.Inheritance.Challenge03.Monster;

public class Game {
    public static void main(String[] args) {
        Monster monster = new Monster();
        monster.x = 10;
        monster.y = 10;

        Hero hero = new Hero(10, 11);
//        hero.x = 10;
//        hero.y = 11;

        System.out.println("Monster have =>" + monster.life + " life");
        System.out.println("Monster have =>" + hero.life + " life");

        monster.attack(hero);
        hero.attack(monster);

        System.out.println("Monster have =>" + monster.life + " life");
        System.out.println("Monster have =>" + hero.life + " life");

        hero.y = 12;
        monster.attack(hero);
        hero.attack(monster);

        hero.walk(Direction.NORTH);
        hero.walk(Direction.NORTH);
        hero.walk(Direction.WEST);

        System.out.println("Monster have =>" + monster.life + " life");
        System.out.println("Monster have =>" + hero.life + " life");
    }
}
