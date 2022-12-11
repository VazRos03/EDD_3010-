/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HashMap;

//importando biblioteca para el uso de hasHMap
import java.util.HashMap;

/**
 *
 * @author Arturo
 */
public class hash_map {
    public static void main(String[] args) {
        
        //declarando a la clase HashMap con un objeto llamado "diccionario"
        HashMap diccionario = new HashMap();
        
        //estableciendo valores en el objeoto diccionario
        diccionario.put("user", "Arturo");
        diccionario.put("age", "18");
        diccionario.put("height", "1.75");
        
        //accediendo a las key del diccionario
         String nombre = diccionario.get("user").toString();
         System.out.println(nombre);
         
         String edad = diccionario.get("age").toString();
         System.out.println(edad);
         
         String altura = diccionario.get("height").toString();
         System.out.println(altura);
         
         //comprobando que existe una key
         boolean existe = diccionario.containsKey("marital status");
         System.out.println(existe);
         
         System.out.println("---------eliminando elementos----------");
         //quitando elemento del diccionario
         boolean adios = diccionario.remove("height", "1.75");
         System.out.println(adios);
         System.out.println(diccionario);
    }
}
