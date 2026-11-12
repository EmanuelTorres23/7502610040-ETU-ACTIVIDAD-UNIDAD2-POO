package taller9.Ejercicio3;

// public class PruebaPlanta {
//     public static void main(String[] args) {
//         super.tipo = "Orquídea"; // Error aquí
//     }
// }
//
// Error de compilación (IntelliJ):
// "non-static variable super cannot be referenced from a static context"
//
// ¿Por qué está mal?
// super apunta a la parte heredada del objeto actual (this).
// main es static, así que no pertenece a ningún objeto: no hay this ni super.
// Además, PruebaPlanta no hereda de Planta, así que no existe una clase base
// de la que super pueda tomar el atributo tipo.