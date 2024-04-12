/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 * Es la clase que crea un Triangulo con 8 atributos
 * Hereda metodos y atributos de la clase Poligono
 * @author RUBENO
 */
public class Triangulo extends Poligono{
    
    private int alpha,beta,gamma;
    private float a,b,c;
    private float base,altura;
    /**
     * Constructor vacio que inicializa en cero o null
     */
    public Triangulo() {
    }
    /**
     * Constructor lleno
     * @param alpha angulo del triangulo
     * @param beta angulo del triangulo
     * @param a lado del triangulo
     * @param gamma angulo del triangulo
     * @param b lado del triangulo
     * @param c lado del triangulo
     * @param base base del triangulo
     * @param altura altura del triangulo
     */
    public Triangulo(int alpha, int beta, int gamma, float a, float b, float c, float base, float altura) {
        this.alpha = alpha;
        this.beta = beta;
        this.gamma = gamma;
        this.a = a;
        this.b = b;
        this.c = c;
        this.base = base;
        this.altura = altura;
    }
    /**
     * Constructor de 2 atributos
     * @param base base del triangulo
     * @param altura base del triangulo
     */
    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }
    
    
    /**
     * Regresa el angulo del triangulo
     * @return la variable alpha
     */
    public int getAlpha() {
        return alpha;
    }
    /**
     * Establece el angulo del triangulo
     * @param alpha angulo del triangulo
     */
    public void setAlpha(int alpha) {
        this.alpha = alpha;
    }
    /**
     * Regresa el angulo del triangulo
     * @return la variable beta
     */
    public int getBeta() {
        return beta;
    }
    /**
     * Establece el angulo del triangulo
     * @param beta angulo del triangulo
     */
    public void setBeta(int beta) {
        this.beta = beta;
    }
    /**
     * Regresa el angulo del triangulo
     * @return la variable gamma
     */
    public int getGamma() {
        return gamma;
    }
    /**
     * Establece el angulo del triangulo
     * @param gamma angulo del triangulo
     */
    public void setGamma(int gamma) {
        this.gamma = gamma;
    }
    /**
     * Regresa el lado del triangulo
     * @return la variable a
     */
    public float getA() {
        return a;
    }
    /**
     * Establece el lado del triangulo
     * @param a lado del triangulo
     */
    public void setA(float a) {
        this.a = a;
    }
    /**
     * Regresa el lado del triangulo
     * @return la variable b
     */
    public float getB() {
        return b;
    }
    /**
     * Establece el lado del triangulo
     * @param b lado del triangulo
     */
    public void setB(float b) {
        this.b = b;
    }
    /**
     * Regresa el lado del triangulo
     * @return la variable c
     */
    public float getC() {
        return c;
    }
    /**
     * Establece el lado del triangulo
     * @param c lado del triangulo
     */
    public void setC(float c) {
        this.c = c;
    }
    /**
     * Regresa la base del triangulo
     * @return la variable base
     */
    public float getBase() {
        return base;
    }
    /**
     * Establece la base del triangulo
     * @param base base del triangulo
     */
    public void setBase(float base) {
        this.base = base;
    }
    /**
     * Regresa la altura del triangulo
     * @return la variable altura
     */
    public float getAltura() {
        return altura;
    }
    /**
     * Establece la altura del triangulo
     * @param altura altura del triangulo
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }
    /**
     * Es una sobreescritura del metodo perimetro
     */
    @Override
    public float perimetro() {
        return base*3;
    }
    /**
     * Es una sobreescritura del metodo area
     */
    @Override
    public float area() {
        return (base*altura)/2; 
    }
    /**
     * sobreescribe el objeto
     * @return la representacion en forma de cadena del objeto
     */
    @Override
    public String toString() {
        return super.toString()+"Triangulo{" + "alpha=" + alpha + ", beta=" + beta + ", gamma=" + gamma + ", a=" + a + ", b=" + b + ", c=" + c + ", base=" + base + ", altura=" + altura + '}';
    }




    
     
    
}
