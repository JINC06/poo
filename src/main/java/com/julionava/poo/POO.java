/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.julionava.poo;

import abstraccion.Empleado;
import abstraccion.Salario;
import com.julionava.poo.clases.Alumno;
import herencia.Estudiante;
import herencia.Persona;
import herencia.Practicante;
import herencia.Profesor;
import polimorfismo.Animal;
import polimorfismo.Gato;
import polimorfismo.Overload;
import polimorfismo.Perro;

/**
 *
 * @author julio.nava
 */
public class POO {

    public static void main(String[] args) {
        System.out.println("-----------------------------------------------------");
        
        //Clases instancias objetos
        /*Alumno alumno = new Alumno();
        alumno.setIdEstudiante(92307);
        alumno.setNombre("Jose");
        alumno.setApellidoPaterno("Lopez");
        alumno.setApellidoMaterno("Alvarez");
        alumno.setCurp("JOLA0271095");
        System.out.println(alumno.getNombreCompleto());*/
        
        
        System.out.println("-----------------------------------------------------");
        
        //Abstraccion
        /*Empleado empleado = new Empleado("Martin Miranda", "M. Sosa", 333);
        System.out.println("LLamada a chequeCorreo usando la referencia de la clase Empleado --");
        empleado.chequeCorreo();*/
        
        /*Empleado empleado = new Salario("Martin Miranda", "M. Sosa", 333, 100000);
        Salario salario = new Salario("Enzo Tortore", "Gral Paz", 777, 90000);
        System.out.println("LLamada a chequeCorreo usando la referencia de la clase Empleado --");
        empleado.chequeCorreo();
        System.out.println("Llamada a chequeCorreo usando la referencia de la clase Salario --");
        salario.chequeCorreo();*/
        
        
        System.out.println("-----------------------------------------------------");
        
        /*Persona persona = new Persona("Julio", "Persona", 25);
        Profesor profesor = new Profesor("Julio", "Profesor", 23);
        profesor.setIdProfesor("92307");
        System.out.println(profesor.toString());
        Estudiante estudiante = new Estudiante("Julio", "Estudiante", 24);
        estudiante.setIdAlumno("112233");
        System.out.println(estudiante.toString());
        Practicante practicante = new Practicante("Julio", "Practicante", 22);
        practicante.setIdAlumno("445566");
        practicante.setIdPracticante("778899");
        System.out.println(practicante.toString());
        
        personaToString(profesor);
        personaToString(estudiante);
        personaToString(practicante);*/
        
        System.out.println("-----------------------------------------------------");
        
        /*
        //Polimorfismo diferentes formas
        Animal perro = new Perro();
        Animal gato = new Gato();
        
        perro.hacerSonido();
        gato.hacerSonido();*/
        
        
        System.out.println("-----------------------------------------------------");
        
        //Sobrecarga
        Overload overload = new Overload();
        double result;
        overload.demo(10);
        overload.demo(10, 20);
        result = overload.demo(5.5);
        System.out.println("O/P: " + result);
        //Sobreescritura
        
    }
    
    public static void personaToString(Persona p) {
        if(p instanceof Profesor){
            System.out.println(((Profesor)p).toString());
        } else if(p instanceof Estudiante){
            System.out.println(((Estudiante)p).toString());
        } else if(p instanceof Practicante) {
            System.out.println(((Practicante)p).toString());
        }
    }
    
}
