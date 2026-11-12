package taller10.Ejercicio1;

public class PruebaPersonas {
    public static void main(String[] args) {
        Persona[] personas = {
                new Persona(),
                new Estudiante(),
                new Profesor()
        };

        for (Persona persona : personas) {
            persona.presentarse();
        }
    }
}