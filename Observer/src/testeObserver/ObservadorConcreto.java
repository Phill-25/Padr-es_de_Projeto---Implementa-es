package testeObserver;


public class ObservadorConcreto implements Observer {

	@Override
	public void atualiza(ObservadoConcreto o) {
				
		System.out.println("Novo estado identificado =  "+o.getEstado());
	}
	
	public ObservadorConcreto(Observable o ) {
		o.inscrever(this);
	}

}
