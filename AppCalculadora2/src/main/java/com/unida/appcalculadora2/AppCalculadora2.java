package com.unida.appcalculadora2;//los valores de package deben coincidir en la carpeta del import
//mi error en la tarea anterior fue declarar mal el nombre de los paquetes en los imports 

import static com.unida.appcalculadora2.Calculadora2.sumar;
import static com.unida.appcalculadora2.Calculadora2.restar;
import static com.unida.appcalculadora2.Calculadora2.mult;
import static com.unida.appcalculadora2.Calculadora2.div;
public class AppCalculadora2 {

    public static void main(String[] args) {
        //usar los metodos  estaticos sumando y restando
        int resultadoSuma=sumar(5,3);
        int resultadoResta=restar(5,3);
        int resultadoMult=mult(5,3);
        int resultadoDiv=div(5,3);
        //imprimir resultados
        System.out.println("Resultado de la suma: " +resultadoSuma);
        System.out.println("Resultado de la resta: " +resultadoResta);
        System.out.println("Resultado de la multiplicacion: " +resultadoMult);
        System.out.println("Resultado de la division: "  +resultadoDiv);
    }
}
