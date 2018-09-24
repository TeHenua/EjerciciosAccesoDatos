package actividades;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class EscribirFichTexto {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\9fdam01\\Desktop","FichTexto.txt");
		FileWriter fw = new FileWriter(f);
		char[] entrada = JOptionPane.showInputDialog("Escribe algo:").toCharArray();
		//fw.write(entrada);
		for (int i = 0; i<entrada.length; i++) {
			fw.write(entrada[i]);
		}
		fw.close();
	}

}
