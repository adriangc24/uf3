package fitxersByte;

import java.util.*;
import java.io.*;

public class ex2 {
	public static void main(String[] args) throws IOException {
		escriureText(nomArxiu());
	}

	public static String nomArxiu() throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduiex el nom de l'arxiu");
		while (true) {
			String nomArxiu = sc.nextLine();
			File f = new File("C:\\Users\\adria\\Documents\\eclipse-worksapce\\uf3_AdrianGonzalez\\pt4",nomArxiu);
			if (f.exists()) {
				System.out.println("Introduiex un altre nom");
			} else {
				return nomArxiu;
			}
		}
	}

	public static void escriureText(String nomArxiu) throws IOException {
		Scanner sc = new Scanner(System.in);
		File f = new File("C:\\Users\\adria\\Documents\\eclipse-worksapce\\uf3_AdrianGonzalez\\pt4");
		File f2 = new File("C:\\Users\\adria\\Documents\\eclipse-worksapce\\uf3_AdrianGonzalez\\pt4\\" + nomArxiu);
		PrintStream escriure = new PrintStream(f2);
		RandomAccessFile raf = new RandomAccessFile(f2, "rw");
		System.out.println("Escriu el text a introduir, per sortir introduiex un .");
		String hola;
		while (true) {
			hola = sc.nextLine();
			if (hola.equals(".")) {
				break;
			} else {
				escriure.println(hola);
			}
		}

	}
}
