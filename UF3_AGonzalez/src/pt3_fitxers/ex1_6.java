package pt3_fitxers;

import java.util.*;
import java.io.*;
import java.io.*;

public class ex1_6 {
	public static void main(String[] args) throws IOException {
		try {
			inici();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	public static void inici() throws IOException {
		File f = new File("C:\\Users\\adria\\Documents\\eclipse-worksapce\\uf3_AdrianGonzalez\\pt3\\numeros.txt");
		File f2 = new File("C:\\Users\\adria\\Documents\\eclipse-worksapce\\uf3_AdrianGonzalez\\pt3\\java.java");
		Scanner sc = new Scanner(f);
		Scanner sc2 = new Scanner(f2);
		int num;
		FileReader fr = new FileReader(f2);
		LineNumberReader lnr = new LineNumberReader(fr);
		lnr.skip(Long.MAX_VALUE);
		for (int i = 0; i < 6; i++) {
			num = sc.nextInt();
			if (fr.equals(num)) {
				System.out.println(sc2.nextLine());
			}
			}

	}

}
