
public class BuildOrder {
	
	public static Component getOrder() {
		Composite order = new Composite("Order");
		
		CustomBurger customBurger = new CustomBurger("Build Your Own Burger");
		//Organic Bison for 1/2lb
		Burger b = new Burger("Burger Options");
		String[] bo = {"Organic Bison*","1/2lb.","On A Bun"};
		b.setOptions(bo);
		// 2 cheese
		Cheese c = new Cheese("Cheese Options");
		String[] co = {"Yellow American", "Spicy Jalapeno Jack"};
		c.setOptions(co);
		c.wrapDecorator(b);
		// 1 premium Cheese
		PremiumCheese pc = new PremiumCheese("Premium Cheese Options");
		String[] pco = {"Danish Blue Cheese"};
		pc.setOptions(pco);
		pc.wrapDecorator(c);
		// 2 sauce
		Sauce s = new Sauce("Sauce Options");
		String[] so = {"Mayonnaise", "Thai Peanut Sauce"};
		s.setOptions(so);
		s.wrapDecorator(pc);
		// Free Toppings
		Toppings t = new Toppings( "Toppings Options" ) ;
        String[] to = { "Dill Pickle Chips", "Black Olives", "Spicy Pickles"} ;
        t.setOptions( to ) ;
        t.wrapDecorator( s ) ;
        // 1 Premium Toppings
        Premium p = new Premium( "Premium Options" ) ;
        String[] po = { "Marinated Tomatoes" } ;
        p.setOptions( po ) ;
        p.wrapDecorator( t ) ;
        // 1 bun
        Bun bun = new Bun("Bun Options");
        String[] buno = {"Ciabatta(Vagan)"};
        bun.setOptions(buno);
        bun.wrapDecorator(p);
        // 1 Side
        Side si = new Side("Side Options");
        String[] sio = {"Shoestring Fries"};
        si.setOptions(sio);
        si.wrapDecorator(bun);
        
        // Setup Custom Burger Ingredients
        customBurger.setDecorator( si ) ;
        customBurger.addChild( b ) ;
        customBurger.addChild( c ) ;
        customBurger.addChild( pc ) ;
        customBurger.addChild( s ) ;
        customBurger.addChild( t ) ;
        customBurger.addChild( p ) ;
        customBurger.addChild( bun ) ;
        customBurger.addChild( si ) ;
        
        // Add Custom Burger to the ORder
        order.addChild( customBurger );
        
        CustomBurger customBurger2 = new CustomBurger("Build Your Own Burger");
		//Organic Bison for 1/2lb
		Burger b2 = new Burger("Burger Options");
		String[] bo2 = {"Hormone & Antibotic Free Beef*","1/3lb.","On A Bun"};
		b2.setOptions(bo2);
		// 2 cheese
		Cheese c2 = new Cheese("Cheese Options");
		String[] co2 = {"Smoked Gouda", "Greek Feta"};
		c2.setOptions(co2);
		c2.wrapDecorator(b2);
		// 1 premium Cheese
		PremiumCheese pc2 = new PremiumCheese("Premium Cheese Options");
		String[] pco2 = {"Fresh Mozzarella"};
		pc2.setOptions(pco2);
		pc2.wrapDecorator(c2);
		// 2 sauce
		Sauce s2 = new Sauce("Sauce Options");
		String[] so2 = {"Habanero Salsa"};
		s2.setOptions(so2);
		s2.wrapDecorator(pc2);
		// Free Toppings
		Toppings t2 = new Toppings( "Toppings Options" ) ;
        String[] to2 = { "Crushed Peanuts"} ;
        t2.setOptions( to2 ) ;
        t2.wrapDecorator( s2 ) ;
        // 1 Premium Toppings
        Premium p2 = new Premium( "Premium Options" ) ;
        String[] po2 = { "Sunny Side Up Egg", "Marinated Tomatoes" } ;
        p2.setOptions( po2 ) ;
        p2.wrapDecorator( t2 ) ;
        // 1 bun
        Bun bun2 = new Bun("Bun Options");
        String[] buno2 = {"Gluten-Free Bun"};
        bun2.setOptions(buno2);
        bun2.wrapDecorator(p2);
        // 1 Side
        Side si2 = new Side("Side Options");
        String[] sio2 = {"Shoestring Fries"};
        si2.setOptions(sio2);
        si2.wrapDecorator(bun2);
        
        // Setup Custom Burger Ingredients
        customBurger2.setDecorator( si2 ) ;
        customBurger2.addChild( b2 ) ;
        customBurger2.addChild( c2 ) ;
        customBurger2.addChild( pc2 ) ;
        customBurger2.addChild( s2 ) ;
        customBurger2.addChild( t2 ) ;
        customBurger2.addChild( p2 ) ;
        customBurger2.addChild( bun2 ) ;
        customBurger2.addChild( si2 ) ;
        
     // Add Custom Burger to the ORder
        order.addChild( customBurger2 );
        
		return order;
	}
}
