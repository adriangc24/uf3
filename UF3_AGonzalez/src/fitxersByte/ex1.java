package fitxersByte;

import java.util.*;
import java.io.*;
import java.lang.reflect.Array;

public class ex1 {
	public static void main(String[] args) throws IOException {
		inici();

	}

	public static void inici() throws IOException {
		File f = new File("C:\\Users\\adria\\Documents\\eclipse-worksapce\\uf3_AdrianGonzalez\\pt4\\1.bin");
		RandomAccessFile raf = new RandomAccessFile(f, "r");
		int contador=0;
		while(true) {
			if(raf.readLine().endsWith("fi")) {
				break;
			}
			else {
				contador++;
			}
		}
		System.out.println("hay "+contador+" lineas");
		String[] array = new String[contador];
		raf.seek(0);
		for (int i = 0; i < array.length; i++) {
			array[i]=raf.readLine();
		}
		int linea;
		String array2[]=new String[1000];
		for (int i=0;i<array.length;i++) {
			array2=array[i].split(" ");
			linea=i+1;
			System.out.println("La Linía "+linea+" té "+array2.length+" paraules");
		}
		
	}
}
