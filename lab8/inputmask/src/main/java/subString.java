

public class subString implements IStrEventHandler{
	private IStrEventHandler nextHandler ;
	private IStrEventHandler prevHandler ;
	private String str = "" ;
	private String sep = "";
	private int len = 0;
	
	public subString(int num, String sep) {
		len = num;
		this.sep = sep;
	}
	
	@Override
	public boolean key(String ch) {
		if(str.length() < len) {
			str += ch;
			return true;
		}
		else if(nextHandler != null) return nextHandler.key(ch);
		else return false;
	}
	@Override
	public void setNext(IStrEventHandler next) {
		nextHandler = next;
		
	}
	@Override
	public void setPrev(IStrEventHandler prev) {
		prevHandler = prev;
	}
	@Override
	public void delete() {
		if(str.isEmpty()) prevHandler.delete();
		else str = str.substring( 0,str.length()-1 );
		
	}

	@Override
	public String display() {
		if(nextHandler != null && str.length() >= len) {
			return str+sep+nextHandler.display();
		}
		else return str;
	}

}
