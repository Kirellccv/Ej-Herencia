// Archivo: EjemploHerencia.java
public class EjemploHerencia {
    public static void main(String[] args) {
        System.out.println("=== EJEMPLO DE HERENCIA EN JAVA ===");
        
        // Crear un objeto de la clase padre
        animal animal = new animal("Animal Generico", 5);
        System.out.println("\nInformacion del Animal:");
        animal.mostrarInfo();
        animal.comer();
        
        System.out.println("\n-----------------------");
        
        // Crear un objeto de la clase hija
        perro perro = new perro("Firulais", 3, "Labrador");
        System.out.println("\nInformacion del Perro:");
        perro.mostrarInfo(); // Método sobrescrito
        perro.comer();       // Método heredado
        perro.ladrar();      // Método propio
    }
}
