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
import java.awt.geom.Ellipse2D;
import javax.swing.JPanel;

/**
 *
 * @author victorprens
 */
public class Decision extends Figura{
    boolean presionado = false;
    int [] vx = {1,50,99,50};
    int [] vy = {50,99,50,1};
    
    public Decision( String nombre, String cadena){
        this.nombre = nombre;
        this.cadena = cadena;
    }

    public void paint(Graphics g){
        coordenadas();
        Graphics2D g2 = ( Graphics2D ) g; // convertir g a Graphics2D
        g2.setColor(Color.blue);
        g2.setStroke(new BasicStroke(1));
        g2.draw(new Polygon(vx, vy, 4));

        if (presionado) {
            pintarBorde(g, x, y, ancho, alto);
        }
        pintarNombre(g, x, y, nombre);
    }
    
    public void coordenadas(){
        x = vx[0];
        y = vy[3];
        ancho = vx[2] - vx[0];
        alto = vy[1] - vy [3];
    }
    
}
