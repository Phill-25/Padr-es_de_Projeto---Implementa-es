import java.util.ArrayList;

public class ObservadoConcreto implements Observable {

	private	ArrayList<Observer> assinantes = new ArrayList<>();
	private String name = "";
	private boolean setchange = false;
	private String estado ="";

	@Override
	public void inscrever(Observer o) {

		if(! assinantes.contains(o)) assinantes.add(o);

	}

	@Override
	public void remover(Observer o) {

		if( assinantes.contains(o)) assinantes.remove(o);

	}
	@Override
	public void setChange() {
		this.setchange = true;

	}

	@Override
	public void notificar() {


		if (setchange) {
			
			for (Observer ass : assinantes) {

				ass.atualiza(this);
			} 

			setchange = false;

		}

	}

	public void setEstado(String e) {
		this.estado = e;
		
		setChange();
		notificar();
	}

	public String getEstado() {
		return estado;
	}

	public ObservadoConcreto(String n) {
		this.name = n;
	}

	public String getName() {
		return name;
	}

}
