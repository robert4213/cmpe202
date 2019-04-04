/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardCVC implements IDisplayComponent, IKeyEventHandler
{

	private IKeyEventHandler nextHandler ;
	private IKeyEventHandler prevHandler ;
	private String cvc = "" ;

    public void setNext( IKeyEventHandler next) {
    	this.nextHandler = next ;
    }	

    public void setPrev( IKeyEventHandler prev) {
    	this.prevHandler = prev ;
    }	

	public String display() {
		if ( cvc.equals("") )
			return "[123]" + "  " ;
		else
			return "[" + cvc + "]" + "  " ;
	}	

	public void key(String ch) {
		if (cvc.length()<3) cvc += ch;
		else if (nextHandler != null)nextHandler.key(ch);
	}	

	public void addSubComponent( IDisplayComponent c ) {
		return ; // do nothing
	}
	
	public void delete() {
		if(!cvc.isEmpty()) cvc = cvc.substring(0,cvc.length()-1);
		else {
			if (prevHandler!= null) prevHandler.delete();
		}
	}

}