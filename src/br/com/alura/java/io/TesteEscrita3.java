package br.com.alura.java.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TesteEscrita3 {

	public static void main(String[] args) throws IOException {

//		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
//		PrintStream ps = new PrintStream(new File("lorem2.txt"));
		PrintWriter ps = new PrintWriter("lorem2.txt"); 
		
		ps.println("Lorem Ipsum is simply dummy text of the printing and typesetting industry.");
		ps.println();
		ps.println();
		ps.println();
		ps.println("Lorem Ipsum is simply dummy text of the.....");
		
		ps.close();
	}

}
