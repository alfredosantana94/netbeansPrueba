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
public class FILA {
    private Nodo frente;
    private Nodo finale;
    private int cantidad=0;

    public FILA() {
    }
    
    public void filavacia(){
        frente = null;
        finale = null;
        cantidad=0;
    }
    
    public boolean esfilavacia(){
        return (frente==null);
//        if(cantidad==0){
//            return true;
//        }
//        return false;
    }
    
    public Nodo frente() {
            return this.frente;
    }
    
    public void enfila(Object o) {
        Nodo aux = new Nodo(o);
        aux.setSiguiente(null);
        if (!this.esfilavacia()) {
            this.finale.setSiguiente(aux);
            this.finale=this.finale.getSiguiente();
        } else {
            this.frente = aux;
            this.finale = aux;
        }
        cantidad++;
    }
    
    public void defila() {
        if (!this.esfilavacia()) {
            if (this.frente.getSiguiente() != null) {
                this.frente = this.frente.getSiguiente();
            } else {
                this.frente = null;
                this.finale = null;
            }
            cantidad--;
        }
    }
    
    public Nodo ultimo(){
        return this.finale;
    }
    
    public int cantidad(){
        return this.cantidad;
    }
    
    public Nodo ultimodato(){
        return this.ultimo();
    }
    
    public void mostrar(){
        Nodo aux;
        aux=this.frente;
        while(aux!=null){
            System.out.println(aux.getDato());
            aux=aux.getSiguiente();
        }
    }
    public boolean pertenece(Object dato){
        FILA aux = new FILA();
        aux.filavacia();
        while(!this.esfilavacia()){
            aux.enfila(this.frente());
            System.out.println("asdasdasdasd");
            this.defila();
        }
        while(!aux.esfilavacia()){
            this.enfila(aux.frente());
            aux.defila();
        }
        while(!aux.esfilavacia()){
            if(aux.frente().equals(dato)){
                return true;
            }
        }
        return false;
    }
}
