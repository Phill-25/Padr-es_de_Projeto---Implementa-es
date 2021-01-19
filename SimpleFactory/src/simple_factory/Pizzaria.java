package simple_factory;

public class Pizzaria {
	protected Pizza novaPizza = null;
	public Pizza fazPizza(String sabor, String tamanho) {
		
		
		
		if(sabor.equals("Calabresa") && tamanho.equals("M") ) {
			
			novaPizza = new PizzaCalabresaM(); 
	
			
		}else {
			
			novaPizza = new Pizza();
		}
		
		return novaPizza;
		
	}
	
}
