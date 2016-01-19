/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import logica.Figuras;

/**
 *
 * @author BELTRAN
 */
public class Diagrama extends javax.swing.JPanel {

    private String tipo = "";
    private int posicion = 0;
    private boolean borde = false;
    private ArrayList<Object> objetos = new ArrayList();
    private String accion = "", nombre, expresion;
    private Conector c = null;
    private Decision d = null;
    private Entradasalida es = null; 
    private Proceso p = null;
    private Terminal t = null;
    private Object objeto;
    /**
     * Creates new form Diagrama
     */
    public Diagrama() {
        initComponents();

    }

    
    
    @Override
    public void paint(Graphics g){
        iniciar(g);
        
        if(accion.equals("crear")){
            crear(g);
        }
        else if(accion.equals("mover")){
            moverocambiartamaño(g);
        }
        else if(accion.equals("borde")){
            borde(g);
        } 
        else if(accion.equals("tamaño")){
            moverocambiartamaño(g);
        }
    }
    
    public void iniciar(Graphics g){
            super.paint(g);
            for (int i = 0; i < objetos.size(); i++) {
            String nombreClase = objetos.get(i).getClass().getName();
            convierteObjeto(nombreClase, objetos.get(i));
            repintar(g);
            }
    }
    
    public void crear(Graphics g){
        switch(tipo){
            case "proceso":
                Proceso p = new Proceso(nombre, expresion);
                objetos.add(p);
                p.paint(g);
                break;
            case "decision":
                Decision d = new Decision(nombre, expresion);
                objetos.add(d);
                d.paint(g);
                break;    
            case "terminal":
                Terminal t = new Terminal(nombre, expresion);
                objetos.add(t);
                t.paint(g);
                break;
            case "es":
                Entradasalida es = new Entradasalida(nombre, expresion);
                objetos.add(es);
                es.paint(g);
                break;
            case "conector":
                Conector c = new Conector(nombre, expresion);
                objetos.add(c);
                c.paint(g);
                break;
            /*case "linea":
                Linea l = new Linea();
                objetos.add(l);
                l.paint(g);
                break;*/
            default:
                break;
            }
    }

    public void moverocambiartamaño(Graphics g){
        switch(tipo){
            case "proceso":
                Proceso p = (Proceso) objeto;
                p.paint(g);
                break;
            case "decision":
                Decision d = (Decision) objeto;
                d.paint(g);
                break;    
            case "terminal":
                Terminal t = (Terminal) objeto;
                t.paint(g);
                break;
            case "es":
                Entradasalida es = (Entradasalida) objeto;
                es.paint(g);
                break;
            case "conector":
                Conector c = (Conector) objeto;
                c.paint(g);
                break;
            default:
                break;
            }
        nulificador();
    }
    
    public void repintar(Graphics g){
        
        if(c!=null){
            c.presionado = borde;
            c.paint(g);
        } 
        else if(d!=null){
            d.presionado = borde;
            d.paint(g);
        }
        else if(es!=null){
            es.presionado = borde;
            es.paint(g);
        }
        else if(p!=null){
            p.presionado = borde;
            p.paint(g);
        }
        else if(t!=null){
            t.presionado = borde;
            t.paint(g);
        }
        nulificador();
    }
    
    public void borde(Graphics g){
            bordeInicial(g);
            String nombreClase = objeto.getClass().getName();
            convierteObjeto(nombreClase, objeto);
            borde = true;
            repintar(g);
    }
    
    private void convierteObjeto(String nombre,Object o){
        switch (nombre) {
            case "vista.Conector":
                 c = (Conector) o;
                break;
                
            case "vista.Decision":
                d = (Decision) o;
                break;
                
            case "vista.Entradasalida":
                es = (Entradasalida) o;
                break;
                
            case "vista.Proceso":
                p = (Proceso) o;
                break;
                
            case "vista.Terminal":
                t = (Terminal) o;
                break;    
            default:
                throw new AssertionError();
        }
        
    }
    
    public void nulificador(){
        p = null;
        c = null;
        d = null;
        es = null;
        t = null;
    }
    
    public void bordeInicial(Graphics g){
        for (int i = 0; i < objetos.size(); i++) {
                if (i!=posicion) {
                    String nombreClase = objetos.get(i).getClass().getName();
                    convierteObjeto(nombreClase, objetos.get(i));
                    borde = false;
                    repintar(g);
                }
        }
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Object> getObjetos() {
        return objetos;
    }
    
    public void setObjetos(ArrayList<Object> objetos) {
        this.objetos = objetos;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public Object getObjeto() {
        return objeto;
    }

    public void setObjeto(Object objeto) {
        this.objeto = objeto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getExpresion() {
        return expresion;
    }

    public void setExpresion(String expresion) {
        this.expresion = expresion;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
