/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareaarreglo;


public class TareaArreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Arreglo arr = new Arreglo();
        
        arr.setElemento(0, "Fes Aragon");
        arr.longuitud();
        arr.getElemento(0);
        
        
        for (String array : arr ) {
            System.out.println(array);
        }
    }
    
}
