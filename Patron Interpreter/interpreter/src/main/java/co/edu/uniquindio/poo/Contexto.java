package co.edu.uniquindio.poo;

import java.util.HashMap;
import java.util.Map;

public class Contexto {

    private Map<String, Integer> variables;

    public Contexto() {
        variables = new HashMap<>();
    }

    public void asignarVariable(String variable, int valor) {
        variables.put(variable, valor);
    }

    public int obtenerValorVariable(String variable) {
        return variables.get(variable);
    }

    public Map<String, Integer> obtenerVariables() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obtenerVariables'");
    }
    
}
