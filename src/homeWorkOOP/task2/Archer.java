package homeWorkOOP.task2;

public class Archer extends Hero {

    public Archer(String name, int damage, int lifeHero) {
        super(name,damage, lifeHero );
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Выстрел из лука " + getName() + " и " + " попал в " +enemy.getNameEnemy());
        System.out.println(" Нанес урон " + getDamage() + " и " + "оставил здоровья в количестве " + enemy.takeDamage(getDamage()));
    }
}
