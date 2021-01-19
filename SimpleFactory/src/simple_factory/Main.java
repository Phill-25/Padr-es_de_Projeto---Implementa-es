package simple_factory;

public class Main {
	
	public static void main(String[] args) {
		
		Pizzaria cantinaDaPizza = new Pizzaria();
		
		System.out.println( cantinaDaPizza.fazPizza("Calabresa", "M").sabor );
		
	}

}
