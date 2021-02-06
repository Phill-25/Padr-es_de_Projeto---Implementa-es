package conversorTxt;

import java.util.Scanner;

public class Diretor {

	private static Scanner in;

	public static void main(String[] args) {
		ConversorDirector conversor;

		do {
			try {
				in = new Scanner(System.in);

				System.out.println("Ol�, vamos come�ar!");
				System.out.println("Escolha:\n 1 -> Bin�rio \n 2 -> Hexadecimal \n 3 -> Octal \n 4 -> ACSII \n 0 -> Encerrar");

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
					System.out.println("At� a pr�xima!");
					break;

				}else  {
					System.out.println("Op��o Inv�lida!\nTentenovamente, digite 1 para continuar ou 2 para encerrar:");
					int act = in.nextInt();
					if(act == 1) {
						continue;
					}else {
						System.out.println("At� a pr�xima!");
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
