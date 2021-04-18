package template;

public abstract class AbstractBanco {
	private String tipo_conta;
	private String agencia;
	private String conta;
	private Double saldo;
	public final void templateConta(){
		System.out.println("Criando uma nova conta no Banco...");
		
		primitiveGeraConta();
		
		primitiveNovaConta();
		
		primitiveNovosaldo();
	}
	
	public abstract void primitiveNovosaldo();
	public abstract void primitiveNovaConta();
	public abstract void primitiveGeraConta();
	
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	public void setTipo_conta(String tipo_conta) {
		this.tipo_conta = tipo_conta;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public void setConta(String conta) {
		this.conta = conta;
	}
	public Double getSaldo() {
		return saldo;
	}
	public String getTipo_conta() {
		return tipo_conta;
	}
	public String getAgencia() {
		return agencia;
	}
	public String getConta() {
		return conta;
	}
	

}
