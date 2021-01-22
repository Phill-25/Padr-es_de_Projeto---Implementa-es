package strategy;

import java.util.ArrayList;

public class Passageiro {
	Boolean diamante;
	int totalDePontos;
	ArrayList<Bilhete> bilhetes;
	ArrayList<Voo> voos;
	private ArrayList<Voo> voosPendentes;
	
	public ArrayList<Voo>  getVoosComPontuacaoPendente(){
		
			voosPendentes = null;
			
		for (Voo voo :voos) {
			if(voo.status.equals("pendete")) {
				voosPendentes.add(voo);
			}
		}
		
		return voosPendentes;
	}
	
	public Bilhete getBilhete(int num) {
		return bilhetes.get(num);
	}

	public boolean isDiamante() {
		return this.diamante;
	}

	public void atualizarPontuacao(int totalDePontos) {
		this.totalDePontos = totalDePontos;
			
	}

	public void marcarVoosComoProcessados() {
		for (Voo voo : voos) {
			voo.status = "Processado";
		}
		
	
	}
}
