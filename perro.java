// Archivo: Perro.java
public class perro extends animal {
    private String raza;
    
    // Constructor de la subclase
    public perro(String nombre, int edad, String raza) {
        // Llamada al constructor de la clase padre
        super(nombre, edad);
        this.raza = raza;
    }
    
    // Método propio de la clase Perro
    public void ladrar() {
        System.out.println(nombre + " dice: Guau, guau");
    }
    
    // Sobrescritura del método mostrarInfo de la clase padre
    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); // Llamamos al método de la clase padre
        System.out.println("Raza: " + raza);
    }
}