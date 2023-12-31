package app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class app {

	public static void main(String[] args) {
		
		String path = "C:\\temp\\ws-eclipse-udemy\\curso\\Arquivos tst\\tabelaPreco.txt";
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			
			String line = br.readLine();
			
			while(line != null) {
				System.out.println(line);
				line = br.readLine();	
			}
		}
		catch(IOException e) {
			System.out.println("Erro meu: " + e.getMessage());
		}
		finally {
			
			try {
				if (fr != null) {
					fr.close();
				}
				if (br != null) {
					br.close();
				}
			}
			catch(IOException e){
				e.getStackTrace();
			}
		}
		
	}

}
