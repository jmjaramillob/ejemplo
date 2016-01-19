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
public class Borde extends Figura{
    
    int anchointerno;
    int anchoexterno;
    int altointerno;
    int altoexterno;
    int grosor;
    
    public Borde(int x, int y, int ancho, int alto){
        this.x = x;
        this.y = y;
        this.ancho = ancho;
        this.alto = alto;
        this.grosor = 5;
        anchointerno = x + ancho - 2 * grosor;
        anchoexterno = x + ancho;
        altointerno = y + alto - 2 *grosor;
        altoexterno = y + alto;
        
    }
    
    public void paint(Graphics g){
        float punteo[] = {20.0f,15.0f};
            Graphics2D g2 = ( Graphics2D ) g;
            g2.setColor(Color.black);
            g2.setStroke(new BasicStroke(3, BasicStroke.CAP_SQUARE, BasicStroke.JOIN_MITER, 5.0f, punteo, 10.f));
            g2.draw(new Rectangle2D.Double(x - 5, y - 5, ancho + 10, alto + 10));
            
    }
}
