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
public class Leones extends Felinos{
    
    public Leones(){
    }
    public Leones(String NombreCientifico, String Sonido, String Alimentos, 
        String Habitat){
        super("Panthera leo", "rugido", "carnivora", "pradera");
    }
}
