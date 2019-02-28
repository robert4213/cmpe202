import java.util.LinkedList; 
import java.util.Scanner;

public class CustomerList {
	private LinkedList<Customer> list;

	Handler t2; 
	public CustomerList(Handler t2)
	{		
		this.t2 = t2;
	}
	
	public void add(Customer c)
	{
		list.add(c);
		System.out.format("Customer: %s. %nPhone number: %d.%n Number of people: %d.%n",
				c.returnName(),c.returnNum(),c.returnPhone());
		System.out.println("Din Tai Fung: You're in line! We'll text when you are near the top of list");
	}
	
	public void checkPosition() 
	{
		boolean flag = false;
		int i;
		for(i = 0; i<list.size(); i++)
		{
			flag = t2.findPosition(list.get(i));
			if(flag) break;
		}			
		sendMessage(i);		
	}
	
	public void sendMessage(int num) 
	{
		if(num>=list.size()) 
		{
			System.out.println("No position aviliable!");
			return;
		}
		System.out.format("Customer: %s. %nPhone number: %d.%n Number of people: %d.%n",
				list.get(num).returnName(),list.get(num).returnNum(),list.get(num).returnPhone());
		System.out.println("Din Tai Fung: You're  near the top of list. Please check in. "
				+ "Send 'Confirm' to confirm, or send 'Leave' to leave.");
		checkIn(num);
	}
	
	public void checkIn(int num)
	{
		System.out.println("Answer: ");
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		while(true) 
		{
			if(s.equalsIgnoreCase("Confirm"))
			{
				System.out.format("You table is %d.%n", t2.getPosition(list.get(num)));
				break;
			}
			else if(s.equalsIgnoreCase("Leave"))
			{
				System.out.println("Thanks for coming!");
				break;
			}
			else
			{
				System.out.println("Please send 'Confirm' or 'Leave'.");
			}
		}				
		list.remove(num);
		scan.close();		
	}
}








