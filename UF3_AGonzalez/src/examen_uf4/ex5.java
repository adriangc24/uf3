package examen_uf4;

import java.util.*;
import java.io.*;

public class ex5 {

	public static void main(String[] args) throws IOException {
		taulasMultiplicar();

	}

	public static void taulasMultiplicar() throws IOException {
		File f = new File("C:\\Users\\adria\\Documents\\eclipse-worksapce\\uf3_AdrianGonzalez\\examen",
				"taules_de_multiplicar.bin");
		PrintStream escriure = new PrintStream(f);
		RandomAccessFile raf = new RandomAccessFile(f, "rw");
		int resultado;

		if (f.exists()) {
			for (int i = 0; i <= 10; i++) {
				for (int j = 0; j <= 10; j++) {
					resultado = i * j;
					escriure.print(i);
					escriure.print("*");
					escriure.print(j);
					escriure.print("=");
					escriure.print(resultado);
					escriure.println("");
				}
			}
		} else {
			f.createNewFile();
		}
		cercaResultat();
	}

	public static void cercaResultat() throws IOException {
		Scanner sc = new Scanner(System.in);
		File f = new File("C:\\Users\\adria\\Documents\\eclipse-worksapce\\uf3_AdrianGonzalez\\examen",
				"taules_de_multiplicar.bin");
		RandomAccessFile raf = new RandomAccessFile(f, "r");
		String linea;
		int numero;
		int numero2;
		System.out.println("Introdueix un numero mes petit de 10");
		while (true) {
			numero = sc.nextInt();
			if (numero <= 10 && numero >= 0) {
				break;
			} else {
				System.out.println("Torna a introduir un numero mes petit de 10");
			}
		}
		System.out.println("Introdueix un altre numero mes petit de 10");
		while (true) {
			numero2 = sc.nextInt();
			if (numero2 <= 10 && numero2 >= 0) {
				break;
			} else {
				System.out.println("Torna a introduir un numero mes petit de 10");
			}
		}
		while (true) {
			linea = raf.readLine();
			if (linea.contains(String.valueOf(numero)) && linea.contains(String.valueOf(numero2))) {
				System.out.println(linea);
				break;
			}
		}

	}

}
