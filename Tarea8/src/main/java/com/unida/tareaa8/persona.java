
package com.unida.tareaa8;

public class persona {
    protected String nombre;
    protected String cedula;
    protected String cel;
    protected String email;
    
    public persona(String nombre, String cedula,String cel, String email){
        this.nombre=nombre;
        this.cedula=cedula;
        this.cel=cel;
        this.email=email;
    }
    @Override
    public String toString(){
        return "Nombre:"+nombre +" |Cedula: "+ cedula+"|Cel:"+cel+" | Email:"+email;
    }
}
