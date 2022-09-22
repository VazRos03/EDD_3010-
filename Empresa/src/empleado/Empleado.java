package empleado;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Arturo
 */
public class Empleado {
    
    //atributos de la clase empleado
    public static final double horasExtras = 276.5;
    public static final double prestacion_antiguedad = 0.03;
    private int id;
    private String nombre;
    private String paterno;
    private String materno;
    private int Extras;
    private double sueldoBase;
    private int anioIngreso;

    //constructor por defecto
    public Empleado() {
    }
    //constructor sobrecargado
    public Empleado(int id, String nombre, String paterno, String materno, int Extras, double sueldoBase, int anioIngreso) {
        this.id = id;
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.Extras = Extras;
        this.sueldoBase = sueldoBase;
        this.anioIngreso = anioIngreso;
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(int anioIngreso) {
        this.anioIngreso = anioIngreso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public int getExtras() {
        return Extras;
    }

    public void setExtras(int Extras) {
        this.Extras = Extras;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }
    
    //metodo para calcular 
    public double calcular(){
        double Prestacion = (2022 - this.anioIngreso)*this.prestacion_antiguedad;
        double hrs = this.Extras * this.horasExtras;
        return this.sueldoBase + Prestacion + hrs;
    }
    
    //metodo antiguiedad
    public void antiguedad(){
        int ingreso = this.anioIngreso;
        
        if(ingreso >= 2016){
            System.out.println("El trabajador " + this.nombre + " tiene mas antiguedad");
            
        }if( ingreso <= 2020){
            System.out.println("El trabajador " + this.nombre + " tiene menos antiguedad");
        }
        
        
    }
}
