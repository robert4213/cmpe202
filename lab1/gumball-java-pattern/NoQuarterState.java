

public class NoQuarterState implements State {
    GumballMachine gumballMachine;
 
    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        gumballMachine.addNumCoin(25);
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }
 
    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }
 
    public void insertNickel(){
        System.out.println("You inserted a nickel");
        gumballMachine.addNumCoin(5);
        gumballMachine.setState(gumballMachine.getHasQuarterState());        
    }
    
    public void ejectNickel(){
        System.out.println("You haven't inserted a nickel");
    }
    
    public void insertDime(){
        System.out.println("You inserted a dime");
        gumballMachine.addNumCoin(10);
        gumballMachine.setState(gumballMachine.getHasQuarterState());   
    }
    
    public void ejectDime(){
        System.out.println("You haven't inserted a dime");
    }
    
    public void turnCrank() {
        System.out.println("You turned, but there's no coin");
     }
 
    public void dispense() {
        System.out.println("You need to pay first");
    } 
 
    public String toString() {
        return "waiting for coin";
    }
}
