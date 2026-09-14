
package com.unida.appcalculadora2;

public class Calculadora2 {
    //metodo statico para sumar 
    public static int sumar(int a,int b){
        return a + b;
    }    
    //metodo statico para restar
    public static int restar(int a,int b){
        return a - b;
    }//ambos metodos son public static esto es importante patra poder importarlos
    //con ststic import despues si no fueran estaticos el import statico fallaria
      public static int mult(int a, int b){
        return a * b;
    }

    public static int div(int a, int b){
        return a / b;
    }
}
