package taller9.Ejercicio1;

public class PruebaEmpleado {
    public static void main(String[] args) {
        Persona persona = new Persona("Laura Ramírez", 30);
        Empleado empleado = new Empleado("Carlos Pérez", 35, "Ventas");

        System.out.println("--- Persona ---");
        persona.mostrarDetalles();
        System.out.println("--- Empleado ---");
        empleado.mostrarDetalles();
    }
}