
package vendaSementes;

/**
 *
 * @author welbe
 */
public class App {
    
    public static void main(String[] args) {
        
        FabricaSemente fabrica = new FabricaSemente();
        Revenda vendedor = new Revenda(fabrica);
        
        
        vendedor.pedirSemente("Milho");
        vendedor.pedirSemente("Soja");
    }
}
