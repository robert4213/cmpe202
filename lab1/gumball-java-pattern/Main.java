

public class Main {

    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(3, 25 ,true);

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);
        
        GumballMachine gumballMachine1 = new GumballMachine(1, 50 ,true);

        System.out.println(gumballMachine1);
        
        gumballMachine1.insertDime();
        gumballMachine1.insertQuarter();
        gumballMachine1.turnCrank();

        System.out.println(gumballMachine1);

        gumballMachine1.insertQuarter();
        gumballMachine1.turnCrank();
        
        System.out.println(gumballMachine1);
        
        gumballMachine1.insertQuarter();
        gumballMachine1.turnCrank();

        System.out.println(gumballMachine1);
        
        GumballMachine gumballMachine2 = new GumballMachine(1, 50 ,false);

        System.out.println(gumballMachine2);
        
        gumballMachine2.insertNickel();
        gumballMachine2.insertNickel();
        gumballMachine2.insertDime();
        gumballMachine2.insertDime();
        gumballMachine2.insertDime();
        gumballMachine2.insertDime();
        gumballMachine2.insertDime();
        gumballMachine2.turnCrank();
        
        System.out.println(gumballMachine2);
    }
}
