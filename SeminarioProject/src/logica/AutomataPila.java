/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author jorge
 */
public class AutomataPila {

    ArrayList<Character> pila;
    char[] i;
    int o = -1;
    int a;
    int p;

    public AutomataPila() {
        this.pila = new ArrayList();
    }

    public boolean pila1(String k) {

        boolean n = false;
        i = k.toCharArray();
        //Detecta si no comienza con parentesis cerrado
        if (i[0] != ')') {
            //Recorre la cadena para ver si encuentra un parentesis abierto, si lo encuentra agrega una x en la pila
            for (int u = 0; u < i.length; u++) {
                if (i[u] == '(') {
                    pila.add('x');
                    o = o + 1;
                }
            }
            //ya al haber encontrado un parentesis abierto, mira si despues hay uno cerrado y elimina la x de la pila
            for (int u = 0; u < i.length; u++) {

                if ((i[u] == ')') && (o != -1)) {
                    pila.remove(o);
                    o = o - 1;
                    if (o == -1) {
                        n = true;
                        JOptionPane.showMessageDialog(null, "perfecto");
                    }
                    //muestra el mensaje si hay un parentesis cerrado y ninguno abierto
                } else if ((i[u] == ')') && (o == -1)) {
                    JOptionPane.showMessageDialog(null, "Error en los parentesis");
                    n = false;
                }

            }
            //si la pila tiene a x tambien esta malo por que no se ceero el parentesis
            if (pila.isEmpty() == false) {
                JOptionPane.showMessageDialog(null, "Error en los parentesis");
                n = false;
            }
            //si entontro un parentesis cerrado de primero
        } else {
            JOptionPane.showMessageDialog(null, "Error en los parentesis");
            n = false;
        }

        return n;

    }

}
