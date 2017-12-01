package br.com.fatec.arquivos.hd;

import java.io.File;

public class ArquivosHD {

	public static void main(String[] args) {
		File pasta = new File("C:\\");
		
		File [] listaArquivos = pasta.listFiles();
		
		for (int i = 0; i < listaArquivos.length; i++){
			if(listaArquivos[i].isFile()){
				System.out.println("Este é o Arquivo: "+
			listaArquivos[i].getName());
				System.out.println("\n------------------------------\n");
			}else if (listaArquivos[i].isDirectory()){
				System.out.println("Este é o Diretório: "+
			listaArquivos[i].getName());
				System.out.println("\n------------------------------\n");
			}
		}

	}

}
