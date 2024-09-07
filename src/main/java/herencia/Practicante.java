/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author julio.nava
 */
public class Practicante extends Estudiante {
    
    private String idPracticante;

    public Practicante(String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);
        this.idPracticante = "Unknown";
    }

    /**
     * @return the idPracticante
     */
    public String getIdPracticante() {
        return idPracticante;
    }

    /**
     * @param idPracticante the idPracticante to set
     */
    public void setIdPracticante(String idPracticante) {
        this.idPracticante = idPracticante;
    }

    @Override
    public String toString() {
        return getNombre() + " " + getApellidos() + " - " + getEdad() + " - " + getIdAlumno() + " - " + getIdPracticante();
    }
    
}
