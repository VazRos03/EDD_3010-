/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listsimlig;

/**
 *
 * @author Arturo
 */
public class ListSimLig {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //creando objeto list de la clase listasADT
        listasADT<Integer> list = new listasADT<>();
        
        //Probando metodos de la lista
        
        list.estaVacia();
        
        list.getTamanio();
        
        list.agregarAlFinal(13);
        
        
        list.agregarAlInicio(16);
        
        
        list.agregarDespuesDe(5, 9);
        
        list.agregarAlInicio(90);
        list.agregarAlInicio(1);
        list.agregarAlInicio(78);
        list.agregarAlInicio(45);
        list.agregarAlInicio(156);
        list.agregarAlInicio(234);
        list.agregarAlInicio(98);
        
        
        list.eliminar(4);
        list.transversal();
        
        list.eliminarElFinal();
        list.transversal();
        
        list.eliminarElPrimero();
        
        
        list.buscar(6);
        
        list.actualizar(2, 1);
        
        list.getTamanio();
        
        list.transversal();
       
    }
    
}
