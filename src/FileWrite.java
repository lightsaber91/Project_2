/**
 * Quetsa classe serve per scrivere i risultati delle operazioni su file;
 */

import java.io.*;

public class FileWrite {
	
	public static void salva(String nome_algoritmo, double tempo, int dimensione_array, String path, String name) {
		String time, dim, da_scrivere, path_name;
		time = Double.toString(tempo);
		dim = Integer.toString(dimensione_array);
		da_scrivere = nome_algoritmo+" ha ordinato in "+tempo+" ms un array di "+dim+" elementi;\n\r";
		File _dir = new File(path);
		_dir.mkdirs();
		path_name = path + name;
		File _file = new File(_dir, name);
		if (_file.exists()) {
			System.out.println("Il file esiste già\nLa scrittura riprenderà dalla fine\n");
			FileWriter new_write;
			try {
				new_write = new FileWriter(_file, true);
				new_write.write(da_scrivere);
				new_write.flush();
			    new_write.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		else {
			File _new= new File (path_name);
			try {
				_new.createNewFile();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			System.out.println("Il file è stato creato con successo\n");
			FileWriter new_write;
			try {
				new_write = new FileWriter(_file, true);
				new_write.write(da_scrivere);
				new_write.flush();
			    new_write.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}