/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jerarquiadeclasesdeanimales;

/**
 *
 * @author Erick
 */
public class Gatos extends Felinos{
    
    public Gatos(){
    }
    public Gatos(String NombreCientifico, String Sonido, String Alimentos, 
        String Habitat){
        super("Felis silvestris catus", "maullido", "ratones", "domestico");
    }
}
