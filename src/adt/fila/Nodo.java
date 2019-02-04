/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adt.fila;

/**
 *
 * @author HP
 */
public class Nodo {
    private Nodo siguiente;
    private Object dato;

    public Nodo(Object dato) {
        this.dato = dato;
        this.siguiente=null;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }
    
    
    
}
