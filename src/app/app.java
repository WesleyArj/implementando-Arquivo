package app;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		
		File file = new File("C:\\temp\\ws-eclipse-udemy\\curso\\Arquivos tst\\tabelaPreco.txt");
		Scanner sc = null;
		
		try {
			sc = new Scanner (file);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			
		}
		catch(IOException e){
			System.out.println("Error n planejado: " + e.getMessage());
			
		}
		finally{
			if (sc != null) {
				sc.close();
			}
		}
		

	}

}
