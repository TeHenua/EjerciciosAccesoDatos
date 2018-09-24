package actividades;

import java.io.*;

public class EscribirFichData {

	public static void main(String[] args) throws IOException {
		DataOutputStream data = new DataOutputStream(new FileOutputStream(new File(
				"C:\\Users\\9fdam01\\Desktop","FichData.dat")));
		String nombres[] = {"Ana","Luis	Miguel","Alicia","Pedro","Manuel","Andrés",
				"Julio","Antonio","María Jesús"};
		int edades[] = {14,15,13,15,16,12,16,14,13};
		for(int i =0; i<edades.length;i++) {
			data.writeUTF(nombres[i]);
			data.writeInt(edades[i]);
		}
		data.close();
	}

}
