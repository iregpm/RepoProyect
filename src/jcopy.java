package jtype;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class jcopy {
/**
 * Crea una Aplicación Java que realice una copia exacta de un fichero de texto dado
   (similar al comando copy de Windows o cp de Unix).
      - El nombre del fichero a copiar se pedirá por teclado.
      - El nombre del fichero copia, se podrá pedir también o, símplemente, 
   agregar la palabra “_copy” al nombre.
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Pedir el nombre del fichero a copiar por teclado
		//String filenamecopy = JOptionPane.showInputDialog("Introduce el nombre del fichero a copiar");
		try(FileReader fr = new FileReader(args[0]);
				FileWriter fw = new FileWriter (args[0]+"_copy.txt")){
			
			int car = 0;
			car = fr.read();
			
			// Leemos el fichero de entrada (FileReader fr)
			// y lo escribimos en el fichero de salida (FileWriter fr);
			while (car != -1) {
				fw.write(car);
				car = fr.read();
			}
			
		}catch(FileNotFoundException e1){
			System.out.println("Fichero no encontrado");
		}catch(IOException e2) {
			System.out.println("ERROR E/S");
		}
	}

}
