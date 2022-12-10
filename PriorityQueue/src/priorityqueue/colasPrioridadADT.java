/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package priorityqueue;

/**
 *
 * @author Arturo
 */
public class colasPrioridadADT <T>{
    int [] nivelesDePrioridad;
    Nodo inicioCola, finalCola;

    public colasPrioridadADT() {
       inicioCola = null;
       finalCola = null;
    }
    
    //metodo para saber si la cola esta vacia
    public Boolean isEmpety(){
        return inicioCola == null? true : false;
    }
    
    //metodo que retorna el numero de elementos 
    public int length(){
        return nivelesDePrioridad.length;
    }
    
    //metodo que ingresa elemento a la cola dependiendo su priorirad
    public void enqueue(int priority, int elem){
        int aux = 0; 
        Nodo nuevo = new Nodo(elem);
        nuevo.dato = elem;
        nuevo.siguiente = null;
        if(isEmpety() && priority == aux){
            inicioCola = nuevo;
            finalCola = nuevo;
        }else{
            finalCola.siguiente = nuevo;
            finalCola = nuevo;
            
        }
    }
    
    public void dequeue(){
        int delete = 0;
        if(isEmpety()){
            System.out.println("Cola vacia");
        }else{
            delete = inicioCola.dato;
            
            nivelesDePrioridad --;
        }
        System.out.println("elemento " + delete + " eliminado");
    }
    
    public String imprimir(){
        return inicioCola;
    }
}
