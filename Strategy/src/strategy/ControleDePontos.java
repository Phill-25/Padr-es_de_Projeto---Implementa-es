package strategy;

import java.util.ArrayList;

public class ControleDePontos {
	
	public int calcularPontuacao(Passageiro passageiro) {
		int totalDePontos = 0;
		
		ArrayList<Voo> voosPendentes = passageiro.getVoosComPontuacaoPendente();
		
		for (Voo voo : voosPendentes) {
			Bilhete bilhete = passageiro.getBilhete(voo.getNumero());
			EstrategiaDePontuacao estrategia = bilhete.getEstrategiaDePontuacao(passageiro.isDiamante());
			
			totalDePontos += estrategia.calcularPontuacao(voo.getDistancia());
		}
		
		passageiro.atualizarPontuacao(totalDePontos);
		passageiro.marcarVoosComoProcessados();
		
		return totalDePontos;
	}
}
