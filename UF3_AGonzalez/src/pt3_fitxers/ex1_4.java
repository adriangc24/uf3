package pt3_fitxers;

import java.util.*;
import java.io.*;
import java.io.*;

public class ex1_4 {
	public static void main(String[] args) throws IOException {
		try {
			mostrarArxiu(llegirArxiu());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	public static String[] llegirArxiu() throws FileNotFoundException, IOException {
		File f = new File("C:\\Users\\adria\\Documents\\eclipse-worksapce\\uf3_AdrianGonzalez\\pt3\\persones.txt");
		Scanner sc = new Scanner(f);
		int contador = 0;

		FileReader fr = new FileReader(f);
		LineNumberReader lnr = new LineNumberReader(fr);
		lnr.skip(Long.MAX_VALUE);
		String array[] = new String[lnr.getLineNumber()];
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextLine();
		}
		return array;

	}

	public static void mostrarArxiu(String[] array) {
		String hola;
		String[] array2 = new String[array.length];
		int num;
		for (int i = 0; i < array.length; i++) {
			hola = array[i];
			array2 = hola.split(" ");
			num = Integer.parseInt(array2[3]);
			if (num > 18) {
				System.out.println(array[i]);
			}
		}

	}

}
