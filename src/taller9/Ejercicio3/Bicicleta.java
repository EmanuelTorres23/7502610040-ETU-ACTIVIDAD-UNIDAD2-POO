package taller9.Ejercicio3;

// public class Bicicleta extends Vehiculo {
//
//     public Bicicleta(String tipo) {
//         super(tipo);
//     }
//
//     public void mostrarTipo() {
//         System.out.println(super.tipo); // Error aquí
//     }
// }
//
// Error de compilación (IntelliJ):
// "'tipo' has private access in 'Vehiculo'"
//
// ¿Por qué está mal?
// tipo es private en Vehiculo, así que solo el código de Vehiculo puede usarlo.
// Bicicleta hereda de Vehiculo, pero tipo no es visible desde la subclase.
// Escribir super.tipo no cambia nada: super no levanta la restricción de acceso.
// La forma correcta es pasar el valor con super(tipo), como hace el constructor,
// o crear en Vehiculo un método public o protected que devuelva tipo.