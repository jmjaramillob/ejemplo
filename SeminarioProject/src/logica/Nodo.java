/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logica;

/**
 *
 * @author Estudiante
 */
class Nodo extends Figuras{
    protected Figuras fig;
    protected Nodo anterior;
    protected Nodo siguiente;

    public Nodo() {
        
    }
    
    public Nodo(Nodo anterior, Nodo siguiente) {
        this.anterior = anterior;
        this.siguiente = siguiente;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
