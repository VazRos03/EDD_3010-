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
    int nivelesDePrioridad;
    Nodo inicioCola, finalCola;

    public colasPrioridadADT() {
       nivelesDePrioridad = 7;
       inicioCola = null;
       finalCola = null;
    }
    
    //metodo para saber si la cola esta vacia
    public Boolean isEmpety(){
        return inicioCola == null? true : false;
    }
    
    //metodo que retorna el numero de elementos 
    public int length(){
        return nivelesDePrioridad;
    }
    
    //metodo que ingresa elemento a la cola dependiendo su priorirad
    public void enqueue(int priority, T elem){
        
    }
}
