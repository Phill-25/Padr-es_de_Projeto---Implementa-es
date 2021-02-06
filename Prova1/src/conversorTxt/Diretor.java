package conversorTxt;

import java.util.Scanner;

public class Diretor {

	private static Scanner in;

	public static void main(String[] args) {
		ConversorDirector conversor;

		do {
			try {
				in = new Scanner(System.in);

				System.out.println("Olá, vamos começar!");
				System.out.println("Escolha:\n 1 -> Binário \n 2 -> Hexadecimal \n 3 -> Octal \n 4 -> ACSII \n 0 -> Encerrar");

				int escolha = in.nextInt();

				if (escolha == 1) {
					conversor = new ConversorDirector(new ConversorBinarioBuilder());
					conversor.converteArquivo();
				} else if(escolha == 2) {
					conversor = new ConversorDirector(new ConversorHexBuilder());
					conversor.converteArquivo();
				}else if(escolha == 3) {
					conversor = new ConversorDirector(new ConversorOCTBuilder());
					conversor.converteArquivo();
				}else if(escolha ==  4) {
					conversor = new ConversorDirector(new ConversorASCIIBuilder());
					conversor.converteArquivo();
				}else if(escolha == 0) {
					System.out.println("Até a próxima!");
					break;

				}else  {
					System.out.println("Opção Inválida!\nTentenovamente, digite 1 para continuar ou 2 para encerrar:");
					int act = in.nextInt();
					if(act == 1) {
						continue;
					}else {
						System.out.println("Até a próxima!");
						break;
					}


					//					

				}


				continue;
			} catch (Exception e) {
				// TODO: handle exception
			}
		} while (true);



	}

}
