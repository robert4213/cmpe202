
import java.util.ArrayList;

public abstract class Buger implements BugerComponent{
	ArrayList<BugerComponent> component = new ArrayList<BugerComponent>();
	protected double price;
	@Override
	public void add(BugerComponent b) {
		component.add(b);
	}

	@Override
	public void remove(BugerComponent b) {
		component.remove(b);
	}

	@Override
	public String print(String type) {
		StringBuffer s = new StringBuffer();
		for(BugerComponent b : component) {
			s.append(b.print(type));
		}
		return s.toString();
	}
	
	public String getBugerName() {
		return getClass().getName();
	}

	public Double getPrice() {
		return price;
	}
}
