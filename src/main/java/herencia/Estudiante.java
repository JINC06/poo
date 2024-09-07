/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author julio.nava
 */
public class Estudiante extends Persona {
    
    
    private String idAlumno;
    
    public Estudiante(String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);
        this.idAlumno = "Unknown";
    }

    /**
     * @return the idAlumno
     */
    public String getIdAlumno() {
        return idAlumno;
    }

    /**
     * @param idAlumno the idAlumno to set
     */
    public void setIdAlumno(String idAlumno) {
        this.idAlumno = idAlumno;
    }

    @Override
    public String toString() {
        return getNombre() + " " + getApellidos() + " - " + getEdad() + " - " + getIdAlumno();
    }
    
}
