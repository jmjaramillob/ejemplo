/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Archivo {

    String codigo = "";
    ArrayList<Variable> variables = new ArrayList();
    ArrayList<Imprimir> imprimir = new ArrayList();
    ArrayList<Asignacion> asignacion = new ArrayList();
    ArrayList<Operacion> operacion = new ArrayList();
    private int tamDiagrama;

    public Archivo(String codigo) {
        this.codigo = codigo;
    }

    public Archivo() {
        codigo = "";
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public ArrayList getVariables() {
        return variables;
    }

    public void setVariables(ArrayList Variables) {
        this.variables = Variables;
    }

    public ArrayList getImprimir() {
        return imprimir;
    }

    public void setImprimir(ArrayList Imprimir) {
        this.imprimir = Imprimir;
    }

    public ArrayList getAsignacion() {
        return asignacion;
    }

    public void setAsignacion(ArrayList Asignacion) {
        this.asignacion = Asignacion;
    }

    public ArrayList getOperacion() {
        return operacion;
    }

    public void setOperacion(ArrayList Operacion) {
        this.operacion = Operacion;
    }

    public int getTamDiagrama() {
        return tamDiagrama;
    }

    public void setTamDiagrama(int tamDiagrama) {
        this.tamDiagrama = tamDiagrama;
    }

    public void generarCodigo() {
        codigo = "#include<iostream>\n"
                + "#include<stdlib.h>\n\n"
                + "using namespace std;\n\n"
                + "int main(){\n";
        for (int i = 1; i <= tamDiagrama; i++) {
            for (int j = 0; j < variables.size(); j++) {
                if (variables.get(j).getPosicion()==i) {
                    codigo+=variables.get(j).generarCode();
                }
            }
            for (int j = 0; j < imprimir.size(); j++) {
                if (imprimir.get(j).getPosicion()==i) {
                    codigo+=imprimir.get(j).generarCode();
                }
            }
            for (int j = 0; j < operacion.size(); j++) {
                if (operacion.get(j).getPosicion()==i) {
                    codigo+=operacion.get(j).generarCode();
                }
            }
            for (int j = 0; j < asignacion.size(); j++) {
                if (asignacion.get(j).getPosicion()==i) {
                    codigo+=asignacion.get(j).generarCode();
                }
            }
        }
        codigo += "}";
    }

    public void guardarArchivo() {
        this.generarCodigo();
        FileWriter fichero = null;
        PrintWriter pw = null;
        try {
            fichero = new FileWriter("c:/prueba.cpp");
            pw = new PrintWriter(fichero);

            pw.println(codigo);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
           // Nuevamente aprovechamos el finally para 
                // asegurarnos que se cierra el fichero.
                if (null != fichero) {
                    fichero.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
