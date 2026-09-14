
package com.unida.ejercicio4;

public class Ejercicio4 {
    //cree el objeto de coche usando el constructor sin argumentos
    public static void main(String[] args) {
       Coche coche1=new Coche();
       coche1.mostrarInfo();//mostrar informacion completo
       coche1.mostrarInfo("marca");//mostrar solo la marca
    
    //crear un objeto de coche usando el constructor con parametros
    Coche coche2 =new Coche("Toyota","Corolla",2021);
    coche2.mostrarInfo(); //mostrar informacion completa
    coche2.mostrarInfo("marca");//mostrar solo marca
    }       
}
