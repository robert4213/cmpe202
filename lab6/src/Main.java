
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	static ArrayList<Buger> bugerOrder = new ArrayList<Buger>();
	static ArrayList<OrderNumObserver> ob = new ArrayList<OrderNumObserver>();
	static Scanner sc = new Scanner(System.in);
	static Recipt re = new Recipt();
	static Packing pk = new Packing();
	static PrintStrategy pt = re;
	static int num = 1;
	public static void main(String[] args) {
		ob.add(re);
		ob.add(pk);
		while(true) {
			while(chooseBuger());
			while(addTopping());
			while(ordering());
		}
	}
	public static boolean chooseBuger() {
		System.out.print("Choose your buger\n1.Hambuger 2.Bacon Buger\n");
		String ln = sc.next();
		switch(ln) {
		case "1": bugerOrder.add(new Hamburger()); return false;
		case "2": bugerOrder.add(new BaconBurger());return false;
		default: System.out.println("Wrong Input");return true;
		}
	}	
	
	public static boolean addTopping() {
		System.out.println("Choose your toppings:");
		System.out.println("1.MAYO 2.LETTUCE 3.PICKLES 4.TOMATOES 5.GRILLED ONIONS");
		System.out.println(" 6.GRILLED MUSHROOMS 7. KETCHUP 8.MUSTARD");
		System.out.println("9.RELISH 10.ONIONS 11.JALAPENO PEPPERS 12.GREEN PEPPER");
		System.out.println("13.STEAK SAUCE 14.BBQ SAUCE 15.HOT SAUCE");
		String ln = sc.next();
		switch(ln) {
		case "1": bugerOrder.get(bugerOrder.size()-1).add(new Mayo());break;
		case "2": bugerOrder.get(bugerOrder.size()-1).add(new Lettuce());break;
		case "3": bugerOrder.get(bugerOrder.size()-1).add(new Pickles());break;
		case "4": bugerOrder.get(bugerOrder.size()-1).add(new Tomatoes());break;
		case "5": bugerOrder.get(bugerOrder.size()-1).add(new GrilledOnions());break;
		case "6": bugerOrder.get(bugerOrder.size()-1).add(new GrilledMushrooms());break;
		case "7": bugerOrder.get(bugerOrder.size()-1).add(new Ketchup());break;
		case "8": bugerOrder.get(bugerOrder.size()-1).add(new Mustard());break;
		case "9": bugerOrder.get(bugerOrder.size()-1).add(new Relish());break;
		case "10": bugerOrder.get(bugerOrder.size()-1).add(new Onions());break;
		case "11": bugerOrder.get(bugerOrder.size()-1).add(new JalapenoPeppers());break;
		case "12": bugerOrder.get(bugerOrder.size()-1).add(new GreenPeppers());break;
		case "13": bugerOrder.get(bugerOrder.size()-1).add(new SteakSauce());break;
		case "14": bugerOrder.get(bugerOrder.size()-1).add(new BBQSauce());break;
		case "15": bugerOrder.get(bugerOrder.size()-1).add(new HotSauce());break;
		default: System.out.println("Wrong Input");
		}
		while(true) {
			System.out.println("Do you want to continue(Y/N):");
			ln = sc.next();
			if(ln.equalsIgnoreCase("y")) return true;
			else if (ln.equalsIgnoreCase("n")) return false;
		}
	}
	
	public static void changeStrategy() {
		if(pt.getClass().getName().equals("Recipt")) pt = pk;
		else pt = re;
	}
	
	public static void print() {
		pt.print(bugerOrder);
	}
	
	public static void cleanUp() {
		bugerOrder.clear();
		num++;
		for(OrderNumObserver i: ob) i.updateNum(num);
	}
	
	public static boolean ordering() {
		System.out.println("1.Print Order 2.Change Stragety 3.New Burger 4.Finish");
		String ln = sc.next();
		switch(ln) {
		case "1": print();break;
		case "2": changeStrategy();break;
		case "3": return false;
		case "4": cleanUp();return false;
		default: System.out.println("Wrong Input");
		}
		return true;
	}
}
