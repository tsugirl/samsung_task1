import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Game game1 = new Game();
        Unit unit1 = new Unit("V");
        Unit unit2 = new Unit("Z");

        /*System.out.println(unit1);
        System.out.println(unit2);

        unit1.attack(unit2);

        System.out.println(unit1);
        System.out.println(unit2);*/

        Game game2 = new Game();

        Wizard wizard1 = new Wizard("W1");
        Wizard wizard2 = new Wizard("W2");
        wizard1.attack(wizard2);

//        System.out.println(Game.countOfUnits); /*количество будет суммироваться со всех экземпляров Game*/
    }
}