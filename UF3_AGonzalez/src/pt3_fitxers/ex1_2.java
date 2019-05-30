package pt3_fitxers;

import java.util.*;
import java.io.*;

public class ex1_2 {

	public static void main(String[] args) {
		try {
		inici();
		}
		catch (FileNotFoundException e){
			e.printStackTrace();
		}

	}

	public static void inici() throws FileNotFoundException {
		File f = new File("C:\\Users\\adria\\Documents\\eclipse-worksapce\\uf3_AdrianGonzalez\\pt3\\senars.txt");
		File f2 = new File("C:\\Users\\adria\\Documents\\eclipse-worksapce\\uf3_AdrianGonzalez\\pt3\\parells.txt");
		File f3 = new File("C:\\Users\\adria\\Documents\\eclipse-worksapce\\uf3_AdrianGonzalez\\pt3\\1a100.txt");
		PrintStream escriure = new PrintStream(f3);
		int contador=0;
		Scanner sc = new Scanner(f);
		Scanner sc2 = new Scanner(f2);
		for (int i=0;i<50;i++) {
			escriure.println(sc.nextLine());
			escriure.println(sc2.nextLine());
			
		}
		}

}
