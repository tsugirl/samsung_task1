public class Wizard extends Unit {

    protected int mana = 100;

    public Wizard(String name) {
        super(name);

        power = 25; /*переопределение желательно делать в конструкторе*/
        health = 80;
    }

    @Override
    public void attack(Unit unit) { /*можно просто начать писать attack чтобы появился этот код, в этих стрчоках мы переобпределяем атаку для мага*/
        if (mana >= 10) {
            super.attack(unit);
            mana -= 10;
        }
    }

    @Override
    public String toString() {
        return "Wizard{" +
                "mana=" + mana +
                ", name='" + name + '\'' +
                ", health=" + health +
                ", defence=" + defence +
                ", power=" + power +
                ", criticalChance=" + criticalChance +
                ", parryChance=" + parryChance +
                '}';
    }

    public void print(){
        System.out.println(this);
    }
    public void print(String str){
        System.out.println(str + " " + this); /*то, какой метод будет выведен, будет зависить от подаваемого значения в параметрах или от типа передаваемых параметров*/
    }
}
