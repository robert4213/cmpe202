
public interface IStrEventHandler {
    boolean key(String ch) ; 				// send key entry events to screen 
    void setNext( IStrEventHandler next) ;		// set next handler in event chain
    void setPrev( IStrEventHandler prev) ;
    String display();
    void delete();
}
