/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logica;

/**
 *
 * @author Estudiante
 */
public class Variable extends Nodo{
    private String variable;
    private String tipo;
    private String code;
    
    public Variable(){
        variable ="";
        tipo = "";
    }

    public Variable(String variable, String tipo) {
        this.variable = variable;
        this.tipo = tipo;
    }

    public String getVariable() {
        return variable;
    }

    public void setVariable(String variable) {
        this.variable = variable;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public String generarCode(){
        code+=this.getTipo() + " " + this.getVariable() + ";\n";
        return code;
    }
    
}
