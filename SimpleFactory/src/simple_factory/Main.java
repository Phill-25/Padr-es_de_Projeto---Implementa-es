package simple_factory;

public class Main {
	
	public Main() {
	
		Pizzaria cantinaDaPizza = new Pizzaria();
		
		System.out.println( cantinaDaPizza.fazPizza(null, null).toString() );
		
		
		
	}

}
