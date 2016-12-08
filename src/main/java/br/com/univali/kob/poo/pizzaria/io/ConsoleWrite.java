/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.univali.kob.poo.pizzaria.io;


/**
 *
 * @author luizhenrique
 */
public class ConsoleWrite {
    
    /**
     * imprime objeto sem quebra de linha no console
     * @param objeto  
     */
    public static void printSemQuebrarLinha(Object objeto){
        System.out.print(objeto.toString()+" ");
    }
    
    /**
     * imprime um objeto com quebra de linha no console
     * @param objeto  
     */
    public static void printComQuebraDeLinha(Object objeto){
        System.out.println(objeto.toString());
    }
    
    
    
}
