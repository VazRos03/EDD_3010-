/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hash;

/**
 *
 * @author Arturo
 */
public class HashADT {
    private int key;
    private Object value;
    HashADT next;
    
    public HashADT(int key, Object value){
        this.key = key;
        this.value = value;
        next = null;
    }
    
    public HashADT(){
        next = null;
    }
    
    public int getKey(){
        return this.key;
    }
    
    public Object getValue(){
        return this.value;
    }
}
