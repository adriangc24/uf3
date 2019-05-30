package pt1_fitxers;

import java.io.*;
import java.util.*;

public class ex2 {

	public static void main(String[] args) {
		ex2 programa = new ex2();
		programa.inici();
	}
	public void inici() {
		System.out.print("Escriu l'extensió origen i destí: ");
		Scanner lector = new Scanner(System.in);
		String origen = lector.next();
		String desti = lector.next();
		File rutaTreball = new File("C:\\Users\\adria\\Documents\\eclipse-worksapce\\uf3_AdrianGonzalez\\extensiones");
		File[] elements = rutaTreball.listFiles();

		for (int i = 0; i < elements.length; i++) {
			if (elements[i].isFile()) {
				canviaExtensio(elements[i], origen, desti);
			}
		}
	}

	public void canviaExtensio(File ruta, String origen, String destino) {
		String nom = ruta.getName();
		int punt = nom.lastIndexOf(".");
		if (punt >= 0) {
			String extOrigen = nom.substring(punt + 1, nom.length());
			if (extOrigen.equals(origen)) {
				String nouNom = nom.substring(0, punt + 1) + destino;
				nouNom = ruta.getParent() + File.separator + nouNom;
				File novaRuta = new File(nouNom);
				ruta.renameTo(novaRuta);
			}
		}
	}

}