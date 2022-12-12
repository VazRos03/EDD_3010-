/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linked;

import java.util.LinkedHashMap;

/**
 *
 * @author User
 */
public class linked_hash_map {
    
    public static void main(String[] args) {
        
        //creando objeto "diccionario" de la clase LinkedHashMap
        LinkedHashMap<Integer,String> diccionario = new LinkedHashMap<>();
        
        //ingresando valores en el objeto 'diccionario'
        diccionario.put(1, "Leon");
        diccionario.put(3, "Ciervo");
        diccionario.put(4, "Lobo");
        diccionario.put(2, "perro");
        diccionario.put(5, "Cebra");
        
        System.out.println("-----Elementos del diccionario--------");
        //imprimiendo los elementos del objeto diccionario
        System.out.println(diccionario);
        
        System.out.println("------Tamanio del diccionario-------");
        //tamanio del objeto
        System.out.println("El diccionario tiene "+diccionario.size()+ " elementos");
        
        System.out.println("-----El diccionario esta vacio?------");
        //comprobando si el diccionario esta vacio, mediante el metodo 'isEmpty'
        if(diccionario.isEmpty()){
            System.out.println("El diccionario esta vacio");
        }else{
            System.out.println("EL diccionario no esta vacio, tiene " + diccionario.size() + " elementos");
        }
        
        System.out.println("------Eliminando un elemento del diccionario-----");
        //eliminando elementos del diccionario
        diccionario.remove(2, "perro");
        System.out.println(diccionario);
        
        System.out.println("----------Eliminando todos los elementos del diccionario----------");
        //llamamos al objeto 'diccionario' y usaremos el metodo 'clear' para eliminar todos los elementos
        diccionario.clear();
        System.out.println(diccionario);
        System.out.println("El diccionario tiene " + diccionario.size() + " elemntos");
    }
    
}
