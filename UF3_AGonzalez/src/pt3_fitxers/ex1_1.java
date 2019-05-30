package pt3_fitxers;

import java.util.*;
import java.io.*;

public class ex1_1 {

	public static void main(String[] args) {
		try {
			senars();
			parells();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void senars() throws FileNotFoundException {
		File f = new File("C:\\Users\\adria\\Documents\\eclipse-worksapce\\uf3_AdrianGonzalez\\pt3\\senars.txt");
		PrintStream escriure = new PrintStream(f);
		for (int i = 1; i <= 100; i += 2) {
			escriure.println(i);
		}

	}
	public static void parells() throws FileNotFoundException {
		File f = new File("C:\\Users\\adria\\Documents\\eclipse-worksapce\\uf3_AdrianGonzalez\\pt3\\parells.txt");
		PrintStream escriure = new PrintStream(f);
		for (int i = 2; i <= 100; i += 2) {
			escriure.println(i);
		}

	}
}
