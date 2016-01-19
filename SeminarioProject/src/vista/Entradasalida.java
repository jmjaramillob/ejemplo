/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import javax.swing.JPanel;

/**
 *
 * @author victorprens
 */
public class Entradasalida extends Figura{
    boolean presionado = false;

    int [] vx = {1,21,99,79};
    int [] vy = {79,21,21,79};
    
    public Entradasalida( String nombre, String cadena){
        this.nombre = nombre;
        this.cadena = cadena;
    }
    
    public void paint(Graphics g){
        coordenadas();
        Graphics2D g2 = ( Graphics2D ) g; // convertir g a Graphics2D
        g2.setColor(Color.green);
        g2.setStroke(new BasicStroke(1));
        g2.draw(new Polygon(vx, vy, 4));
        
        if (presionado) {
            pintarBorde(g, x, y, ancho, alto);
        }
        pintarNombre(g, x, y, nombre);
    }
    
    public void coordenadas(){
        x = vx[0];
        y = vy[1];
        ancho = vx[2] - vx[0];
        alto = vy[3] - vy [1];
    }
}
