package conversorTxt;

import java.util.Scanner;

public class Diretor {

	private static Scanner in;

	public static void main(String[] args) {
		ConversorTXT conversor;

		//		conversor = new ConversorOCT();
		//Altere os caminhos e os contrutores
		//		conversor.converte("C:\\Users\\Philipe\\Desktop\\TESTE.txt","C:\\Users\\Philipe\\Desktop\\saida.txt");
		do {
			try {
				in = new Scanner(System.in);

				System.out.println("Olá, vamos começar!");
				System.out.println("Escolha:\n 1 -> Binário \n 2 -> Hexadecimal \n 3 -> Octal \n 4 -> ACSII \n 0 -> Encerrar");

				int escolha = in.nextInt();

				if (escolha == 1) {
					conversor = new ConversorBinario();
				} else if(escolha == 2) {
					conversor = new ConversorHex();
				}else if(escolha == 3) {
					conversor = new ConversorOCT();
				}else if(escolha ==  4) {
					conversor = new ConversorASCII();
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

				conversor.converte("C:\\Users\\Philipe\\Desktop\\TESTE.txt","C:\\Users\\Philipe\\Desktop\\saida.txt");
				continue;
			} catch (Exception e) {
				// TODO: handle exception
			}
		} while (true);



	}

}
