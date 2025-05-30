import containers.*;
import transport.Ship;
import exceptions.OverfillException;

public class Main {
    public static void main(String[] args) {
        try {
            Ship ship = new Ship("Evergreen", 20, 100, 50000);

            LiquidContainer milk = new LiquidContainer(false, 240, 250, 2000, 10000);
            milk.load(9000);
            ship.loadContainer(milk);

            GasContainer helium = new GasContainer(5, 200, 250, 1000, 8000);
            helium.load(6000);
            ship.loadContainer(helium);

            RefrigeratedContainer banana = new RefrigeratedContainer("banana", 5, 5, 200, 250, 1000, 7000);
            banana.load(5000);
            ship.loadContainer(banana);

            ship.printInfo();

        } catch (Exception e) {
            System.out.println("Błąd: " + e.getMessage());
        }
    }
}