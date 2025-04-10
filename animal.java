// Archivo: Animal.java
public class animal {
    protected String nombre;
    protected int edad;
    
    // Constructor
    public animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    // Método de la clase padre
    public void comer() {
        System.out.println(nombre + " esta comiendo.");
    }
    
    // Método para mostrar información
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " ");
    }
}