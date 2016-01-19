/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.regex.*;

/**
 *
 * @author BELTRAN
 */
public class Expresiones {
    private Pattern p;
    private Matcher m;

    public Expresiones() {
    }

    public Pattern getP() {
        return p;
    }

    public void setP(Pattern p) {
        this.p = p;
    }

    public Matcher getM() {
        return m;
    }

    public void setM(Matcher m) {
        this.m = m;
    }
    //verifica que la variable no tenga ningun caracter erroneo como mayusculas, numeros, etc
    public boolean verificarCadena(String cadena){
        p=Pattern.compile("[A-Z0-9!#$%&/]+");
        m=p.matcher(cadena);
        return m.find();
    }
    
    public boolean verificarParentesis(String cadena){
        p = Pattern.compile("^[(]");
        m = p.matcher(cadena);
        return m.find();
    }
    
    //Verifica si hay caracteres que no sean corectos en un leer
    public boolean verificarLeer(String cadena){
        p = Pattern.compile("[°!#$%&/()=?¡+*¨;:.]");
        m = p.matcher(cadena);
        return m.find();
    }
    
    //Verifica si las operaciones no tienen caracteres incorrectos
    public boolean verificarOperaciones(String cadena){
        p = Pattern.compile("[,.;:´¡?=/&%$#!°|]+");
        m = p.matcher(cadena);
        return m.find();
    }
    
    public String reemplazarComas(String cadena){
        p = Pattern.compile("[,]+");
        m = p.matcher(cadena);
        String resultado = m.replaceAll("");
        return resultado;
    }
    
}
