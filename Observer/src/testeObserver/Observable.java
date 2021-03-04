package testeObserver;

public interface Observable {
	
	
	public void inscrever(Observer o);
	
	public void remover(Observer o);
	
	public void setChange();
	
	public void notificar();

}
