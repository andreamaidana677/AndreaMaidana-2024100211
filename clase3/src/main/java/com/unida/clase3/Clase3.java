package com.unida.clase3;

/**
 *
 * @author andre
 */
//aca cree el obejto y asigne valores  ya en la clase 3
public class Clase3 {
    public static void main(String[] args){
        //cree un objeto de la clase Persona
        Persona persona1 =new Persona();
        //asigne valores ya a mis variables de instancia
        persona1.nombre="Juan";
        persona1.apellido="Gomez";
        persona1.edad=22;
        persona1.ci="4567890";
        persona1.direccion="av. mariscal lopez 123";
        // y aca ya imprimi los valores usando mi objeto
        System.out.println("Nombre: "+ persona1.nombre);
        System.out.println("Apellido: "+persona1.apellido);
        System.out.println("Edada: "+persona1.edad);
        System.out.println("CI: "+persona1.ci);
        System.out.println("Direccion: "+persona1.direccion);
    }
    
}
