package conversorTxt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BuilderConversorBinario extends ConversorTXT {

	public void converte(String local, String destino) {
		String Nlinha ="";

		try {
			FileReader reder = new FileReader(local);
			BufferedReader leitor = new BufferedReader(reder);

			FileWriter saida = new FileWriter(destino);

			BufferedWriter bw = new BufferedWriter(saida);

			String linha="";
			int cod;
			int ascii;
			bw.write("");
			while(true){
				linha = leitor.readLine();
				Nlinha="";
				System.out.println(linha);
				if(linha == null)	break;

//				linha = linha.toLowerCase();


				for (int i = 0; i < linha.length(); i++) {


					if(linha.charAt(i) >= 'a' && linha.charAt(i) <= 'z'){
						//System.out.println(linha.charAt(i));
						cod = linha.charAt(i);
						ascii = (int)cod;
						
						Nlinha += String.valueOf(Integer.toBinaryString(ascii)+"-");

					}else if(linha.charAt(i) >= '0' && linha.charAt(i)<= '9'){
						cod = linha.charAt(i);
						ascii = (int)cod;

						Nlinha += String.valueOf(Integer.toBinaryString(ascii)+"-");

					}else{
						cod = linha.charAt(i);
						ascii = (int)cod;
						Nlinha += String.valueOf(Integer.toBinaryString(ascii)+"-");
					}


				}
				System.out.println(Nlinha);
				bw.append(Nlinha);
				bw.newLine();
				bw.flush();


			}
			bw.close();
			leitor.close();

		} catch (IOException e) {
			e.getMessage();
		}

	}




}

