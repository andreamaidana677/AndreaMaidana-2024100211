

package com.unida.tareaa8;

public class estudiante extends persona{
    private final String matricula;
    private final String carrera;
    private final String materia;
    
    public estudiante(String nombre,String matricula,String cedula,String carrera, String cel,String email,String materia){
        super(nombre,cedula,cel,email);//llama al constructor Persona
        this.matricula=matricula;
        this.carrera=carrera;
        this.materia=materia;
    }
    @Override
    public String toString(){
        return super.toString() +"| Matricula: "+ matricula +"| carrera: "+ carrera +" Materia:"+ materia;
    }
    public static void main(String[] args){
        estudiante e= new estudiante("Derlis","2010100521","2026-10-27","Informatica","0981","d@gmail.com","500-1");
        System.out.println(e);
    }
}
