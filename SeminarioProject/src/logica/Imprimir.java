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
public class Imprimir extends Nodo{
    private String texto;
    private String respuesta;
    private String code = "";

    public Imprimir(){
        texto = "";
        respuesta = "";
    }
    
    public Imprimir(String texto, String respuesta) {
        this.texto = texto;
        this.respuesta = respuesta;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }
    
    public String generarCode(){
        code += "cout<<" + this.getTexto() + ";";
        return code;
    }
}
