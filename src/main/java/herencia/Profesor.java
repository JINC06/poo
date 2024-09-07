/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author julio.nava
 */
public class Profesor extends Persona {
    
    private String idProfesor;
    
    public Profesor(String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);
        this.idProfesor = "Unknown";
    }

    /**
     * @return the idProfesor
     */
    public String getIdProfesor() {
        return idProfesor;
    }

    /**
     * @param idProfesor the idProfesor to set
     */
    public void setIdProfesor(String idProfesor) {
        this.idProfesor = idProfesor;
    }

    @Override
    public String toString() {
        return getNombre() + " " + getApellidos() + " - " + getEdad() + " - " + getIdProfesor();
    }
    
}
