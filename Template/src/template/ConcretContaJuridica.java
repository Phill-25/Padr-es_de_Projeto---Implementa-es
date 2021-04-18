package template;

import java.util.Random;

public class ConcretContaJuridica extends AbstractBanco {
	
	
	@Override
		public void primitiveGeraConta() {
        Random gerador = new Random();
        String conta="";

        for (int i = 0; i < 8; i++) {
           conta +=  gerador.nextInt(10);
        }
		conta += "-2";
        setConta(conta);
			
		}
@Override
	public void primitiveNovaConta() {
		setTipo_conta("PESSOA JURÍDICA");
		
		setAgencia("00254-3");
		
	}
	
 	@Override
 		public void primitiveNovosaldo() {
 		
 			setSaldo(10000.00);
 			
 		}
}
