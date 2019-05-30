package pt1_fitxers;

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class ex3 {

	public static void main(String[] args) {
		ex3 programa = new ex3();
		programa.inici();
	}

	public void inici() {
		String nomFitxer = preguntaNomFitxer();
		File rutaCarpeta = llegirRutaCarpeta();
		System.out.println("----------");
		cerca(rutaCarpeta, nomFitxer);
	}

	public void cerca(File carpeta, String nom) {
		File[] elements = carpeta.listFiles();
		for (int i = 0; i < elements.length; i++) {
			if (elements[i].isDirectory()) {
				cerca(elements[i], nom);
			} else {
				String nomElement = elements[i].getName();
				if (nomElement.equalsIgnoreCase(nom)) {
					System.out.println("S'ha trobat el fitxer a: " + elements[i].getAbsolutePath());
				}
			}
		}

	}

	public String preguntaNomFitxer() {
		System.out.println("Quin és el nom del fitxer a cercar?");
		Scanner lector = new Scanner(System.in);
		return lector.nextLine();
	}

	public File llegirRutaCarpeta() {
		File f = null;
		boolean preguntar = true;
		Scanner lector = new Scanner(System.in);
		while (preguntar) {
			System.out.println("Escriu el nom d'una ruta a una carpeta: ");
			String nomCarpeta = lector.nextLine();
			f = new File(nomCarpeta);
			if (f.isDirectory()) {
				preguntar = false;
			} else {
				System.out.println("Aquesta carpeta no existeix...");
			}
		}
		return f;
	}
}