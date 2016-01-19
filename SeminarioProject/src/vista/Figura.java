/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 * @author victorprens
 */
public abstract class Figura {
    public int x = 50;
    public int y = 50;
    public int ancho = 50;
    public int alto = 50;
    public int referenciax = x + ancho/2;
    public int referenciay = y + alto/2;
    public ArrayList<Integer> relaciones = new ArrayList();
    Borde borde;
    Nombrecomponente nombrecomponente;
    public String cadena;
    public String nombre;
    public String tipo;

    public Figura() {
    }
    
    public void cambiarTamaño(int ancho, int alto){
        this.ancho = ancho;
        this.alto = alto;
    };
    public void mover(int x, int y){
        this.x = x;
        this.y = y;
    };
    
    public void pintarBorde(Graphics g, int x, int y, int ancho, int alto){
        borde = new Borde(x,y, ancho, alto);
        borde.paint(g);
    }
    
    public void pintarNombre(Graphics g, int x, int y, String nombre){
        this.nombre = nombre;
        
        nombrecomponente = new Nombrecomponente(nombre, x , y);
        nombrecomponente.paint(g);
    }
    
}
