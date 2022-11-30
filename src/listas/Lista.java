// ZUASNABAR PAUCAR MADELEY
package listas;

public class Lista 
{

 //Declaración de atributos
 private Nodo inicio;
 private Nodo fin;
 
 //Constructos de la clase Lista
 public Lista()
 {
  inicio=fin=null;
 }
 
 //Metodo para agregar un nodo al final
 public void agregarFin(int info)
 {
  
  Nodo nuevo = new Nodo(info, null);
 
  if(inicio==null)
  {
   inicio=fin=nuevo;
  }
  else
  {
   fin.setSiguiente(nuevo);
   fin = nuevo;
  }
 
 }
 
 //Metodo para imprimir los datos
 public void imprimir()
 {
  Nodo aux=inicio; 
  while(aux!=null)
  {
   System.out.println(aux.getDato());
   aux = aux.getSiguiente();
  } 
 }
 
 //Metodo apra eliminar los valores que superen un valor dado
 public void eliminar(int valor)
 {
  Nodo anterior=inicio;
  Nodo aux= inicio.getSiguiente();
  Nodo temp;
  while(aux!=null)
  {
   //Condicional simple para eliminacion de nodos
   if(aux.getDato() > valor)
   {
    temp=aux.getSiguiente();   
    anterior.setSiguiente(aux.getSiguiente()); 
    aux = temp;   
   }
   else
   {
    anterior=anterior.getSiguiente();
    aux=aux.getSiguiente();
   } 
  }
 }
}