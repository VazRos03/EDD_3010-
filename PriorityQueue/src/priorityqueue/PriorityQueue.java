/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package priorityqueue;

/**
 *
 * @author Arturo
 */
public class PriorityQueue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        colasPrioridadADT queue = new colasPrioridadADT(7);
        
        queue.enqueue(1,"Niñas");
        queue.enqueue(2, "Niños");
        queue.enqueue(2, "Tercera Edad");
        queue.enqueue(3, "Mujeres" );
        queue.enqueue(3, "Hombres");
        queue.enqueue(4, "Maestro");
        queue.enqueue(4, "Mecánico");
        queue.enqueue(4, "Vigia");
        queue.enqueue(4, "Timonel");
        queue.enqueue(5, "Capitan");
        
        System.out.println("Numero de elementos " + queue.length());
        queue.isEmpety()
        
        //eliminando elementos
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
    }
    
}
