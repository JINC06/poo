/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstraccion;

/**
 *
 * @author julio.nava
 */
public abstract class Empleado {
    
    private String nombre;
    private String direccion;
    private int numero;
    
    public Empleado(String nombre, String direccion, int numero)
    {
            System.out.println("Construyendo un empleado");
            this.nombre = nombre;
            this.direccion = direccion;
            this.numero = numero;
    }

    public abstract double pagoCalculado();

    public void chequeCorreo()
    {
            System.out.println("Enviando el cheque por correo a "
                            + this.nombre + " " + this.direccion);
    }

    @Override
    public String toString()
    {
            return nombre + " " + direccion + " " + numero;
    }

    public String getNombre()
    {
            return nombre;
    }

    public String getDireccion()
    {
            return direccion;
    }

    public void setDireccion(String nueva)
    {
            direccion = nueva;
    }

    public int getNumero()
    {
            return numero;
    }
    
}
