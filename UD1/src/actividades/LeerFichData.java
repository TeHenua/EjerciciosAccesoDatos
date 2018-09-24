package actividades;

import java.io.*;

public class LeerFichData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DataInputStream data = new DataInputStream(new FileInputStream(new File(
				"C:\\Users\\9fdam01\\Desktop","FichData.dat")));
		while(data.available()>0) {
			System.out.print(data.readUTF() + " ");
			System.out.println(data.readInt());
		}
		data.close();
	}

}
