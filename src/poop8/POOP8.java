/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop8;

/**
 * el programa muestra cómo se puede utilizar el polimorfismo en Java para tratar
 * objetos de diferentes clases de manera uniforme a través de una referencia de
 * su clase general "Poligono"
 * @author RUBENO
 */
public class POOP8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //metodos concretos
        //Poligono pol = new Poligono();
        Poligono pol;
        //System.out.println(pol.area());
        //System.out.println(pol.perimetro());
        pol=new Triangulo(10,10); //es una sobrescritura
        System.out.println(pol.area());
        pol=new Cuadrilatero(10,10); //es una sobrescritura
        System.out.println(pol.area());
        System.out.println(pol);
        //Los triangulos son poligonos no comida
        //Poligono pol= new Triangulo();
        //System.out.println(pol.area());
        identificadorDePoligonos(pol);
        Object obj = pol;
        System.out.println(obj.toString());
        //Poligono pol1=new Poligono();
        Poligono pol1;
        pol1=(Poligono)obj;
        System.out.println(pol1.area());
        int a = 10;
        int b = 2;
        int c = (int)a/b;
        System.out.println(c);
        
        
    }

    private static void identificadorDePoligonos(Poligono pol) {
        if (pol instanceof Triangulo){
            System.out.println("El Triangulo es un poligono");
        }else if(pol instanceof Cuadrilatero){
            System.out.println("El Cuadrilatero es un poligono");
        }else{
            System.out.println("Es un poligono");
        }
    }
    
}
