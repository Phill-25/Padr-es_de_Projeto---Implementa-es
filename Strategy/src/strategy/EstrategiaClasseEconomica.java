package strategy;

public class EstrategiaClasseEconomica implements EstrategiaDePontuacao {

	public int calcularPontuacao(int distanciaDeVoo) {
		return distanciaDeVoo/4;
	}

}
