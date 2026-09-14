package com.unida.ejercicio5;

public class Producto {
        //variables de instancia
        private String nombre;
        private double precio;
        private int stock;
        //constructor predeterminado;
        
        public Producto(){
            this.nombre ="Producto sin nombre";
            this.precio=0.0;
            this.stock=0;    
        }
        
        //constructor con parametros
        public Producto(String nombre,double precio,int stock){
            this.nombre=nombre;
            this.precio=precio;
            this.stock=stock;
        }
        //metodos set y get para precio
        public void setPrecio(double precio){
            this.precio=precio;
        }
        public double getPrecio(){
            return this.precio;
        }
        //metodos set y get para stock
        public void setStock(int stock){
            this.stock=stock;
        }
        
        public int getStock(){
            return this.stock;
        }
        //metodo para mostrar toda la informacion
        public void mostrarInfo(){
            System.out.println("Nombre:" + this.nombre);
            System.out.println("Precio:" + this.precio);
            System.out.println("Stock:" + this.stock);
        }
        
        //sobrecarga muestra solo el precio
        public void mostrarInfo(double precio){
            System.out.println("Precio: "+ this.precio);
        }        
        
        public void mostrarInfo(int Stock){
            System.out.println("Stock: " + this.stock);
        }
        //sobrecargamuestrasolo el dato pedido en este caso solo muestre solo el precio o solo el stock segun como elijas
}
