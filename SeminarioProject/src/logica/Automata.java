/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Automata {

    private char[] cad;
    private int o = -1;
    private ArrayList<String> variables;

    public Automata() {
        this.variables = new ArrayList<>();
    }

    public char[] getCad() {
        return cad;
    }

    public void setCad(char[] cad) {
        this.cad = cad;
    }

    public int getO() {
        return o;
    }

    public void setO(int o) {
        this.o = o;
    }

    public ArrayList<String> getVariables() {
        return variables;
    }

    public void setVariables(ArrayList<String> variables) {
        this.variables = variables;
    }

    //saca ñas variables de una cadena de leer por ejem: a,b,c,d deberia sacar un arraylist de las variables
    public ArrayList verificarVariables(String cadena) {
        boolean n = false;
        cad = cadena.toCharArray();
        String variable = "";
        int coma = 0;
        if (cad[0] == ',') {
            return null;
        } else {
            for (int i = 0; i < cad.length; i++) {
                if (cad[i] == ',') {
                    if (cad[i + 1] != ','){
                        for (int j = coma; j < i; j++) {
                            variable += cad[j];
                            System.out.println(cad[j]);
                        }
                        coma = i+1;
                        variables.add(variable);
                        variable = "";
                    }
                } else{
                    
                }
                    
            }
            if(cad[cad.length-1]!=','){
                    for (int j = coma; j < cad.length; j++) {
                        variable += cad[j];
                    }
                    variables.add(variable);
                    variable = "";
                }
        }
        return variables;
    }
}
