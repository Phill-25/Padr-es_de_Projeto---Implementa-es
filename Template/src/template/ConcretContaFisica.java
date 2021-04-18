package template;

import java.util.Random;

public class ConcretContaFisica extends AbstractBanco {
	
	
	@Override
		public void primitiveGeraConta() {
        Random gerador = new Random();
        String conta="";

        for (int i = 0; i < 6; i++) {
           conta +=  gerador.nextInt(10);
        }
		conta += "-1";
        setConta(conta);
			
		}
@Override
	public void primitiveNovaConta() {
		setTipo_conta("PESSOA FÍSICA");
		
		setAgencia("00254-3");
		
	}
	
 	@Override
 		public void primitiveNovosaldo() {
 		
 			setSaldo(100.00);
 			
 		}
}
