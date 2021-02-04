
package vendaSementes;

/**
 *
 * @author welbe
 */
public class SementeSoja extends Semente{
    
    public SementeSoja(){
        tipo = "Soja";
        preco = 78.00;
    }

    @Override
    public void exibeSemente() {
        System.out.println("Pedido de " + tipo + ". Preço: " + preco);
    }

}
