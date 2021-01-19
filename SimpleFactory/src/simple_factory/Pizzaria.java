package simple_factory;

public class Pizzaria {
		
	public Pizza fazPizza(String sabor, String tamanho) {
		
		Pizza novaPizza = null;
		
		if(sabor.equals("Calabresa") && tamanho.equals("M") ) {
			
			novaPizza = new PizzaCalabresaM(); 
	
			
		}else {
			
			novaPizza = new Pizza();
		}
		
		return novaPizza;
		
	}
	
}
