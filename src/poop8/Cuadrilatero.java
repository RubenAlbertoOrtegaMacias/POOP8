/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 * Es la clase que crea un Cuadrilatero con 4 atributos
 * Hereda metodos y atributos de la clase Poligono
 * @author RUBENO
 */
public class Cuadrilatero extends Poligono{
    private int alpha,beta;
    private float base,alt;
    /**
     * Constructor vacio que inicializa en cero o null
     */
    public Cuadrilatero() {
    }
    /**
     * Constructor de lleno 
     * @param alpha angulo del cuadrilatero
     * @param beta angulo del cuadrilatero
     * @param base base del cuadrilatero
     * @param alt altura del cuadrilatero
     */
    public Cuadrilatero(int alpha, int beta, float base, float alt) {
        this.alpha = alpha;
        this.beta = beta;
        this.base = base;
        this.alt = alt;
    }
    /**
     * Constructor de 2 atributos
     * @param base base del cuadrilatero
     * @param alt base del cuadrilatero
     */
    public Cuadrilatero(float base, float alt) {
        this.base = base;
        this.alt = alt;
    }
    
    /**
     * Regresa el angulo del cuadrilatero
     * @return la variable alpha
     */
    public int getAlpha() {
        return alpha;
    }
    /**
     * Establece el angulo del cuadrilatero
     * @param alpha angulo del cuadrilatero
     */
    public void setAlpha(int alpha) {
        this.alpha = alpha;
    }
    /**
     * Regresa el angulo del cuadrilatero
     * @return la variable beta
     */
    public int getBeta() {
        return beta;
    }
    /**
     * Establece el angulo del cuadrilatero
     * @param beta angulo del cuadrilatero
     */
    public void setBeta(int beta) {
        this.beta = beta;
    }
    /**
     * Regresa la base del cuadrilatero
     * @return la variable base
     */
    public float getBase() {
        return base;
    }
    /**
     * Establece la base del cuadrilatero
     * @param base base del cuadrilatero
     */
    public void setBase(float base) {
        this.base = base;
    }
    /**
     * Regresa la altura del cuadrilatero
     * @return la variable alt
     */
    public float getAlt() {
        return alt;
    }
    /**
     * Establece la base del cuadrilatero
     * @param alt altura del cuadrilatero
     */
    public void setAlt(float alt) {
        this.alt = alt;
    }
    /**
     * Es una sobreescritura del metodo perimetro
     */
    @Override
    public float perimetro() {
        return base*4;
    }
    /**
     * Es una sobreescritura del metodo area
     */
    @Override
    public float area() {
        return base*alt;
    }
    /**
     * sobreescribe el objeto
     * @return la representacion en forma de cadena del objeto
     */
    @Override
    public String toString() {
        return super.toString()+"Cuadrilatero{" + "alpha=" + alpha + ", beta=" + beta + ", base=" + base + ", alt=" + alt + '}';
    }
    
    
}

