import machine.GumballMachine;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        GumballMachine gumballMachine = new GumballMachine(5);
        System.out.println(gumballMachine);

        for (int i = 0; i < 20; i++) {
            Thread.sleep(1000);
            gumballMachine.insertQuarter();
            gumballMachine.turnCrank();
            System.out.println(gumballMachine);
            if (gumballMachine.getCount() == 0) {
                gumballMachine.refill(5);
            }
        }
    }
}
