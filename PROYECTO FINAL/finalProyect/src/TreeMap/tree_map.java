/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TreeMap;
import java.util.TreeMap;
/**
 *
 * @author User
 */
public class tree_map {
    public static void main(String[] args) {
        //llamando a la clase treemap con su objeto llamado tree
        TreeMap<Integer, String> tree = new TreeMap<>();
        
        //insertando elementos en el objeto "tree"
        tree.put(1, "Leon");
        tree.put(3, "Ciervo");
        tree.put(4, "Lobo");
        tree.put(2, "perro");
        tree.put(5, "Cebra");
        
        System.out.println("-----Elementos del objeto tree--------");
        //mostrando el mapa
        System.out.println(tree);
        
        System.out.println("-----tree esta vacio?--------");
        //usamos un condicional para saber si tree esta vacio, mediante el metodo 'isEmpty'
        if(tree.isEmpty()){
            System.out.println("Tree esta vacio");
        }else{
            System.out.println("Tree no esta vacio");
        }
        
        System.out.println("-----Tamanio del objeto tree--------");
        //cantidad de elementos del treeMap
        System.out.println("El objeto 'tree' tiene " + tree.size() + " elementos");
        
        //eliminando elementos del treeMapp
        System.out.println("-----Eliminando un elemento--------");
        tree.remove(3, "Ciervo");
        System.out.println(tree);
        //imprimiendo el nuevo tamanio del treeMap
        System.out.println("Ahora tiene "+tree.size() + " elementos");
        
    }
}
