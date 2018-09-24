package actividades;

import java.io.File;
import java.io.IOException;

public class CrearDir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("directorio");
		f.mkdir();
		File f2 = new File(f,"fichero1.txt");
		File f3 = new File(f,"fichero2.txt");
		try {
			f2.createNewFile();
			f3.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		f2.delete();
		f.delete();
	}

}
