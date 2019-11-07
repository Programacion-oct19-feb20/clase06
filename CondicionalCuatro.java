/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

/**
 *
 * @author reroes
 */
public class CondicionalCuatro {
    public static void main(String[] args) {
        boolean variableA = true;
        boolean variableB = false;
        boolean variableC = true;
        
        if (variableA & variableB | variableC){
            System.out.printf("Mensaje %s\n", "Autorizado");
        }
    }
}
