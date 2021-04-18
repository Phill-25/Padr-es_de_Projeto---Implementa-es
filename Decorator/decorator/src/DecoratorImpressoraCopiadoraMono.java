
public class DecoratorImpressoraCopiadoraMono extends DecoratorImpressoraAbstract{

    public DecoratorImpressoraCopiadoraMono(ImpressorasInterface impressora) {
        super(impressora);
        //TODO Auto-generated constructor stub
    }

    @Override
    public Double getPreco() {
        // TODO Auto-generated method stub
        return impressora.getPreco() + 20.00; 
    }

    @Override
    public String getTipo() {
        // TODO Auto-generated method stub
        return impressora.getTipo() + " Copiadora";
    }
    
}
