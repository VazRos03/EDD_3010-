/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hash;

/**
 *
 * @author Arturo
 */
public class Hash {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashTableArray<String> hm = new HashTableArray<String>(10);
        
        hm.add(11, "Robert");
        hm.add(12, "Marc");
        hm.add(13, "Sandra");
        
        //imprimiendo elemento en especifico
        System.out.println(hm.get(13));
        
        System.out.println(hm);
    }
    
}
