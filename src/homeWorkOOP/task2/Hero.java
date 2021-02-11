package homeWorkOOP.task2;

public abstract class  Hero {

    private String name;
    private int damage;
    private int lifeHero;

    public Hero(String name, int damage, int lifeHero) {
        this.name = name;
        this.damage = damage;
        this.lifeHero = lifeHero;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }


    public abstract void attackEnemy(Enemy enemy);

}


