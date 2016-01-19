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
public class Variables extends Nodo{
    private ArrayList<Variable> variables = new ArrayList<Variable>();
    private String code = "";
    

    public Variables(){
        
    }
    
    public Variables(ArrayList variables) {
        this.variables = variables;
        
    }

    public ArrayList<Variable> getVariables() {
        return variables;
    }

    public void setVariables(ArrayList<Variable> variables) {
        this.variables = variables;
    }
    
    //coge la lista de variables que estan y las devuelve como codigo cpp
    public String generarCode(){
        
        for(int i = 0; i<variables.size(); i++){
            code+=variables.get(i).generarCode();
        }
        return code;
    }
    
    
}
