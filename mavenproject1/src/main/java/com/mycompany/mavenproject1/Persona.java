// Esta es la clase padre o superclase
public class Animal {
    String nombre;

    public void comer() {
        System.out.println(nombre + " está comiendo...");
    }
}
// La palabra "extends" hace la herencia
public class Perro extends Animal {
    String raza;

    public void ladrar() {
        System.out.println("¡Guau! El perro ladra.");
    }
}
public class Main {
    public static void main(String[] args) {
        // Creamos un objeto de la clase hija (Perro)
        Perro miPerro = new Perro();

        // Atributo y método heredados de Animal
        miPerro.nombre = "Firulais";
        miPerro.comer(); // Salida: Firulais está comiendo...

        // Atributo y método propios de Perro
        miPerro.raza = "Golden";
        miPerro.ladrar(); // Salida: ¡Guau! El perro ladra.
    }
}










package com.mycompany.mavenproject1;

public class Persona {
    
    String nombre;
    int edad;
    public void mostrarInformacion(){
        System.out.println("Nombre: " +nombre);
        System.out.println("Edad: " +edad);
    }           
}


