


public class BugerTopping implements BugerComponent{
	protected String type;
		
	public void add(BugerComponent b) {
	}

	public void remove(BugerComponent b) {	
	}

	public String print(String type) {
		StringBuffer s = new StringBuffer();
		if(this.type.equalsIgnoreCase(type)) {
			switch(this.type) {
				case("Topping"): s.append(getClass().getName().toUpperCase());break;
				case("onMeat"): s.append("->|"+getClass().getName().toUpperCase());break;
				case("Meat"):s.append("{{{{"+getClass().getName().toUpperCase()+"}}}}");break;
			}
			s.append("\n");
		}
		return s.toString();
	}
	
}
