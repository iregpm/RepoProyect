/**
 * @author iregp
 * @version Inicial
 * @date 26/04/2022
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

public class FicherosTextoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				final String FILENAME="Datos.txt";
				//String filename=JOptionPane.showInputDialog("Introduce el nombre del fichero");
				// Sentencia try-with-resources
				// poneemos try entre parentesis lo lo que tenemos que abrir y 
				// y ya no es necesario cerrara (autocloseable)
				try (
					// 1. Crear objeto: stream-character-input
					//FileReader fr = new FileReader(FILENAME);
					//BufferedReader fichero = new BufferedReader(fr);
					BufferedReader fichero = new BufferedReader(new FileReader(FILENAME));
					)
				{
					// 2. Leer primera l�nea
					/**String linea =fichero.readLine();
					if (linea !=null) {
						System.out.println("Primera linea "+linea);
					}**/
					
					// APLICACION JTYPE
					String linea =fichero.readLine();
					System.out.println("Comando TYPE: "+linea);
					while (linea != null) {
						linea=fichero.readLine();
						System.out.println("Comando TYPE: "+linea);
					}
		
					// APLICACION JCOPYTEXT
					String filenamecopy = JOptionPane.showInputDialog("Introduce el nombre del fichero que quiere copiar");
					
					try (
							BufferedReader ficherocopia = new BufferedReader(new FileReader(FILENAME));
							){
						
					}
					
					
					
	} catch(FileNotFoundException e) {
		System.out.println("Fichero no encontrado");
	} catch(IOException e) {
		System.out.println("ERROR E/S");
	}
	}
}


