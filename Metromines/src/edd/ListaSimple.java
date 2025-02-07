/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd;

/**
 *
 * @author Alejandro
 * Estrutura de la lista simple para implementar en el Grafo
 */
public class ListaSimple { 
    public Nodo head;
    public int size;
    
    public ListaSimple(){
        head = null;
        size = 0;
    }

    public Nodo getHead() {
        return head;
    }

    public void setHead(Nodo head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    public boolean isEmpty(){
        return this.head == null;
    }
    
    /*
    Metodo InsertBegin introduce el nodo que recibe por parametro 
    al inicio de la lista con la que se va a trabajar
    */
    public void insertBegin(Nodo nodo){
        Nodo temp = nodo;
        if(isEmpty()){
            this.head = temp;
        }
        else{
            Nodo aux = head;
            temp.pnext= aux;
            this.head = temp;
        }
        size ++;    
        
    }
    
    /*
    Metod insertFinal agrega un nodo al final de la lista de adyacencia 
    utilizada en este proyecto
    */
    public void insertFinal(Nodo nodo){
        if(isEmpty()){
            insertBegin(nodo);
        }
        else{
            Nodo aux = this.head;
            while(aux.pnext != null){
                aux = aux.pnext;
            }
            aux.pnext = nodo;
        }
        size ++; 
    }
    
}
