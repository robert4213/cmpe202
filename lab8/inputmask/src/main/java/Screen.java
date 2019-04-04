/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

import java.util.* ;

public class Screen implements IScreen, IDisplayComponent
{
	private ArrayList<IDisplayComponent> components = new ArrayList<IDisplayComponent>() ;
    private IKeyEventHandler chain ;
    private IKeyEventHandler tail ;

    public Screen()
    {
        // no constructor elements
    }

    public void key(String ch) {
        chain.key(ch) ;
    }
    
    public void addSubComponent( IDisplayComponent c )
    {     
    	components.add( c ) ;
    	tail = (IKeyEventHandler) c ;
        if (components.size() == 1 )
        {
            chain = (IKeyEventHandler) c ;            
        }
        else
        {       	
            IKeyEventHandler prev = (IKeyEventHandler) components.get(components.size()-2) ;
            prev.setNext(tail) ;
            tail.setPrev(prev);
        }
    }
    
    public String display() { 
        String value = "" ;
        for (IDisplayComponent c : components )
        {
            value = value + c.display() ;
        }
        return value ; 
    }

    public String name() {
        return (this.getClass().getName()) ; 
    }

    public void delete() {
    	tail.delete();
    }
}
