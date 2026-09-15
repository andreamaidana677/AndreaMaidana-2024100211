

package com.mycompany.mavenproject12examen;

public class main {

      public static void main(String[] args){
        Persona persona=new Persona();
        persona.setNombre("Juan");
        persona.setEdad(25);
        System.out.println("Nombre: "+ persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
    }
}
