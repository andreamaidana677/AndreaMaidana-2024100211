
package com.unida.ejercicio5;

public class ejercicioproductomain{
    public static void main(String[] args){
        Producto producto1=new Producto();
        
        System.out.println("------Producto1(constructor predeterminado)------");
        producto1.mostrarInfo( );
        producto1.mostrarInfo(0.0);
        producto1.mostrarInfo(0);
        
        System.out.println( );
        Producto producto2 =new Producto("Mouse",25.50,10);
        System.out.println("-----Producto 2(constructor con parametros)----");
        producto2.mostrarInfo();
        producto2.mostrarInfo(0.0);    
        producto2.mostrarInfo(0);
    }
}
