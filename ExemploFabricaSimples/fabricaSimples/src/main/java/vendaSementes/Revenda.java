
package vendaSementes;

/**
 *
 * @author welbe
 */
public class Revenda {
    
    private final FabricaSemente fabrica;
    
    public Revenda(FabricaSemente fabrica){
        this.fabrica = fabrica;
    }
    
    public void pedirSemente(String tipo){
        Semente semente;        
        semente = fabrica.criaSemente(tipo);
        semente.exibeSemente();
    }
}
