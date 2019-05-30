package pt1_fitxers;

import java.io.*;
import java.util.*;

public class ex5 {

	public static void main(String[] args) {
		inici();
	}

	public static void inici() {
		Scanner sc = new Scanner(System.in);
		boolean fi = true;
		boolean directori = false;
		File rutaTreball = new File("C:\\Users\\adria\\Documents\\eclipse-worksapce\\uf3_AdrianGonzalez");
		File f = new File("");
		while (fi) {
			System.out.println(rutaTreball.getAbsolutePath() + ">");
			String palabra = sc.nextLine();
			if (palabra.equals("fi")) {
				System.out.println("FI DEL PROGRAMA");
				fi = false;
			} else {
				if (palabra.startsWith("cd")) {
					cd(palabra, directori, rutaTreball);
				}
				if (palabra.equals("dir")) {
					dir(rutaTreball);
				} else if (directori == false) {
					System.out.println("Comanda incorrecta");
				}
			}
		}
	}

	public static File cd(String palabra, boolean directori, File rutaTreball) {
		String comando = palabra.substring(3);
		File f2 = new File(comando);
		if (f2.isDirectory()) {
			directori = true;
			System.setProperty("user.dir", comando);
			System.out.println(rutaTreball.getAbsolutePath());
			String novaCarpeta = rutaTreball.getAbsolutePath() + File.separator + comando;
			File novaRuta = new File(novaCarpeta);
			return novaRuta;
			
		}
		if (comando.equals("..")) {
			directori = true;
			File novaRuta=new File(rutaTreball.getParent());
			return novaRuta;
		}

		else if (directori == false) {
			System.out.println("Aquesta ruta no es válida");
		}
		return rutaTreball;
	}

	public static void dir(File rutaTreball) {
		File[] arrayDir = rutaTreball.listFiles();
		for (int i = 0; i < arrayDir.length; i++) {
			if (arrayDir[i].isFile()) {
				System.out.println("[FILE] " + arrayDir[i].getName());
			} else {
				System.out.println("[DIR] " + arrayDir[i].getName());
			}
		}

	}
}