
package com.mycompany.proyecto1_herencia;

public class Estudiante extends Persona{
    private String carrera;
    public Estudiante(String nombre,String carrera){
                super(nombre);
        this.carrera=carrera;
    }
    public void mostrarDatos(){System.out.println("Estudiante: "+ nombre +"| carrera:"+ carrera);}
        
}

