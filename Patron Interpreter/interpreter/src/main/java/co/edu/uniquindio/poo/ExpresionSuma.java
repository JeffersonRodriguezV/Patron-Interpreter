package co.edu.uniquindio.poo;

import java.util.Map;

public class ExpresionSuma implements Expresion {

    private Expresion expresion1;
    private Expresion expresion2;

    public ExpresionSuma(Expresion expresion1, Expresion expresion2) {
        this.expresion1 = expresion1;
        this.expresion2 = expresion2;
    }

    public int interpretar(Map<String, Integer> contexto) {
        return expresion1.interpretar(contexto) + expresion2.interpretar(contexto);
    }
    
}
