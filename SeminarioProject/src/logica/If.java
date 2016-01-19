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
public class If extends Nodo{
    private String condicion1;
    private String condicion2;
    private String operador;
    private String code = "";

    public If(String condicion1, String condicion2) {
        this.condicion1 = condicion1;
        this.condicion2 = condicion2;
    }

    public If() {
        condicion1 = "";
        condicion2 = "";
    }

    public String getCondicion1() {
        return condicion1;
    }

    public void setCondicion1(String condicion1) {
        this.condicion1 = condicion1;
    }

    public String getCondicion2() {
        return condicion2;
    }

    public void setCondicion2(String condicion2) {
        this.condicion2 = condicion2;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }
    
    
    
    public String generarCode(){
        code += "if("+condicion1+operador+condicion2+"){";
        
        code+="}";
        
        return code;
    }
    
    
    
    
}
