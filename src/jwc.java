package jtype;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

public class jwc {
/**
 * Crea una Aplicación Java que muestre el número de caracteres y el número de 
   lineas que tiene un fichero de texto dado (similar al comando wc de Unix).
      - El nombre del fichero se pedirá por teclado
 * @param args
 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// Pedir el nombre del fichero por teclado
		//String filename = JOptionPane.showInputDialog("Escribe el nombre del fichero");
		
		try (FileReader fr = new FileReader(args[1]);
				BufferedReader br =
						 new BufferedReader (new FileReader(args[1]))){
			
		// 1. Contar el número de caracteres que contiene el fichero
		// Leo el fichero y cuento los caracteres leidos
			int car = 0;
			int cont=0;
			while (car != -1) {
				car=fr.read();
				cont++;
			}
			
			if (args[0].equals("-c")) {
				System.out.println("Numero de caracteres que tine el fichero: "+cont);
			}
			
			
		// Leo el fichero y cuento las lineas que contiene el fichero
			String lineas=br.readLine();
			int contl=0;
			while(lineas != null) {
				contl++;
				lineas = br.readLine();
			}
			
			if (args[0].equals("-l")) {
				System.out.println("Numero de lineas que tiene el fichero: "+contl);
			}
			
		}catch(FileNotFoundException e) {
			System.out.println("Fichero no encontrado");
		}catch(IOException e) {
			System.out.println("ERROR E/S");
		}
	}

}
