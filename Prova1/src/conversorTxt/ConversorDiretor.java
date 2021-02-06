package conversorTxt;

public class ConversorDiretor {
	
	ConversorTXT conversor;
	
	public ConversorDiretor(ConversorTXT conversor) {
		this.conversor = conversor;
	}
	
	public void converteArquivo() {
		this.conversor.converte("C:\\Users\\Philipe\\Desktop\\TESTE.txt","C:\\Users\\Philipe\\Desktop\\saida.txt");
	}

}
