/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.*;
import java.awt.geom.Rectangle2D;


/**
 *
 * @author victorprens
 */
public class Proceso extends Figura{
    boolean presionado = false;
    
    public Proceso( String nombre, String cadena){
        this.nombre = nombre;
        this.cadena = cadena;
    }
    
    
    public void paint(Graphics g){
                
        Graphics2D g2 = ( Graphics2D ) g; // convertir g a Graphics2D
        g2.setColor(Color.RED);
        g2.setStroke(new BasicStroke(1));
        g2.draw(new Rectangle2D.Double(x, y, ancho, alto));
        if (presionado) {
            pintarBorde(g, x, y, ancho, alto);
        }
       pintarNombre(g, x, y, nombre);
    }
    
}
