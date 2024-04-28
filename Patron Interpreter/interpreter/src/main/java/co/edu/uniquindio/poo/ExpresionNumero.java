package co.edu.uniquindio.poo;

import java.util.Map;

public class ExpresionNumero implements Expresion{

    private int numero;

    public ExpresionNumero(int numero) {
        this.numero = numero;
    }

    public int interpretar(Map<String, Integer> contexto) {
        return numero;
    }
    
}
