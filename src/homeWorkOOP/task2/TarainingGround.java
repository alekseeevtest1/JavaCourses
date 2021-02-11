package homeWorkOOP.task2;

public class TarainingGround {
    public static void main(String[] args) {

        Hero warrior1 = new Warrior("warrior1", 54);


        Hero mage1 = new Mage("mage1", 43);


        Hero archer1 = new Archer("archer1", 21, 134);


        Enemy enemy1 = new Enemy("Зомби", 124, 13);

        while (enemy1.isAlive()){
            attackEnemy(enemy1, warrior1, archer1, mage1);
        }

        System.out.println();

        System.out.println(enemy1.isAlive());
    }

    public static void attackEnemy(Enemy enemy,Hero... heroes){
        for (Hero hero: heroes){
            hero.attackEnemy(enemy);
        }
    }
}
