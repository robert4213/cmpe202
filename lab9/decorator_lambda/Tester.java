package decorator_lambda;

public class Tester {
	

    public static void runTest()
    {
    	Component obj = () -> "Hellow World";
    	Component decoractorA = ()->  "<em>"+obj.operation()+"</em>";
    	Component decoractorB = ()->  "<h1>"+decoractorA.operation()+"</h1>";
        System.out.println( decoractorB.operation() );
        
    }

  public static void main( String [] args )
    {
        Tester t = new Tester() ;
        t.runTest() ;
    }    
    
}
