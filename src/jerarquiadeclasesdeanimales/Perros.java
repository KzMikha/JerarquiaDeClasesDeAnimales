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
public class Perros extends Canidos{
     
    public Perros(){
    }
    public Perros(String NombreCientifico, String Sonido, String Alimentos, 
        String Habitat){
        super("Canis lupus familiaris", "ladrido", "carnivora", "domestico");
    }
}

