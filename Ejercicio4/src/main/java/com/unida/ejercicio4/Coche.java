package com.unida.ejercicio4;

public class Coche {
    //variables de instancia
    private String marca;
    private String modelo;
    private int año;
    //constructor predeterminado
    public Coche(){
        this.marca="Desconocida";
        this.modelo="Desconocida";
        this.año=2000;
    }
    
    //constructor con parametros
    public Coche(String marca, String modelo, int año){
        this.marca=marca;
        this.modelo=modelo;
        this.año=año;
    }
    
    //metodos set y get para marca 
    public void setMarca(String marca){
        this.marca=marca;
    }
    public String getMarca(){
        return this.marca;
    }
    //metodos de set y get para modelo 
    public void setModelo(String modelo){
        this.modelo=modelo;
    }
    public String getModelo(){
        return this.modelo;
    }
    //metodos set y get para anio
    public void setAño(int año){
        this.año=año;
    }    
    public int getAño(int año){
       return this.año=año;
    }
    //metodo para mostrarla informacion completa del coche
    public void mostrarInfo(){
        System.out.println("Marca" + marca +",Modelo: "+ modelo + "Año;" + año);
    }
    //sobrecarga del metodo para mostrar solo la marca
    public void mostrarInfo(String tipoInfo){
        if(tipoInfo.equals("marca")){
            System.out.println("Marca:" +marca);
        }
    }
}

    