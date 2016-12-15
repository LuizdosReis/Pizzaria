package br.com.univali.kob.poo.pizzaria.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public abstract class GenericReport<T> {

	private List<T> list;
	private String fileName;

	public GenericReport(List<T> list, String fileName) {
		this.list = list;
		this.fileName = fileName;
	}

	protected abstract String printLine(T t);

	public void generateFile() throws IOException {
		File file = new File(this.fileName);

		if (!file.exists())
			file.createNewFile();
		FileWriter fw = new FileWriter(file.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);
		for (T t : list)
			bw.write(printLine(t));
		bw.close();
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

}
