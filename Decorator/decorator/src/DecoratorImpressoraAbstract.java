

public abstract class DecoratorImpressoraAbstract implements ImpressorasInterface{

    protected ImpressorasInterface impressora;

    public DecoratorImpressoraAbstract(ImpressorasInterface impressora){
        this.impressora = impressora;
    }
    
    @Override
    public Double getPreco() {
        // TODO Auto-generated method stub
        return impressora.getPreco();
    }

    @Override
    public String getTipo() {
        // TODO Auto-generated method stub
        return impressora.getTipo();
    }
}
