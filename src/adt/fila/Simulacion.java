/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adt.fila;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author HP
 */
public class Simulacion {
        
    public static boolean Listo(Float r,Float prob){
        return (0 <=r && r<=prob);
    }
    public static void main(String[] args){
        
//<editor-fold desc="Variables">
        int num=0;
        FILA ad = new FILA();
        FILA f = new FILA();
        FILA ta = new FILA();
        List<Integer> l = new ArrayList<>();
        int reloj=0;
        int tpista=0;
        int tlimite=100;
        int td=10;
        float pl=0.5f;
        int tmed=0;
        ad.filavacia();
        f.filavacia();
        ta.filavacia();
        int i =1;
        int aux;
        Random rd = new Random();
//</editor-fold>

//<editor-fold desc="Simulacion">
        while (reloj <= tlimite ) {
            if (Listo(rd.nextFloat(), pl)) {
                f.enfila(reloj);
            }
            if (tpista == 0  && reloj+td<=tlimite ) {
                if(!f.esfilavacia()){
                ad.enfila("Avion " + i);
                ta.enfila(reloj-(Integer)f.frente().getDato());
                f.defila();
                tpista = td;
                num++;
                i++;
                }
            } else {
                tpista--;
            }
            reloj++;
        }
//</editor-fold>

//<editor-fold desc="Resultados">
        System.out.println("Numero de aviones: "+num);
        while(!ad.esfilavacia()){
            System.out.println(ad.frente().getDato()+" Tiempo de espera: "+ta.frente().getDato()+" LLegada: "+f.frente().getDato());
            ad.defila();
            f.defila();
            tmed=tmed+(Integer)ta.frente().getDato();
            ta.defila();
        }
        System.out.println(((float)tmed)/((float)num));
    }
//</editor-fold>
}
