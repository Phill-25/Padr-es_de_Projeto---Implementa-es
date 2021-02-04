/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendaSementes;


public class FabricaSemente {
    
    Semente semente;
    
    public Semente criaSemente(String tipo){
        
        if (tipo.equals("Milho")) {
            semente = new SementeMilho();
        } else if(tipo.equals("Soja")){
            semente = new SementeSoja();
        }
        return semente;
    }
}
