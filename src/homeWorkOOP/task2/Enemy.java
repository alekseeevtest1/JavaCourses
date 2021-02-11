package homeWorkOOP.task2;

public class Enemy implements Mortal {
    private String nameEnemy;

    private int health;

    private int damageEnemy;

    public Enemy(String nameEnemy, int health, int damageEnemy) {
        this.nameEnemy = nameEnemy;
        this.health = health;
        this.damageEnemy = damageEnemy;
    }

    public String getNameEnemy() {
        return nameEnemy;
    }

    public void setNameEnemy(String nameEnemy) {
        this.nameEnemy = nameEnemy;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int takeDamage(int damage){
        if (isAlive() && health <= damage){
            health = 0;
            System.out.println(getNameEnemy() + " погиб");

        }
        this.health -= Math.min(health, damage);
        return health;
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }
}
