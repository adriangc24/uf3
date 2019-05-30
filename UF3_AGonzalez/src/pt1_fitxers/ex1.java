package pt1_fitxers;
import java.io.*;
import java.util.*;
public class ex1 {
	
	public static void main(String[] args) {
		inici();
	}
	public static void inici () {
		
		File f = new File ("Temp");
		if (f.isDirectory()) {
			boolean dir = f.delete();
		
		if (dir) {
			System.out.println("S'ha esborrat la carpeta " + f.getAbsolutePath());
		}
		else {
			System.out.println("Error esborrant la carpeta " + f.getAbsolutePath());
		}
	}
		else {
			boolean dir = f.mkdir();
			if (dir) {
				System.out.println("S'ha creat la carpeta"+ f.getAbsolutePath());
			}
			else {
				System.out.println("Error creant la carpeta"+f.getAbsolutePath());
			}
		}
	}

}
