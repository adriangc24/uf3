package pt3_fitxers;

import java.util.*;
import java.io.*;

public class ex1_3 {
	public static void main(String[] args) {
		try { escriurePersona(llegirPersona());
		
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static String[] llegirPersona()throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		int contador = 0;
		int numPer = 0;
		String dni;
		System.out.println("Quantes persones vols introduir?");
		while (true) {
			if (sc.hasNextInt()) {
				numPer = sc.nextInt();
				break;
			} else {
				System.out.println("Torna a introduir el numero");
				sc.nextLine();
			}
		}
		String array[] = new String[numPer];
		while (contador < numPer) {
			System.out.println("Introduiex el nom");
			array[contador] = sc.next();
			System.out.println("Introduiex els 2 cognoms");
			array[contador] += " " + sc.next() +" "+sc.next();
			System.out.println("Introduiex l'edat");
			while (true) {
				if (sc.hasNextInt()) {
					array[contador] += " " + sc.nextInt();
					break;
				} else {
					System.out.println("Torna a introduir l'edat");
					sc.nextLine();
				}
			}
			System.out.println("Introduiex el DNI");
			while (true) {
				dni=sc.next();
				if ((dni.length()==9)&&(dni.endsWith("t")||dni.endsWith("r")||dni.endsWith("w")||dni.endsWith("a")||dni.endsWith("g")||dni.endsWith("m")||dni.endsWith("y")||dni.endsWith("f")||dni.endsWith("p")||dni.endsWith("d")||dni.endsWith("x")||dni.endsWith("b")||dni.endsWith("n")||dni.endsWith("j")||dni.endsWith("z")||dni.endsWith("s")||dni.endsWith("q")||dni.endsWith("v")||dni.endsWith("h")||dni.endsWith("l")||dni.endsWith("c")||dni.endsWith("k")||dni.endsWith("e"))) {
					array[contador]+=" "+dni;
					break;
				}
				else {
					System.out.println("Torna a introduir el dni");
					sc.nextLine();
				}
			}
			System.out.println("Introdueix l'alçada en metres");
			while(true) {
				if (sc.hasNextDouble()) {
					array[contador]+=" "+sc.nextDouble();
					break;
				}
				else {
					System.out.println("Torna a introduir l'alçada");
					sc.nextLine();
				}
			}
			contador++;
		}
		return array;
	}

	public static void escriurePersona(String array[]) throws FileNotFoundException {
		File f = new File("C:\\Users\\adria\\Documents\\eclipse-worksapce\\uf3_AdrianGonzalez\\pt3\\persones.txt");
		PrintStream escriure = new PrintStream(f);
		for (int i=0;i<array.length;i++) {
			escriure.println(array[i]);
		}
		
	}

}
