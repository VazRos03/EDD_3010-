/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listsimlig;

/**
 *
 * @author Arturo
 */
public class listasADT<T>{
    
    protected Nodo<T> head, fin; // punteros para saber el incio y el fin del nodo
    protected int tamanio;//tamanio de la lista 

    public listasADT() {
        head = null;
        fin = null;
    }
    
    //Metodos de nuestra lista
    public Boolean estaVacia(){
        if (head == null){
            System.out.println("Lista vacia");
        }else{
            System.out.println( this.tamanio + " elementos registrados en la lista");
        }
        return null;
    }
    
    public int getTamanio(){
        return this.tamanio;
    }
    
    //metodo para agregar al final 
    public void agregarAlFinal(T valor){
        if(!estaVacia()){
            fin.siguiente= new Nodo(valor);
            fin = fin.siguiente;
        }else{
            head = fin = new Nodo(valor);
        }
    }
    
    //metodo para agregar al inicio
    public void agregarAlInicio(T valor){
        head = new Nodo(valor, head);//creando nuevo nodo
        
        if(fin == null){
            fin = head;
        }
    }
    
    public void agregarDespuesDe(T referencia, T valor){
        if(head == null){
            head = new Nodo(valor);
        }else{
            Nodo<T> nuevo = new Nodo(valor);
            
            Nodo<T> temp = head;
            Nodo<T> temp1 = head.getSiguiente();
            
            while(temp.getDato() != referencia){
                
                temp = temp.getSiguiente();
                temp1 = temp1.getSiguiente();
            }
            
            temp.setSiguiente(nuevo);
            temp.getSiguiente().setSiguiente(temp1);
            
        }
    }
    
    public void eliminar(int elemento){
        if (!estaVacia()){
                if(head == fin && elemento == head.dato){
                    head = fin = null;
                
                 }else if (elemento == head.dato){
                    head = head.siguiente;
                }else{
                    Nodo<T> anterior = new Nodo(elemento);
                    Nodo<T> temp = new Nodo(elemento);

                    anterior = head;
                    temp = head.siguiente;

                    while(temp != null && temp.dato != elemento){
                        anterior = anterior.siguiente;
                        temp = temp.siguiente;
                    }
                    if(temp != null){
                        anterior.siguiente = temp.siguiente;
                        if(temp == fin){
                            fin = anterior;
                        }
                    }
            }
        }
    }
    
    //metodo para eliminar el nodo final de la lista
    public void eliminarElFinal(){
        Nodo<T> elemento = fin;
        if(head == fin){
            head = fin = null;
        }else{
            Nodo<T> temp = head;//sirve para recorrer en la lista 
            while(temp.siguiente != fin){
                temp = temp.siguiente;
            }
            fin = temp;
            fin.siguiente = null;
        }
    }
    
    //metodo para eliminar en el inicio
    public void eliminarElPrimero(){
        Nodo<T> elemento = head;
        if( head == fin){
            head = fin = null;
        }else{
            head = head.siguiente;
        }
    }
    
    public Boolean buscar(T valor){
        Nodo<T> temp = head;
        while(temp != null && temp.dato != valor){
            temp = temp.siguiente;
        }
        return temp != null;
    }
    
    public void actualizar(T buscar, T valor){
        Nodo<T> temp = head;
        
        try{
            while(temp.getDato()!= buscar){
                temp = temp.siguiente;
            }
            temp.setDato(valor);
        }catch(Exception e){
            System.out.println("El dato a buscar no se encuentra registrado");
        }
    }
    
    public void transversal(){
        Nodo<T> temp = head;
        
        while(temp != null){
            System.out.println(temp);
            temp = temp.siguiente;
        }
        
    }
    
    
    
}

    
