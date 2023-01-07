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
public class Lobos extends Canidos{
     
    public Lobos(){
    }
    public Lobos(String NombreCientifico, String Sonido, String Alimentos, 
        String Habitat){
        super("Canis lupus", "aullido", "carnivora", "bosque");
    } 
}
