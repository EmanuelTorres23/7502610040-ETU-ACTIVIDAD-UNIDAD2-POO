package taller10.Ejercicio3;

// public class Gato extends Animal {
//     public void hacerSonido() {
//         System.out.println("El gato maúlla.");
//     }
// }
//
// Esto compila sin errores, pero es mala práctica.
//
// ¿Por qué está mal?
// Gato sí sobrescribe hacerSonido(), pero no tiene @Override.
// Si alguien cambia el nombre del método en Animal (por ejemplo, a emitirSonido()),
// Gato seguiría compilando sin avisar. Su hacerSonido() quedaría como un método
// nuevo, y el programa usaría el de Animal sin que nadie lo note.
// Con @Override, el compilador marcaría el error en el momento del cambio.