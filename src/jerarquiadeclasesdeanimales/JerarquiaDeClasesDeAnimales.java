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
public class JerarquiaDeClasesDeAnimales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Animal array[] = new Animal[4];
       array[0] = new Felinos("Felis silvestris catus", "maullido", "ratones", "domestico");
       array[1] = new Felinos("Panthera leo", "rugido", "carnivora", "pradera");
       array[2] = new Canidos("Canis lupus", "aullido", "carnivora", "bosque");
       array[3] = new Canidos("Canis lupus familiaris", "ladrido", "carnivora", "domestico");
       
       System.out.println("Gato");
       System.out.println("Nombre Cientifico: " + array[0].NombreCientifico);
       System.out.println("Sonido: " + array[0].Sonido);
       System.out.println("Alimentacion: " + array[0].Alimentos);
       System.out.println("Habitat: " + array[0].Habitat);
       System.out.println();
       System.out.println("Leon" );
       System.out.println("Nombre Cientifico: " + array[1].NombreCientifico);
       System.out.println("Sonido: " + array[1].Sonido);
       System.out.println("Alimentacion: " + array[1].Alimentos);
       System.out.println("Habitat: " + array[1].Habitat);
       System.out.println();
       System.out.println("Lobo" );
       System.out.println("Nombre Cientifico: " + array[2].NombreCientifico);
       System.out.println("Sonido: " + array[2].Sonido);
       System.out.println("Alimentacion: " + array[2].Alimentos);
       System.out.println("Habitat: " + array[2].Habitat);
       System.out.println();
       System.out.println("Perro");
       System.out.println("Nombre Cientifico: " + array[3].NombreCientifico);
       System.out.println("Sonido: " + array[3].Sonido);
       System.out.println("Alimentacion: " + array[3].Alimentos);
       System.out.println("Habitat: " + array[3].Habitat);
       System.out.println();
    }   
}
