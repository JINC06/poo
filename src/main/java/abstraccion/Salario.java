/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstraccion;

/**
 *
 * @author julio.nava
 */
public class Salario extends Empleado {
    
    private double salario;

    public Salario(String nombre, String direccion, int numero, double salario) {
        super(nombre, direccion, numero);
        this.salario = salario;
    }

    public void chequeCorreo() {
        System.out.println("Dentro de chequeCorreo de la clase Salario");
        System.out.println("Enviando cheque a " + getNombre()
                                + " con salario " + getSalario());
    }
    
    public double getSalario()
    {
            return salario;
    }

    public void setSalario(double nuevo)
    {
            if (nuevo >= 0.0)
                    salario = nuevo;
    }

    @Override
    public double pagoCalculado()
    {
            System.out.println("Computando el pago del salario a "
                                            + getNombre());
            return salario/52;
    }
    
    
    
}
