package br.com.alura.java.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteLeitura2 {

	public static void main(String[] args) throws IOException {
		
		// Este padrão é conhecido como, Decorator -> Um objeto decorando uma funcionalidade de outro objeto
		
		// Fluxo de Entrada com Arquivo
		InputStream fis = new FileInputStream("lorem.txt");
		
		// Transformar bytes em caracteres
		Reader isr = new InputStreamReader(fis);
		
		// Juntar todos os caracteres, linha por linha
		BufferedReader br = new BufferedReader(isr);
		
		String linha = br.readLine();
		
		while (linha != null) {
			System.out.println(linha);
			linha = br.readLine();
		}
		
		
		br.close();
		

	}

}
