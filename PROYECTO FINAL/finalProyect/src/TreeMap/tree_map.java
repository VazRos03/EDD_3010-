/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TreeMap;
import java.util.Map;
import java.util.TreeMap;
/**
 *
 * @author User
 */
public class tree_map {
    public static void main(String[] args) {
        //llamando a la clase treemap con su objeto llamado tree
        Map<Integer, String> tree = new TreeMap<>();
        
        //insertando elementos en el objeto "tree"
        tree.put(1, "Leon");
        tree.put(3, "Ciervo");
        tree.put(4, "Lobo");
        tree.put(2, "perro");
        tree.put(5, "Cebra");
        
        //mostrando el mapa
        System.out.println(tree);
        //cantidad de elementos del treeMap
        System.out.println(tree.size());
        
        //eliminando elementos del treeMapp
        tree.remove(3, "Ciervo");
        System.out.println("-----Eliminando elementos--------");
        System.out.println(tree);
        
        //imprimiendo el tamanio del treeMap
        System.out.println(tree.size());
        
    }
}
