package fitxersByte;

import java.io.*;
import java.util.*;
public class ex1_2 {

	public static void main(String[] args) throws IOException {
		fitxer(origen(), destino());
	}

	public static File destino() throws IOException {
		Scanner sc = new Scanner(System.in);
		String destino = "";
		System.out.println("Introduiex el nombre del fitxer desti amb extensio .bin");
		destino = sc.nextLine();
		while (true) {
			File f = new File("C:\\Users\\adria\\Documents\\eclipse-worksapce\\uf3_AdrianGonzalez\\pt4", destino);
			if (!f.exists() && String.valueOf(f).endsWith(".bin")) {
				f.createNewFile();
				return f;
			} else {
				System.out.println("Torna a introduir un altre nom");
				destino = sc.nextLine();
			}
		}

	}

	public static File origen() throws IOException {
		Scanner sc = new Scanner(System.in);
		String origen = "";
		System.out.println("Introduiex el nombre del fitxer origen amb extensio .bin");
		origen = sc.nextLine();
		while (true) {
			File f2 = new File("C:\\Users\\adria\\Documents\\eclipse-worksapce\\uf3_AdrianGonzalez\\pt4", origen);
			if (!f2.exists() && String.valueOf(f2).endsWith(".bin")) {
				System.out.println("Torna a introduir un altre nom");
				origen = sc.nextLine();
			} else if (f2.exists() && String.valueOf(f2).endsWith(".bin")) {
				return f2;
			}
		}
	}

	public static void fitxer(File origen, File destino) throws IOException {
		RandomAccessFile raf2 = new RandomAccessFile(destino, "rw");
		Scanner sc = new Scanner(origen);
		int contador = 0;
		String character="";
		int largura = sc.next().length();
		sc.close();
		PrintStream escriure=new PrintStream(destino);
		Scanner sc2 = new Scanner(origen);
		for (int i = 0; i < largura; i++) {
			character += sc2.nextLine();
		}
		escriure.println(character);
	}

}
