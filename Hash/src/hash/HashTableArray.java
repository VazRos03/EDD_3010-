/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hash;

/**
 *
 * @author Arturo
 */
public class HashTableArray<T> {
    HashADT[] arrayHash;
    int size;
    
    public HashTableArray(int si){
       size = si;
       arrayHash = new HashADT[si];
       
       for(int i = 0; i<size;i++){
           arrayHash[i] = new HashADT();
       }
    }
    
    public int getHash(int key){
        return key%size;
     }
    public void add (int key, Object value){
        int iterator = getHash(key);
        HashADT arrayValue = arrayHash[iterator];
        HashADT newtItem = new HashADT(key, value);
        newtItem.next = arrayValue.next;
        arrayValue.next = newtItem;
    }
    
    public T get(int key){
        T value = null;
        int iterator = getHash(key);
        HashADT arrayValue = arrayHash[iterator];
        while(arrayValue != null){
            if(arrayValue.getKey() == key){
                value =(T) arrayValue.getValue();
                break;
            }
            arrayValue = arrayValue.next;
        }
        
        return value;
    }
   
}
