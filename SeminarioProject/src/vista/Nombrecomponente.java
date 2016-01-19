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
import java.awt.geom.Rectangle2D;

/**
 *
 * @author victorprens
 */
public class Nombrecomponente extends Figura {
    String cad;
    
    
    public Nombrecomponente(String cadena, int x, int y){
        this.cad = cadena;
        this.x = x;
        this.y = y;
        this.referenciax = x + ancho/2;
        this.referenciay = y + alto/2;
    }
    
    public void paint(Graphics g){
        Graphics2D g2 = ( Graphics2D ) g;
            g2.setColor(Color.black);
            g2.drawString(cad, referenciax, referenciay);
    }

    public String getCad() {
        return cad;
    }

    public void setCad(String cad) {
        this.cad = cad;
    }
    
    
    
}
