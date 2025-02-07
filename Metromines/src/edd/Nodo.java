/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd;

/**
 *
 * @author guante
 * Nodo que se usarata para el grafo del proyecto 
 * 
 */

public class Nodo {
    public boolean mina;
    public int pistas_proximidad;
    public boolean visitado;
    boolean marcado;
    public String id;
    public Nodo pnext;
    public ListaSimple adyacentes;

    public boolean isMina() {
        return mina;
    }
    
    public Nodo(){
        this.mina = false;
        this.pistas_proximidad = 0;
        this.visitado = false;
        this.marcado = false;
        this.id = "";
        this.adyacentes = null;
        this.pnext = null;
        
    
    }

    public Nodo(boolean mina, int pistas_proximidad, boolean visitado, boolean marca, String id, Nodo pnext, ListaSimple adyacentes) {
        this.mina = mina;
        this.pistas_proximidad = pistas_proximidad;
        this.visitado = visitado;
        this.marcado = marca;
        this.id = id;
        this.pnext = null;
        this.adyacentes = adyacentes;
    }

    public void setMina(boolean mina) {
        this.mina = mina;
    }

    public int getPistas_proximidad() {
        return pistas_proximidad;
    }

    public void setPistas_proximidad(int pistas_proximidad) {
        this.pistas_proximidad = pistas_proximidad;
    }

    public boolean isVisitados() {
        return visitado;
    }

    public void setVisitados(boolean visitados) {
        this.visitado = visitados;
    }

    public boolean isMarcado() {
        return marcado;
    }

    public void setMarcado(boolean marca) {
        this.marcado = marca;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Nodo getPnext() {
        return pnext;
    }

    public void setPnext(Nodo pnext) {
        this.pnext = pnext;
    }

    public ListaSimple getAdyacentes() {
        return adyacentes;
    }

    public void setAdyacentes(ListaSimple adyacentes) {
        this.adyacentes = adyacentes;
    }
    
    
    
    
    
}
