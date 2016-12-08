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
public class StringHelper {
    
    /**
     * divide uma frase em palavras com passe na string passada como parametro
     * @param linha
     * @param divisor
     * @return vetor de String
     */
    public static String[] divideAFraseEmPalavras(String linha, String divisor){
       return linha.split(divisor);     
    }
    
}
