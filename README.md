# Ej-Herencia
# javac *.java 
# java EjemploHerencia

Este ejemplo demuestra los siguientes conceptos de herencia en Java:

Clase padre (Animal): Define atributos básicos (nombre, edad) y métodos (comer, mostrarInfo) que heredarán las subclases.
Clase hija (Perro): Extiende la clase Animal usando la palabra clave extends, heredando todos sus atributos y métodos.
Constructor con super(): La subclase llama al constructor de la clase padre con super(nombre, edad).
Sobrescritura de métodos: El método mostrarInfo() se sobrescribe en la clase hija con @Override, añadiendo funcionalidad mientras mantiene la del padre con super.mostrarInfo().
Métodos adicionales: La clase hija puede tener sus propios métodos, como ladrar().
