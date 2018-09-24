package actividades;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Actividad4_1 {
	public static void main(String[] args) throws IOException {
		// Mete espacios al principio y el número de caracteres que ponemos al final.
		File f = new File("C:\\Users\\9fdam01\\Desktop","texto.txt");
		FileReader fr = new FileReader(f);
		char[] buf = new char[30];
		int i = fr.read(buf,5,10);
		System.out.println(i);
		for(char c:buf) {
			System.out.print(c);
		}
		fr.close();
	}
}
