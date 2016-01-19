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
public class Asignacion extends Nodo {

    private ArrayList<String> vars = new ArrayList<String>();
    private String variable;
    private String code = "";

    public Asignacion() {
        variable = "";
    }

    public Asignacion(String variable) {
        this.variable = variable;
        this.vars.add(variable);
    }

    public String getVariable() {
        return variable;
    }

    public void setVariable(String variable) {
        this.variable = variable;
    }

    public ArrayList<String> getVars() {
        return vars;
    }

    public void setVars(ArrayList<String> vars) {
        this.vars = vars;
    }
    
    public String generarCode(){
        for (int i = 0; i < this.getVars().size(); i++) {
            code += "cin>>" + this.getVars().get(i) + ";\n";
        }
        return code;
    }

}
