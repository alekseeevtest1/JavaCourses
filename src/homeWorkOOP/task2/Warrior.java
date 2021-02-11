package homeWorkOOP.task2;

public class Warrior extends Hero{

    public Warrior(String name, int damage) {
        super(name, damage, 0);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(" Ударил мечом " + getName() + " и " + " попал в врага " + enemy.getNameEnemy());
        System.out.println(" Нанес урон " + getDamage() + " и " + "оставил здоровья в количестве " + enemy.takeDamage(getDamage()));
    }
}
