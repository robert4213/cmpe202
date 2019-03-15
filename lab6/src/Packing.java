
import java.util.ArrayList;
import java.text.DecimalFormat;

public class Packing implements PrintStrategy, OrderNumObserver{
	private int num = 1;
	DecimalFormat toTheFormat = new DecimalFormat("0.00");

	public void print(ArrayList<Buger> b) {
		StringBuffer s = new StringBuffer();
		s.append("    Five Guys\n");
		s.append("Order Num:  "+Integer.toString(num)+"\n");
		
		for(Buger bb : b) {
			s.append("1 "+bb.getBugerName()+"\n");
			s.append(bb.print("Topping"));
			s.append(bb.print("onMeat"));
			s.append(bb.print("Meat"));
		}
		s.append("\n");
		System.out.print(s.toString());
	}
	
	public void updateNum(int num) {
		this.num = num;
	}
}
