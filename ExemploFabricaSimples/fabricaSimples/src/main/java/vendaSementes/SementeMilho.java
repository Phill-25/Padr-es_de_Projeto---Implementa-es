
package vendaSementes;

/**
 *
 * @author welbe
 */
public class SementeMilho extends Semente{

    public SementeMilho() {
        
        tipo = "Milho";
        preco = 51.00;
    }
    
    @Override
    public void exibeSemente() {
        System.out.println("Pedido de " + tipo + ". Preço: " + preco);
    }
    
}
