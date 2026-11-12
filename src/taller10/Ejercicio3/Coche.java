package taller10.Ejercicio3;

// public class Coche extends Vehiculo {
//     @Override
//     public void acelerar() {
//         System.out.println("El coche acelera.");
//     }
// }
//
// Error de compilación (IntelliJ):
// "Method does not override method from its superclass"
//
// ¿Por qué está mal?
// Vehiculo tiene acelerar(int velocidad), pero Coche escribe acelerar() sin
// parámetros. Es otra firma, así que no sobrescribe nada.
// @Override obliga al compilador a verificar que la clase base tenga un método
// con la misma firma. Como no la tiene, marca error.
// Sin @Override el código compilaría, pero Coche tendría dos métodos acelerar:
// el heredado (con int) y el propio (sin parámetros). Eso es sobrecarga,
// y el método de Vehiculo nunca se reemplaza.