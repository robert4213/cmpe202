import java.text.DecimalFormat;


public abstract class LeafDecorator  implements Component, PriceDecorator
{  
   PriceDecorator wrapped ;
   private String description ;
   protected Double price ;
   
   public LeafDecorator( String d ) {
       this.wrapped = null ;
       description = d ;
       price = 0.0 ;
    }

   public void wrapDecorator( PriceDecorator w ) 
   {
       this.wrapped = w ;
   }
    
   public Double getPrice() {
        if (wrapped == null )
        {
            return price ;
        }
        else 
        {
            return price + wrapped.getPrice() ;
        }
    }

    abstract public void setOptions( String[] options ) ; 
    abstract public String getDescription() ;
        
    public void printDescription() {
        System.out.println(getDescription() ) ;
    }
    
    public void addChild(Component c) {
	    // no implementation
	}

	public void removeChild(Component c) {
        // no implementation
	}

	public Component getChild(int i) {
        // no implementation
        return null ;
	}
    
}
