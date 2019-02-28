import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		int[] num2 = {21, 22, 23, 24, 25, 26, 27, 28, 29};
		int[] num4 = {41,42,43,44,45};
		int[] num8 = {81,82};
		Handler t2 = new Table2(num2);
		Handler t4 = new Table2(num4);
		Handler t8 = new Table2(num8);
		CustomerList cl = new CustomerList(t2);
		t2.setSuccessor(t4);
		t4.setSuccessor(t8);
		Scanner scan = new Scanner(System.in);
		while(true)
		{
			System.out.format("Your command: %n 1.add costumer.%n"
				+ "2. get table.%n3. check table%n4.add table.%n5. exit.%n your choice: ");
			int ch = scan.nextInt();
			switch(ch)
			{
			case 1: Customer cin = new 
			}

		}
		scan.close();
	}
	
	public void addCustomer()
	{
		Scanner scan = new Scanner(System.in);
		System.out.
	}
}
