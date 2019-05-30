package pt1_fitxers;
import java.io.*;
import java.util.*;
public class ex4 {
	
	public static void main(String[] args) {
		llegirRuta();
	}
	public static File llegirRuta () {
		Scanner sc = new Scanner(System.in);
		boolean esCarpeta=true;
		System.out.println("Introdueix la ruta d'una carpeta");
		File carpeta = new File(sc.nextLine());
		while (esCarpeta) {
		if (carpeta.isDirectory()) {
			esCarpeta=false;
		}
		else {
			System.out.println("No es una carpeta");
			System.out.println("Introdueix la ruta d'una carpeta");
			carpeta = new File(sc.nextLine());
			
		}
		}
		mostrarFitxers(carpeta);
		return carpeta;
}
	public static void mostrarFitxers(File carpeta) {
		File[]array = carpeta.listFiles();
		for (int i=0;i<array.length;i++) {
			File comparar=array[i];
			if (comparar.length()>512000) {
				System.out.println(comparar);
			}
		}
	}
}