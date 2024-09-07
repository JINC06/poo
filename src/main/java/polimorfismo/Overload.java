/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo;

/**
 *
 * @author julio.nava
 */
public class Overload {
    
    public void demo(int a){
        System.out.println("a: " + a);
    }
    
    public void demo(int a, int b){
        System.out.println("a and b:" + a +"," + b);
    }
    
    public double demo(double a ) {
        System.out.println("double a: " + a);
        return a*a;
    }
    
}
