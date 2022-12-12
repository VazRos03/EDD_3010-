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
        HashMap<String, String> diccionario = new HashMap<>();
        
        //estableciendo valores en el objeoto diccionario
        diccionario.put("user", "Arturo");
        diccionario.put("age", "18");
        diccionario.put("height", "1.75");
        
        System.out.println("------Elementos del diccionario------");
        System.out.println(diccionario);
        
        System.out.println("-------Acceso a cada elemento mediante la key------");
        //accediendo a los valores mediantes las llaves
         String nombre = diccionario.get("user").toString();
         System.out.println(nombre);
         
         String edad = diccionario.get("age").toString();
         System.out.println(edad);
         
         String altura = diccionario.get("height").toString();
         System.out.println(altura);
         
         System.out.println("-------Existe esta key?-------");
         //comprobando que existe una key
         boolean existe = diccionario.containsKey("marital status");
         //condicional para saber si existe una key
         if(existe == false){
             System.out.println("La key 'Marital Status' no esta registrada");
         }else{
             System.out.println("Si existe la key 'Marital Status'");
         }
         
         System.out.println("------Tamanio del diccionario-------");
         //comprobando que el diccionario no esta vacio para sabre el tamanio del diccionario
         if(!diccionario.isEmpty()){
             System.out.println("El diccionario tiene " + diccionario.size() + " elementos");
         }else{
             System.out.println("Diccionario vacio");
         }
         
         System.out.println("---------eliminando un elemento del diccionario----------");
         //quitando elemento del diccionario usando su key y su value
         diccionario.remove("height", "1.75");
         System.out.println(diccionario);
    }
}
