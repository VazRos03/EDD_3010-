/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleado;

import java.io.*; 
import javax.swing.JOptionPane;
/**
 *
 * @author Arturo
 */
public class Archivo {
    private BufferedReader leer;
    private String fila;
    private String parte [] = null;
    
    public void Leer(String archivo){
        //excepcion para la lectura del archvio
        try {
            leer = new BufferedReader(new FileReader(archivo));
            while((fila = leer.readLine())!= null){
                parte = fila.split(",,");// realiza una separacion cuando encuentra comas 
                
                imprimir();
                    //System.out.print();
            }
            
            leer.close();//cerrando archivo
            fila = null;
            parte = null;
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    
    private void imprimir(){
        for(int i = 0; i<parte.length; i++){
            System.out.println(parte[i]+"/");
        }
    }
    
}
