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
public abstract class Animal {
    protected String NombreCientifico;
    protected String Sonido;
    protected String Alimentos;
    protected String Habitat;
 protected Animal(){}
 protected Animal(String NombreCientifico, String Sonido, String Alimentos,  String Habitat){
     this.NombreCientifico=NombreCientifico;
     this.Sonido=Sonido;
     this.Alimentos=Alimentos;
     this.Habitat=Habitat;
 }
 
 public String getNombreCientifico(){
  return NombreCientifico;
 }
 public String getSonido(){
  return Sonido;
 }
 public String getAlimentos(){
  return Alimentos;
 }
 public String getHabitat(){
  return Habitat;
 }
 public void setNombreCientifico(String name){
     this.NombreCientifico=name;
 }
  public void setSonido(String sound){
     this.Sonido=sound;
 }
  public void setAlimentos(String food){
     this.Alimentos=food;
 }
  public void setHabitat(String habitat){
     this.Habitat=habitat;
 }
}



