
import java.util.ArrayList;
import java.text.DecimalFormat;

public class Recipt implements PrintStrategy, OrderNumObserver{
	private int num = 1;
	private double sum = 0;
	DecimalFormat toTheFormat = new DecimalFormat("0.00");

	public void print(ArrayList<Buger> b) {
		StringBuffer s = new StringBuffer();
		s.append("    Five Guys\n");
		s.append("Order Num:  "+Integer.toString(num)+"\n");
		
		for(Buger bb : b) {
			s.append("1 "+bb.getBugerName());
			s.append(" "+toTheFormat.format(bb.getPrice())+"\n");
			s.append(bb.print("Meat"));
			s.append(bb.print("Topping"));
			s.append(bb.print("onMeat"));
			sum += bb.getPrice();
		}
		s.append("\n");
		s.append("Sub.Total:       $"+toTheFormat.format(sum)+"\n");
		s.append("Tax:             $"+toTheFormat.format(sum*0.09)+"\n");
		s.append("Total:           $"+toTheFormat.format(sum*1.09)+"\n");
		System.out.print(s.toString());
	}
	
	public void updateNum(int num) {
		this.num = num;
		sum = 0;
	}
}
