

public class Main {

    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5,25,false);

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter( 25 );
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);
        
        GumballMachine gumballMachine1 = new GumballMachine(5,50,true);
        
        gumballMachine1.insertQuarter( 25 );
        gumballMachine1.insertQuarter( 10 );
        gumballMachine1.turnCrank();
        gumballMachine1.insertQuarter( 25 );
        gumballMachine1.turnCrank();
        System.out.println(gumballMachine1);
        
        GumballMachine gumballMachine2 = new GumballMachine(5,50,false);
        
        gumballMachine2.insertQuarter( 10 );
        gumballMachine2.insertQuarter( 10 );
        gumballMachine2.insertQuarter( 10 );
        gumballMachine2.turnCrank();
        gumballMachine2.insertQuarter( 25 );
        gumballMachine2.turnCrank();
        System.out.println(gumballMachine2);
    }
}
