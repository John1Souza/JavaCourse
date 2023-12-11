package OO.Inheritance;

public class Game {
    public static void main(String[] args) {
        Monster monster = new Monster();
        monster.x = 10;
        monster.y = 10;

        Hero hero = new Hero();
        hero.x = 10;
        hero.y = 11;

        System.out.println("Monster have =>" + monster.life + " life");
        System.out.println("Monster have =>" + hero.life + " life");

        monster.attack(hero);
        hero.attack(monster);

        System.out.println("Monster have =>" + monster.life + " life");
        System.out.println("Monster have =>" + hero.life + " life");

        hero.y = 12;
        monster.attack(hero);
        hero.attack(monster);

        System.out.println("Monster have =>" + monster.life + " life");
        System.out.println("Monster have =>" + hero.life + " life");
    }
}
