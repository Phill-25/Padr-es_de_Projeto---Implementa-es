
public class DecoratorImpressoraCopiadoraColor extends DecoratorImpressoraAbstract {

    public DecoratorImpressoraCopiadoraColor(ImpressorasInterface impressora) {
        super(impressora);
        //TODO Auto-generated constructor stub
    }

    @Override
    public Double getPreco() {
        // TODO Auto-generated method stub
        return impressora.getPreco() + 30.00; 
    }

    @Override
    public String getTipo() {
        // TODO Auto-generated method stub
        return impressora.getTipo() + " Copiadora";
    }
    
}
