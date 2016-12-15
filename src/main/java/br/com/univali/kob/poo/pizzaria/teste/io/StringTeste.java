/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.univali.kob.poo.pizzaria.teste.io;

import br.com.univali.kob.poo.pizzaria.io.ConsoleWrite;
import helper.StringHelper;

/**
 *
 * @author luizhenrique
 */
public class StringTeste {
	public void testeDivisorDeFrase() {
		String linha = "Luiz Henrique;(48)999798243;12345678;rua jose da silveira";
		String[] palavras = StringHelper.divideAFraseEmPalavras(linha, ";");
		for (String palavra : palavras) {
			ConsoleWrite.printComQuebraDeLinha(palavra);
		}
	}

}
