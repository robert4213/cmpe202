

public class GumballMachine {
 
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
 
    State state = soldOutState;
    int count = 0;
    int req_coin;
    int num_coin=0;
    boolean only_quarter;
 
    public GumballMachine(int numberGumballs , int req_coin , boolean only_quarter ) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);

        this.count = numberGumballs;
        this.req_coin = req_coin;
        this.only_quarter = only_quarter;
        if (this.count > 0) {
            state = noQuarterState;
        } 
    }
 
    public void insertQuarter() {
        state.insertQuarter();
    }
 
    public void ejectQuarter() {
        state.ejectQuarter();
    }
    
    public void insertNickel(){
        if (only_quarter!= true) state.insertNickel();    
        else System.out.println("Only quarters are allowed!");
    }
    
    public void ejectNickel(){
        if (only_quarter!= true) state.ejectNickel();
        else System.out.println("Only quarters are allowed!");
    }
    
    public void insertDime(){
        if (only_quarter!= true) state.insertDime();
        else System.out.println("Only quarters are allowed!");
    }
    
    public void ejectDime(){
        if (only_quarter!= true) state.ejectDime();
        else System.out.println("Only quarters are allowed!");
    }
    
    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    void setState(State state) {
        this.state = state;
    }
 
    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0) {
            count = count - 1;
        }
    }
 
    int getCount() {
        return count;
    }
 
    void refill(int count) {
        this.count = count;
        state = noQuarterState;
    }

    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }
    
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004");
        result.append("\nInventory: " + count + " gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\n");
        result.append("Machine is " + state + "\n");
        return result.toString();
    }
    
    public int getReqCoin() {
        return req_coin;
    }
    
    public int getNumCoin() {
        return num_coin;
    }
    
    public void addNumCoin(int coin){
        this.num_coin += coin;
    }
    
    public void zeroNumCoin(){
        this.num_coin = 0;
    }
}
