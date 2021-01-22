package strategy;

public class EstrategiaPromocional implements EstrategiaDePontuacao {

	public int calcularPontuacao(int distanciaDeVoo) {
		return distanciaDeVoo/10;
	}

}
