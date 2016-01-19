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
public class Operacion extends Nodo{
    private String variable;
    private String operacion;
    private String code ="";

    public Operacion() {
        variable = "";
        operacion = "";
    }
    
    public Operacion(String variable, String operacion) {
        this.variable = variable;
        this.operacion = operacion;
    }

    public String getVariable() {
        return variable;
    }

    public void setVariable(String variable) {
        this.variable = variable;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }
    
    public String generarCode(){
        code += this.getVariable() + " = " + this.getOperacion() + ";";
        return null;
        
    }
    
}
