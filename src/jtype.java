package jtype;

import java.io.FileReader;
//import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class jtype {
/**
 * Crea una Aplicación Java que visualice en consola el contenido de un fichero de 
   texto dado (similar al comando type de Windows o cat de Unix).
	- El nombre del fichero se pedirá por teclado.

 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Pido el nombre del fichero por teclado
		//String filename = JOptionPane.showInputDialog("Escribe el nombre del fichero");
		
		// 1. Creo el objeto
		try (//FileWriter fr = new FileWriter(filename);
				FileReader fichero = new FileReader(args[0]) ){
			// Leo la primera vez (podría estar vacío)
			int car=0;
			car = fichero.read();
		//Mientras no sea EOF y no haya leido los caracteres pedidos
		// 2. Escribir
			while (car != -1) {
				char str = (char)car;
				System.out.print(str);
				car = fichero.read();
			}
		}catch(IOException e) {
			System.out.println("ERROR E/S");
		}
	}

}
