
public class GumballMachine
{

    private int num_gumballs;
    private int num_coin;
    private int req_coin;
    private boolean only_quarter;
    private boolean has_quarter;

    public GumballMachine( int size, int req_coin, boolean only_quarter )
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.only_quarter = only_quarter;
        this.req_coin = req_coin;
        this.has_quarter = false;
        this.num_coin = 0;
    }

    public void insertQuarter(int coin)
    {
        if (this.has_quarter == true)
        {
            System.out.println( "Already have enough coins!" ) ;
            return;
        }
        if (coin != 25 && this.only_quarter == true)
        {
            System.out.println( "Only quarter accepted!" ) ;
            return;
        }
        this.num_coin += coin;
        if ( this.num_coin >= this.req_coin )
            this.has_quarter = true ;
        else 
            this.has_quarter = false ;
    }
    
    public void turnCrank()
    {
        if ( this.has_quarter )
        {
            if ( this.num_gumballs > 0 )
            {
                this.num_gumballs-- ;
                this.has_quarter = false ;
                System.out.println( "Thanks for your quarter.  Gumball Ejected!" ) ;
            }
            else
            {
                System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
            }
        }
        else 
        {
            System.out.println( "Please insert a quarter" ) ;
        }        
    }
}
