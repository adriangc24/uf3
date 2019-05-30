package pt3_fitxers;

import java.util.*;
import java.io.*;
import java.io.*;

public class ex1_5 {
	public static void main(String[] args) {
		try {
			desarMatriu();
			carregarMatriu();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	public static void desarMatriu() throws FileNotFoundException {
		File f = new File("C:\\Users\\adria\\Documents\\eclipse-worksapce\\uf3_AdrianGonzalez\\pt3\\matriu.txt");
		PrintStream escriure = new PrintStream(f);
		int[][] array = new int[7][10];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				array[i][j] = 1;
			}
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				escriure.print(array[i][j]);
			}
		}

	}

	public static void carregarMatriu() throws FileNotFoundException {
		File f2 = new File("C:\\Users\\adria\\Documents\\eclipse-worksapce\\uf3_AdrianGonzalez\\pt3\\matriu.txt");
		Scanner sc = new Scanner (f2);
		int[][]array_buit=new int[7][10];
		for (int i = 0; i < array_buit.length; i++) {
			for (int j = 0; j < array_buit.length; j++) {
				array_buit[i][j] = sc.nextInt();
			}
		}
		
	}
}
