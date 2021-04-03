public class GMBuilder extends CarroBuilder {
	
	@Override
	public void buildPreco() {
		carro.preco = 18000.00; // mudar para set; criar metodo set em carroProduct
	}

	@Override
	public void buildDscMotor() {
		carro.dscMotor = "1.4 EconoFlex";
	}

	@Override
	public void buildAnoDeFabricacao() {
		carro.anoDeFabricacao = 2008;
	}

	@Override
	public void buildModelo() {
		carro.modelo = "Prisma";
	}

	@Override
	public void buildMontadora() {
		carro.montadora = "General Motors - Chevrolet";
	}

}