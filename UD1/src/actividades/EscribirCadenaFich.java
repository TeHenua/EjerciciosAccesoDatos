package actividades;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class EscribirCadenaFich {
	
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\9fdam01\\Desktop","FichTexto.txt");
		FileWriter fw = new FileWriter(f);
		String prov[]= {"gipuzkoa","bizkaia","araba"};
		for(int i = 0; i<prov.length; i++) {
			fw.write(prov[i]);
		}
		fw.close();
	}
}

