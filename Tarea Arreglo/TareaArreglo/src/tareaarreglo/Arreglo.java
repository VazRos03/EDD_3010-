/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaarreglo;

import java.util.ArrayList;

/**
 *
 * @author Arturo
 */
public class Arreglo<L> {
   private  L tamanio;
   private int longuitud;
   private int elemento;
   
    ArrayList<L> Arreglo = new ArrayList<>();

    public Arreglo() {
    }

    public Arreglo(L tamanio, int longuitud, int elemento) {
        this.tamanio = tamanio;
        this.longuitud = longuitud;
        this.elemento = elemento;
    }
    
    
    
    public int getLonguitud(){
        return this.tamanio;
    }
    
    public int setElemento(int iterator,String valor){
        Arreglo.add((int) iterator, (L) valor);
       return 0;
    }
    
    public int getElemento(int iterator){
        return this.elemento;
    }
    
    public void clean(int valor){
        Arreglo.clear();
    }

    @Override
    public String toString() {
        return "Arreglo{" + "tamanio=" + tamanio + ", longuitud=" + longuitud + ", elemento=" + elemento + ", Arreglo=" + Arreglo + '}';
    }

    private static class L {

        public L() {
        }
    }

    
    
    
    
}
