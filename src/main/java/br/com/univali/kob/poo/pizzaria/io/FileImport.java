/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.univali.kob.poo.pizzaria.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author luizhenrique
 */
public class FileImport {
    
    /**
     * recebe o nome do arquivo e retorna um buffer de leitura
     * @param nomeArquivo
     * @return BufferedREader
     * @throws ArquivosException lanca esta exceção caso o arquivo não seja encontrado
     */
    public static BufferedReader retornaBufferParaLeituraDeArquivo(String nomeArquivo) throws ArquivosException{
        try{
            InputStream is = new FileInputStream(nomeArquivo);
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            return br;   
        }catch(FileNotFoundException e){
           
        } 
    }
    
}
