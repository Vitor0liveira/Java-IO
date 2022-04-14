package br.com.alura.java.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWrite {

	public static void main(String[] args) throws IOException {

//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer osw = new OutputStreamWriter(fos);
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));

		bw.write("Lorem Ipsum is simply dummy text of the printing and typesetting industry.");
//		bw.write(System.lineSeparator());
		bw.newLine(); //mais alto nível
		bw.newLine(); 
		bw.write("Lorem Ipsum is simply dummy text of the.....");
		
		bw.close();
	}

}
