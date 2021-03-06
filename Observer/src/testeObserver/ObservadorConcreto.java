package testeObserver;


public class ObservadorConcreto implements Observer {


	private String preco

	@Override
	public void atualiza(ObservadoConcreto o) {
				
		System.out.println(o.getName()+": Novo estado identificado =  "+o.getEstado());
	}
	
	public ObservadorConcreto(Observable o ) {
		o.inscrever(this);
	}

}
