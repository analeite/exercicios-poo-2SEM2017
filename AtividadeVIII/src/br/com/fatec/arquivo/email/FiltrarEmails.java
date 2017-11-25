package br.com.fatec.arquivo.email;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class FiltrarEmails {
	private static final String ENCODING = "ISO-8859-1";
	private static final Pattern pat = Pattern
			.compile(
					"[_a-z0-9-]+(\\.[_a-z0-9-]+)*@[a-z0-9-]+(\\.[a-z0-9-]+)*(\\.[a-z]{2,3})",
					Pattern.CASE_INSENSITIVE);

	public void filtrar(File arquivo) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream(
					arquivo), ENCODING));
			for (String linha = br.readLine(); linha != null; linha = br
					.readLine()) {
				Matcher mat = pat.matcher(linha);
				while (mat.find()) {
					System.out.println(mat.group());
				}
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException ex2) {
			}
		}
	}

	public static void main(String[] args) {
		(new FiltrarEmails()).filtrar(new File("C:\\arquivo.txt"));
	}
}