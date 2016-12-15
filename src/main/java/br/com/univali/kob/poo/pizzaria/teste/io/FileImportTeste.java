package br.com.univali.kob.poo.pizzaria.teste.io;

import java.io.FileNotFoundException;
import java.util.List;

import br.com.univali.kob.poo.pizzaria.io.ConsoleWrite;
import br.com.univali.kob.poo.pizzaria.io.FileImport;

public class FileImportTeste {

	/**
	 * testa a importacao de um arquivo
	 */
	public void testeImportacaoArquivo() {
		try {
			List<String[]> frases = FileImport.retornaListaDeFrases("Clientes.txt", ";");
			for (String[] strings : frases) {
				for (String string : strings) {
					ConsoleWrite.printSemQuebrarLinha(string);
				}
				ConsoleWrite.printComQuebraDeLinha("");
			}
		} catch (FileNotFoundException e) {
			ConsoleWrite.printComQuebraDeLinha(e.getMessage());
		}
	}

	/**
	 * testa importacao do arquivo, porem passando um arquivo que nao existe
	 * para ser lancada a exception
	 */
	public void testeImportacaoArquivo1() {
		try {
			List<String[]> frases = FileImport.retornaListaDeFrases("Clientes1.txt", ";");
			for (String[] strings : frases) {
				for (String string : strings) {
					ConsoleWrite.printSemQuebrarLinha(string);
				}
				ConsoleWrite.printComQuebraDeLinha("");
			}
		} catch (FileNotFoundException e) {
			ConsoleWrite.printComQuebraDeLinha(e.getMessage());
		}
	}

}
