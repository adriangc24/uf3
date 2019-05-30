package fitxersByte;

import java.util.*;
import java.io.*;

public class ex1_a {
	public static void main(String[] args) throws IOException {
		llegirFrase(crearFitxer());

	}

	public static File crearFitxer() throws IOException {
		Scanner sc = new Scanner(System.in);
		String nombreFichero = "";
		System.out.println("Introduiex el nombre del fitxer amb extensio .bin");
		nombreFichero = sc.nextLine();
		while (true) {
			File f = new File("C:\\Users\\adria\\Documents\\eclipse-worksapce\\uf3_AdrianGonzalez\\pt4", nombreFichero);
			if (!f.exists()&&String.valueOf(f).endsWith(".bin")) {
				f.createNewFile();
				return f;
			} else {
				System.out.println("Torna a introduir un altre nom");
				nombreFichero = sc.nextLine();
			}
		}
	}

	public static void llegirFrase(File f) throws IOException {
		RandomAccessFile raf = new RandomAccessFile(f, "rw");
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduiex una frase");
		String frase = sc.nextLine();
		String[]arrayFrase=frase.split(" ");
		byte[] fraseByte = frase.getBytes();
		for (int i=0;i<arrayFrase.length;i++) {
		fraseByte = arrayFrase[i].getBytes();
		raf.write(fraseByte);
		//System.out.println(Arrays.toString(fraseByte));
		if(fraseByte.length>3) {
			String text = new String(fraseByte);
			System.out.println(text);
		}
		}

		

	}
}
