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
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;

/**
 *
 * @author victorprens
 */
public class Terminal extends Figura{
    boolean presionado = false;
    
    public Terminal( String nombre, String cadena){
        this.nombre = nombre;
        this.cadena = cadena;
        ancho = ancho + 50;
    }
        
    public void paint(Graphics g){
        
        Graphics2D g2 = ( Graphics2D ) g; // convertir g a Graphics2D
        g2.setColor(Color.blue);
        g2.setStroke(new BasicStroke(1));
        g2.draw(new Ellipse2D.Float(x, y, ancho, alto));
        if (presionado) {
            pintarBorde(g, x, y, ancho, alto);
        }
        
        pintarNombre(g, x, y, nombre);
        
    }
}
