package testeObserver;

public class main {

	public static void main(String[] args) {
		
		ObservadoConcreto observado1 = new ObservadoConcreto("Observado 1");
		
		ObservadoConcreto observado2 = new ObservadoConcreto("Observado 2");
		
		ObservadorConcreto o1 = new ObservadorConcreto(observado1);
		ObservadorConcreto o2 = new ObservadorConcreto(observado2);
		ObservadorConcreto o3 = new ObservadorConcreto(observado1);


		
		
		observado1.setEstado("0056");
		
		observado2.setEstado("999");
		
		
	}

}
