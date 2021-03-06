public class Main {

	public static void main(String[] args) {
		
		ObservadoConcreto precoDieselRefinaria = new ObservadoConcreto("Diesel");
		
		ObservadoConcreto precoGNVRefinaria = new ObservadoConcreto("GNV");

		ObservadoConcreto precoGasolinaRefinaria = new ObservadoConcreto("Gasolina");


		
		ObservadorConcreto posto1 = new ObservadorConcreto(precoDieselRefinaria);
		precoGNVRefinaria.inscrever(posto1);
		precoGasolinaRefinaria.inscrever(posto1);

		ObservadorConcreto posto2 = new ObservadorConcreto(precoDieselRefinaria);
		precoGNVRefinaria.inscrever(posto2);
		precoGasolinaRefinaria.inscrever(posto2);
	
		
		precoDieselRefinaria.setEstado("R$ 2,50");
		
		precoGNVRefinaria.setEstado("R$ 1,65");

		precoGasolinaRefinaria.setEstado("R$ 3,43");
		
		
	}

}
