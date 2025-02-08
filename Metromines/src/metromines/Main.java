/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metromines;

/**
 *
 * @author Alejandro
 */

import edd.Tablero;
import edd.Nodo;
import edd.ListaSimple;

public class Main {
        public static void main(String[] args) {
        // Crear un tablero de prueba
        Tablero tablero = new Tablero(5, 5, 5);
        tablero.iniciarTablero();

        // Mostrar el estado inicial del tablero
        Nodo nodo = tablero.obtenerNodoPorPosicion(0, 0);
        while (nodo != null) {
            System.out.println("Nodo " + nodo.getId() + " - Mina: " + nodo.isMina());
            nodo = nodo.getPnext();
        }

        // Probar la conectividad de las adyacencias
        Nodo nodoCentral = tablero.obtenerNodoPorPosicion(2, 2);
        System.out.println("Nodo central: " + nodoCentral.getId());
        if (nodoCentral.getAdyacentes() != null) {
            Nodo adyacente = nodoCentral.getAdyacentes().getHead();
            while (adyacente != null) {
                System.out.println("Adyacente a " + nodoCentral.getId() + ": " + adyacente.getId());
                adyacente = adyacente.getPnext();
            }
        } else {
            System.out.println("El nodo central no tiene adyacentes.");
        }
    }

}
