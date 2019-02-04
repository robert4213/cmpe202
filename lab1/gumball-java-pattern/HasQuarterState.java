

import java.util.Random;

public class HasQuarterState implements State {
    GumballMachine gumballMachine;
 
    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
  
    public void insertQuarter() {
        if(gumballMachine.getReqCoin() <= gumballMachine.getNumCoin()){            
            System.out.println("You can't insert another quarter");
        }
        else{
            gumballMachine.addNumCoin(25);
            System.out.println("You inserted a quarter");
        }
    }
 
    public void ejectQuarter() {
        System.out.println("Coins returned");
        gumballMachine.zeroNumCoin();
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }
    
    public void insertNickel(){
        if(gumballMachine.getReqCoin() <= gumballMachine.getNumCoin()){            
            System.out.println("You can't insert another nickel");
        }
        else{
            gumballMachine.addNumCoin(5);
            System.out.println("You inserted a nickel");
        }
    }
    
    public void ejectNickel(){
        System.out.println("Coins returned");
        gumballMachine.zeroNumCoin();
        gumballMachine.setState(gumballMachine.getNoQuarterState());        
    }
    
    public void insertDime(){
        if(gumballMachine.getReqCoin() <= gumballMachine.getNumCoin()){            
            System.out.println("You can't insert another dime");
        }
        else{
            gumballMachine.addNumCoin(10);
            System.out.println("You inserted a dime");
        }
    }
    
    public void ejectDime(){
        System.out.println("Coins returned");
        gumballMachine.zeroNumCoin();
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }
    
    
    public void turnCrank() {
        if(gumballMachine.getReqCoin() <= gumballMachine.getNumCoin()){
            System.out.println("You turned...");
            gumballMachine.zeroNumCoin();
            gumballMachine.setState(gumballMachine.getSoldState());
        }
        else{
            System.out.println("You havn't inserted enough coins!");
        }
    }

    public void dispense() {
        System.out.println("No gumball dispensed");
    }
 
    public String toString() {
        if(gumballMachine.getReqCoin() <= gumballMachine.getNumCoin()){
            return "waiting for turn of crank";
        }
        else{            
            return "waiting for coin";
        }
    }
}
