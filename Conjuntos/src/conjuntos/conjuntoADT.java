/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conjuntos;

import java.util.*;


/**
 *
 * @author Arturo
 */
public class conjuntoADT<K> {
    int tam;
    HashSet<K> conjunto = new HashSet<>();
    HashSet<K> otroConjunto;
    
    //constructor

    public conjuntoADT() {
    }
    
    //regresa la cantidad de elementos del conjunto
    public int getLong(){
        tam = conjunto.size();
        
        return(int) this.tam;
    }
    
    //elemento existente en el conjunto
    public void contenido(K elemento){
        Boolean pos = conjunto.contains(elemento);
        
        if(pos == true){
            System.out.println("El elemento ya existe en el conjunto");
        }else{
            System.out.println("El elemento no existe en el conjunto");
        }
    }
    
    public void agregar(K elemento){
        Boolean pos = conjunto.contains(elemento);
        
        if(pos == true){
            System.out.println("El elemento ya existe dentro del conjunto");//si pos da positivo, el elemento no se agregara al conjunto
        }else{
            conjunto.add(elemento);//si a pos da negativo, el elemento se agrega al conjunto 
        }
    }
    
    public void eliminar(K elemento){
        conjunto.remove(elemento);//se elimina el elemento que esta en el conjunto
    }
    
    public boolean equals(HashSet<K> sq){
        //condicional para saber si los dos conjuntos son iguales
        if(conjunto.equals(sq)){
            System.out.println("Los conjuntos son iguales");
        }else{
            System.out.println("Los conjuntos son diferentes");
        }
        //retorna el conjunto
        return conjunto.equals(sq);
    }
    
    public boolean subConjunto(HashSet<K> sq){
        if(conjunto.containsAll(sq)){
            System.out.println("Es subconjunto de " + conjunto);
        }else{
            System.out.println("No es subconjunto de " + conjunto);
        }
        return conjunto.containsAll(sq);
    }
    
    public void union(HashSet<K> sq){
        HashSet<K> union = new HashSet<>();
        K dato1;
        K dato2;
        
        Iterator<K> i = conjunto.iterator();//primer conjunto
        Iterator<K> j = sq.iterator();//segundo conjunto
        
        
        //bucles 
        while(i.hasNext()){
            dato1 = i.next();
            
            if(!union.contains(dato1)){
                union.add(dato1);
            }
        }
        
        while(j.hasNext()){
            dato2 = j.next();
            
            if(union.contains(dato2)){
                union.add(dato2);
            }
        }
        
        System.out.println("Union de los conjuntos: " + union);
    }
    
    
    public void interseccion(HashSet<K> sq){
        HashSet<K> inter = new HashSet<>();
        K dato1;
        K dato2;
        
        Iterator<K> i = conjunto.iterator();//primer conjunto
        Iterator<K> j = sq.iterator();//segundo conjunto
        
        //bucles
        while(i.hasNext()){
            dato1 = i.next();
            
            while(j.hasNext()){
                dato2 = j.next();
                
                if(dato1.equals(dato2)){
                    inter.add(dato1);
                }
            }
            j = sq.iterator();
        }
        
        System.out.println("Interseccion de los conjuntos: " + inter);
    }
    
    public void diferencia(HashSet<K>sq){
        HashSet<K> diferencia = new HashSet<>();
        K dato;
        
        Iterator<K> i = conjunto.iterator();
        
        while(i.hasNext()){
            dato = i.next();
            if(!sq.contains(dato)){
                diferencia.add(dato);
            }
        }
        System.out.println("Diferencia de los conjuntos: " + diferencia);
    }
    
    public void iterador(){
        Iterator valor = conjunto.iterator();
        
        System.out.println("Conjunto iterado: ");
        while(valor.hasNext()){
            System.out.println(valor.next());
        }
    }
    
    
    
}
