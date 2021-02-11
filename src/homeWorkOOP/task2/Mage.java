package homeWorkOOP.task2;

public class Mage extends Hero{

    public Mage(String name, int damage) {
        super(name, damage, 0);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(" Накастовал заклинание " + getName() + " и " + " попал в врага " + enemy.getNameEnemy());
        System.out.println(" Нанес урон " + enemy.getNameEnemy() + " и " + " в количестве " + enemy.getNameEnemy());
    }
}
