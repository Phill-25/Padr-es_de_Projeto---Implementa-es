package conversorTxt;

public class ConversorDirector {
	
	ConversorTXT conversor;
	
	public ConversorDirector(ConversorTXT conversor) {
		this.conversor = conversor;
	}
	
	public void converteArquivo() {
		this.conversor.converte("C:\\Users\\Philipe\\Desktop\\TESTE.txt","C:\\Users\\Philipe\\Desktop\\saida.txt");
	}

}
