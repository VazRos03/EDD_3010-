/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colas;

import javax.swing.JOptionPane;

public class Colas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int opcion =0, elemento = 0;
        colasADT cola = new colasADT();
        do{
            try {
                
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, 
                        "\t COLAS\n\n"
                        +"1. Insertar un elemento\n"
                        +"2. Extraer un elemento\n"
                        +"3. Mostrar contenido\n"
                        +"4. Salir\n"
                        ));
                
               switch(opcion){
                   case 1:
                       elemento = Integer.parseInt(JOptionPane.showInputDialog(null, 
                               "Ingrese un elemento "));
                       cola.enqueue(elemento);
                       break;
                    case 2:
                        if(!cola.isEmpty()){
                            JOptionPane.showInputDialog(null, " Se retiro el elemento " + cola.dequeue());
                        }else{
                            JOptionPane.showMessageDialog(null, " Lo sentimos, la cola esta VACIA");
                        }
                       break;
                    case 3:
                        if(!cola.isEmpty()){
                            cola.Mostrar();
                        }else{
                            JOptionPane.showConfirmDialog(null, "La cola esta vacia");
                        }
                       break;
                    case 4:
                        opcion = 4;
                       break;
                    default:
                       JOptionPane.showMessageDialog(null, " Opcion fuera del menu");
                       break;
               }
                
            } catch (NumberFormatException e) {
            }
 
        }while(opcion != 4);
    }
    
}
