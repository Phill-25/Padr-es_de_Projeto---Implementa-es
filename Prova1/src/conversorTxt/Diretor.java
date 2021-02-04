package conversorTxt;

public class Diretor {

	public static void main(String[] args) {
		ConversorTXT conversor;
		
		conversor = new ConversorOCT();
		//Altere os caminhos e os contrutores
		conversor.converte("C:\\Users\\Philipe\\Desktop\\TESTE.txt","C:\\Users\\Philipe\\Desktop\\saida.txt");
	}

}
