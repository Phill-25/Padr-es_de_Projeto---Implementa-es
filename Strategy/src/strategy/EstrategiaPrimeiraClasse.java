package strategy;

public class EstrategiaPrimeiraClasse implements EstrategiaDePontuacao {

	public int calcularPontuacao(int distanciaDeVoo) {
		return distanciaDeVoo/2;
	}

}
