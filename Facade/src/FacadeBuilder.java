public class FacadeBuilder{
	
	private ConcessionariaDirector concessionaria;

	private CarroProduct carro;


	public void makeFiatCar(){


		concessionaria = new ConcessionariaDirector(new FiatBuilder());
	 
	    concessionaria.construirCarro();
	    
	    carro = concessionaria.getCarro();
	    
	    System.out.println("Carro: " + carro.modelo + "/" + carro.montadora + "\nAno: " + carro.anoDeFabricacao + "\nMotor: "
	    					 + carro.dscMotor + "\nValor: " + carro.preco + "\n \n");
	}


	public void makeVolksCar(){
	 
	    concessionaria = new ConcessionariaDirector(new VolksBuilder());
	    
	    concessionaria.construirCarro();
	    
	    carro = concessionaria.getCarro();
	    
	    System.out.println("Carro: " + carro.modelo + "/" + carro.montadora + "\nAno: " + carro.anoDeFabricacao + "\nMotor: "
	                       + carro.dscMotor + "\nValor: " + carro.preco + "\n \n");
	}

	public void makeGMCar(){
	 
	    concessionaria = new ConcessionariaDirector(new GMBuilder());
	    
	    concessionaria.construirCarro();
	    
	    carro = concessionaria.getCarro();
	    
	    System.out.println("Carro: " + carro.modelo + "/" + carro.montadora + "\nAno: " + carro.anoDeFabricacao + "\nMotor: "
	                       + carro.dscMotor + "\nValor: " + carro.preco + "\n \n");
	}

}