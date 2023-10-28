public class Unit {
    protected String name;

    public Unit(String name) {
        Game.countOfUnits++;
        this.name = name;
    }

    protected int health = 100;
    protected int defence = 100;
    protected int power = 10;

    protected float criticalChance = 0.1f;
    protected float parryChance = 0.1f;
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) { /*для автоматического создания геттеров и сеттеров сочетание клавиш алт+инсерт*/
        this.health = health;
    }

    public int getDefence() {
        return defence;
    }

    public int getPower() {
        return power;
    }

    public float getCriticalChance() {
        return criticalChance;
    }

    public float getParryChance() {
        return parryChance;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setCriticalChance(float criticalChance) {
        this.criticalChance = criticalChance;
    }

    public void setParryChance(float parryChance) {
        this.parryChance = parryChance;
    }

    public void attack(Unit unit){
        unit.getDamage(power);
    }

    public void getDamage (int damage){
        this.health -= damage;
    }

    @Override
    public String toString() {
        return "Unit{" +
                "health=" + health +
                ", defence=" + defence +
                ", power=" + power +
                ", criticalChance=" + criticalChance +
                ", parryChance=" + parryChance +
                '}';
    }
}
