package testeObserver;

public class main {

	public static void main(String[] args) {
		
		ObservadoConcreto refinaria1 = new ObservadoConcreto("Petroleo");
		
		ObservadoConcreto refinaria2 = new ObservadoConcreto("GNV");
		
		ObservadorConcreto posto1 = new ObservadorConcreto(refinaria1);
		ObservadorConcreto posto2 = new ObservadorConcreto(refinaria2);
		ObservadorConcreto posto3 = new ObservadorConcreto(refinaria1);
		ObservadorConcreto posto4 = new ObservadorConcreto(refinaria2);

		
		refinaria1.setEstado("R$ 2,50");
		
		refinaria2.setEstado("R$ 1,65");
		
		
	}

}
