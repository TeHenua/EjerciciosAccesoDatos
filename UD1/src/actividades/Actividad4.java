package actividades;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Actividad4 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\9fdam01\\Desktop","texto.txt");
		FileReader fr = new FileReader(f);
		int i;
		while((i=fr.read())!=-1) {
			System.out.print((char) i);
		}
		fr.close();
	}
}
