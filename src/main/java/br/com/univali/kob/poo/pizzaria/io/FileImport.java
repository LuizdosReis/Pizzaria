/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.univali.kob.poo.pizzaria.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author luizhenrique
 */
public class FileImport {

	public static List<String[]> retornaListaDeFrases(String nomeArquivo, String divisor) throws FileNotFoundException {
		List<String[]> listaDeFrases = new ArrayList<>();
		try {
			Scanner scanner = new Scanner(new FileInputStream(nomeArquivo));
			while (scanner.hasNextLine())
				listaDeFrases.add(StringHelper.divideAFraseEmPalavras(scanner.nextLine(),divisor));
			return listaDeFrases;
		} catch (FileNotFoundException e) {
			throw new FileNotFoundException("Arquivo não encontrado no diretorio: " + nomeArquivo);
		}
	}

}
