import java.util.ArrayList;

/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardExp implements IDisplayComponent, IKeyEventHandler
{

	private IKeyEventHandler nextHandler ;
	private IKeyEventHandler prevHandler ;
	private ArrayList<IStrEventHandler> components = new ArrayList<IStrEventHandler>() ;
	private IStrEventHandler head;
	private IStrEventHandler tail;
	
	public CreditCardExp() {
		for (int i = 0 ; i < 2; i++) {
			IStrEventHandler s = new subString(2,"/");
			if(!components.isEmpty()) {
				components.get(components.size()-1).setNext(s);
				s.setPrev(components.get(components.size()-1));
			}
			components.add(s);	
			tail = s;
		}		
		head = components.get(0);
	}

    public void setNext( IKeyEventHandler next) {
    	this.nextHandler = next ;
    }	
    
    public void setPrev( IKeyEventHandler prev) {
    	this.prevHandler = prev ;
    }	

	public String display() {
		if ( head.display().equals("") )
			return "[MM/YY]" + "  " ;
		else
			return "[" + head.display() + "]" + "  " ;
	}	

	public void key(String ch) {
		if ( nextHandler != null && !head.key(ch))
			nextHandler.key(ch) ;
	}	

	public void delete() {
		if(!head.display().equals("")) tail.delete();
		else {
			if(prevHandler!= null) prevHandler.delete();
		}
	}

	public void addSubComponent(IDisplayComponent c) {
		// TODO Auto-generated method stub
		
	}
}