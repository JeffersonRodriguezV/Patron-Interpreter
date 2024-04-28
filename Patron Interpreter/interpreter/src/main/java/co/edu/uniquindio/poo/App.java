package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        // Crear el contexto con las variables
        Contexto contexto = new Contexto();
        contexto.asignarVariable("a", 5);
        contexto.asignarVariable("b", 10);

        // Crear la expresión (a + b) * 2
        Expresion expresion = new ExpresionSuma(new ExpresionNumero(5), new ExpresionNumero(10));

        // Evaluar la expresión
        int resultado = expresion.interpretar(contexto.obtenerVariables());
        System.out.println("El resultado es: " + resultado);
    }
}
