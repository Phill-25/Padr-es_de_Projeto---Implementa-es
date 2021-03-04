package testeObserver;

public class main {

	public static void main(String[] args) {
		
		ObservadoConcreto insumo1 = new ObservadoConcreto("Observado 1");
		
		ObservadoConcreto produto4 = new ObservadoConcreto("Observado 2");
		
		ObservadorConcreto gerente1 = new ObservadorConcreto(insumo1);
		ObservadorConcreto gerente2 = new ObservadorConcreto(produto4);
		ObservadorConcreto gerente3 = new ObservadorConcreto(insumo1);


		
		insumo1.setEstado("insuficiente");
		
		produto4.setEstado("estoque cheio");
		
		
	}

}
