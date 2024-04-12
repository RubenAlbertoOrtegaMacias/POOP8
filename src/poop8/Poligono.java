/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 *este programa proporciona una estructura básica para trabajar con polígonos en Java
 * permitiendo que se definan diferentes tipos de polígonos concretos que deben 
 * implementar los métodos area() y perimetro()
 * @author RUBENO
 */
/*
public class Poligono {

    public Poligono() {
    }
    
    
    public float area(){
        return 0;
    }
    
    public float perimetro(){
        return 0;
    }

    @Override
    public String toString() {
        return "Poligono{" + '}';
    }
    
    
}
*/ 
//en el diagrama ponemos una a antes del nombre de la clase para indicar que es abstracta
public abstract class Poligono{
    /**
     * Constructor vacio que inicializa en cero o null
     */
    public Poligono(){
        
    }
    /**
     * Metodo que realiza el Poligono
     * @return 
     */
    public abstract float area();
    public abstract float perimetro();
    
}
