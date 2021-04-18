public class ImpressoraColor implements ImpressorasInterface {

    private Double preco = 129.95;
    private String tipo = "Impressora";


    @Override
    public Double getPreco() {
        // TODO Auto-generated method stub
        return preco;
    }

    @Override
    public String getTipo() {
        // TODO Auto-generated method stub
        return tipo;
    }

    public void setPreco(Double preco){
        this.preco = preco;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    
}
