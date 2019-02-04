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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FILA f = new FILA();
        f.filavacia();
        System.out.println("Lista 1\n");
        System.out.println("Vacia? : "+f.esfilavacia());
        f.enfila("Hola");
        f.enfila("Estoy");
        f.enfila("En");
        f.enfila("La");
        f.enfila("Fila");
        System.out.println("frente : "+f.frente().getDato());
        System.out.println("final : "+f.ultimodato().getDato());
        f.mostrar();
        System.out.println("Vacia? : "+f.esfilavacia());
        System.out.println("cantidad? : "+f.cantidad());
//        while(!f.esvacia(f)){
//        f = f.defilar(f);
//        }
//        System.out.println("Vacia? : "+f.esvacia(f));
        System.out.println("Lista 2\n");
        FILA f2 = new FILA();
        f2.filavacia();
        System.out.println("Vacia? : "+f2.esfilavacia());
        f2.enfila("La");
        f2.enfila("Fila");
        f2.enfila("Sigue");
        f2.mostrar();
        System.out.println("Vacia? : "+f2.esfilavacia());
        System.out.println("cantidad 2? : "+f2.cantidad());
        System.out.println("Union de ambas filas");
        f = union(f,f2);
        f.mostrar();
        System.out.println("cantidad? : "+f.cantidad());
        System.out.println(f2.pertenece(new String("Hola")));
    }
    public static FILA union(FILA fila1, FILA fila2){
        Nodo aux;
        aux = fila2.frente();
        if(!fila2.esfilavacia()){
        while(aux!=null){
            fila1.enfila(aux.getDato());
            aux=aux.getSiguiente();
        }
        }
        return fila1;
    }
}
