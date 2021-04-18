package template;

public class App {
	public static void main(String[] args) {
		
		
		AbstractBanco nova_conta_1 = new ConcretContaFisica();
		
		nova_conta_1.templateConta();
		
		System.out.println("Número da conta: "+nova_conta_1.getConta()+"\n"+"Tipo: "+nova_conta_1.getTipo_conta()+"\n"+"Nº Agência: "+nova_conta_1.getAgencia()+"\n"+"Saldo Inicial: "+nova_conta_1.getSaldo().toString());
		
		
		System.out.println("-----------------------------------------------------------------------------------------------");
		AbstractBanco nova_conta_2 = new ConcretContaJuridica();
		
		nova_conta_2.templateConta();
		
		System.out.println("Número da conta: "+nova_conta_2.getConta()+"\n"+"Tipo: "+nova_conta_2.getTipo_conta()+"\n"+"Nº Agência: "+nova_conta_2.getAgencia()+"\n"+"Saldo Inicial: "+nova_conta_2.getSaldo().toString());
	}
}
