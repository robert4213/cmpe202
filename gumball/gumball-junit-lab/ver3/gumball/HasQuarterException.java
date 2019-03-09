package gumball;

public class HasQuarterException extends GumballException
{
    public HasQuarterException(){
        System.out.println("Already a quarter there!");
    }
    
    public String getMessage(){
        return "Already a quarter there!";
    }
}
