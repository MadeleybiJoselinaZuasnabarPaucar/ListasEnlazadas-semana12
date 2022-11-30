// ZUASNABAR PAUCAR MADELEY
package listas;
public class Nodo {
 
 //Declaración de atributos
 private int dato;
 private Nodo siguiente;
 
 //Constructores de la clase Nodo
 public Nodo (int dato, Nodo siguiente)
 {
  this.dato=dato;
  
  this.siguiente=siguiente;
 }
 
 public Nodo (int datos)
 {
  this.dato=datos;
  this.siguiente=null;
 }
 
 //Metodos getter and setter
 public int getDato() 
 {
  return dato;
 }

 public void setDato(int dato) 
 {
  this.dato = dato;
 }

  public Nodo getSiguiente() 
  {
  return siguiente;
 }

 public void setSiguiente(Nodo siguiente) 
 {
  this.siguiente = siguiente;
 }
}