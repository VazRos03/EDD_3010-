/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conjuntos;

import java.util.HashSet;

/**
 *
 * @author Arturo
 */
public class Conjuntos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        HashSet<conjuntoADT> union, interseccion, diferencia;
        
        conjuntoADT<String> jk = new conjuntoADT<>();
        HashSet<String> jm = new HashSet<>();
        
        jk.getLong();
        
        //agregando elementos al conjunto
        jk.agregar("Lupe");
        jk.agregar("Jose");
        jk.agregar("Luis");
        jk.agregar("Shandi");
        jk.agregar("Ximena");
        
   
        System.out.println(jk);
        
        System.out.println("---------------Contenido del conjunto---------------------");
        jk.contenido("Luis");//existe en el conjunto
        jk.contenido("Sergio");//no existe en el conjunto
        
        jk.eliminar("Lupe");//eliminando el elemento "Lupe" del conjunto
        System.out.println("Elemento eliminado del conjunto: " + jk);
        
        
        jm.add("Pedro");
        jm.add("Mario");
        jm.add("Eduardo");
        jm.add("Lupe");
        jm.add("Sergio");
        
        jk.equals(jm);
        
        jk.subConjunto(jm);
        
        jk.interseccion(jm);
        
        jk.union(jm);
        
        jk.diferencia(jm);
        
        jk.iterador();
        
        
        
        
        
    }
    
}
