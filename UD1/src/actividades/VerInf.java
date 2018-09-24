package actividades;

import java.io.File;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class VerInf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre = JOptionPane.showInputDialog("Introduce el nombre del fichero:");
		String ruta = JOptionPane.showInputDialog("Introduce la ruta del fichero:");
		File file = new File(ruta,nombre);
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JOptionPane.showMessageDialog(new JFrame(),"Nombre: " + file.getName() + "\n" +
													"Ruta: " + file.getPath() + "\n" +
													"Ruta absoluta: " + file.getAbsolutePath() + "\n"+
													"Tamaño: " + file.length() + " bytes \n" +
													"Permisos lectura: " + (file.canRead()? "Si":"No") + "\n" +
													"Permisos escritura: " + (file.canWrite()? "Si":"No") + "\n" +
													"Directorio: " +(file.isDirectory()?"Si":"No") + "\n" +
													"Fichero: " +(file.isFile()?"Si":"No"));
	}

}
