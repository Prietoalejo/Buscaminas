/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd;
import java.util.Random;

/**
 *
 * @author guante
 */
public class Tablero {
    
    private ListaSimple nodos;
    private int filas;
    private int columnas; 
    private int numMinas;
    
    public Tablero(int filas, int columnas, int numMinas){
        this.filas = filas;
        this.columnas = columnas;
        this.numMinas = numMinas;
        nodos = new ListaSimple();
        
    }
    
    public void iniciarTablero(){
        for(int i = 0;i< filas; i++){
            for(int j = 0; j<columnas; j++){
                Nodo nodo = new Nodo();
                nodo.setId((char)('A'+j)+ Integer.toString(i+1));
                nodos.insertFinal(nodo);
            }
        }
        colocarMinas();
    }
    public void colocarMinas(){
        Random rand = new Random();
        int minasColocadas = 0;
        while(minasColocadas < numMinas){
            int fila = rand.nextInt(filas);
            int columna = rand.nextInt(columnas);
            Nodo nodo = obtenerNodoPorPosicion(fila, columna);
            if(!nodo.isMina()){
                nodo.setMina(true);
                minasColocadas++;
            }
            
        }
    }
    
    public Nodo obtenerNodoPorPosicion(int fila, int columna){
        int ind = fila * columnas +columna;
        Nodo nodo = nodos.getHead();
        for(int i = 0; i<ind; i++){
            nodo = nodo.getPnext();
        }
        return nodo;
    }
    
    public void agregarAdyacente(Nodo actual, int fila, int columna){
       if(fila >= 0 && fila<filas && columna >= 0 && columna <columnas){
           Nodo adyacente = obtenerNodoPorPosicion(fila, columna);
           if(adyacente != null){
               if(actual.getAdyacentes() == null){
                   actual.setAdyacentes(new ListaSimple());
               }
               actual.getAdyacentes().insertFinal(adyacente);
               System.out.println("Adyacente agregado: " + adyacente.getId() + " a " + actual.getId());
           }
       } 
    }
    
    public void conectarNodos(){
        Nodo nodo = nodos.getHead();
        for(int i = 0; i<filas; i++){
            for(int j = 0;j<columnas; j++){
                Nodo actual = obtenerNodoPorPosicion(i,j);
                System.out.println("Conectando adyacentes de: " + actual.getId());
                agregarAdyacente(actual,i-1,j);
                agregarAdyacente(actual,i+1,j);
                agregarAdyacente(actual,i,j-1);
                agregarAdyacente(actual,i,j+1);
                agregarAdyacente(actual,i-1,j-1);
                agregarAdyacente(actual,i-1,j+1);
                agregarAdyacente(actual,i+1,j-1);
                agregarAdyacente(actual,i+1,j+1);
            }
        }
    }
    
    
    
}
