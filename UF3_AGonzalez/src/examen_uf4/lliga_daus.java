package examen_uf4;

import java.io.*;
import java.util.*;

public class lliga_daus {
	public static void main(String[] args) throws IOException {
		fitxerClassificacio(daus());

	}

	public static String[][] daus() {
		Scanner sc = new Scanner(System.in);
		String nom;
		String[][] array = new String[6][2];
		System.out.println("Introduiex el nom de 6 jugadors");
		for (int i = 0; i < array.length; i++) {
			nom = sc.nextLine();
			array[i][0] = nom;
		}
		for (int i = 0; i < array.length; i++) {
			array[i][1] = "0";
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i][0] + " ");
			System.out.print(array[i][1] + "\r");
		}
		return array;

	}

	public static File fitxerClassificacio(String[][] array) throws IOException {
		File f = new File("C:\\Users\\adria\\Documents\\eclipse-worksapce\\uf3_AdrianGonzalez\\examen",
				"classificacio.txt");
		PrintStream escriure = new PrintStream(f);
		if (f.exists()) {
			for (int i = 0; i < array.length; i++) {
				escriure.print(array[i][0] + " ");
				escriure.print(array[i][1] + "\r");
				escriure.println();
			}
		} else {
			f.createNewFile();
		}
		return jornadas(f);
	}

	public static File jornadas(File f) throws IOException {
		Scanner sc = new Scanner(f);
		String linea;
		String jugador;
		File f2 = new File("C:\\Users\\adria\\Documents\\eclipse-worksapce\\uf3_AdrianGonzalez\\examen",
				"jornada1.txt");
		File f3 = new File("C:\\Users\\adria\\Documents\\eclipse-worksapce\\uf3_AdrianGonzalez\\examen",
				"jornada2.txt");
		File f4 = new File("C:\\Users\\adria\\Documents\\eclipse-worksapce\\uf3_AdrianGonzalez\\examen",
				"jornada3.txt");
		File f5 = new File("C:\\Users\\adria\\Documents\\eclipse-worksapce\\uf3_AdrianGonzalez\\examen",
				"jornada4.txt");
		PrintStream escriure = new PrintStream(f2);
		PrintStream escriure2 = new PrintStream(f3);
		PrintStream escriure3 = new PrintStream(f4);
		PrintStream escriure4 = new PrintStream(f5);
		String[] arrayJugador = new String[100];
		String[] arrayLiga = new String[11];
		String[] arrayLiga2 = new String[6];
		int contador=0;
		for (int i = 0; i < 11; i++) {
			linea = sc.nextLine();
			arrayJugador = linea.split(" ");
			jugador = arrayJugador[0];
			arrayLiga[i] = jugador;
		}
		for (int j = 0; j < arrayLiga2.length; j++) {
				arrayLiga2[j] = arrayLiga[contador];
				contador+=2;
		}
		System.out.println(Arrays.toString(arrayLiga2));
			escriure.println(arrayLiga2[0]+" "+arrayLiga2[1]);
			escriure.println(arrayLiga2[2]+" "+arrayLiga2[3]);
			escriure.println(arrayLiga2[4]+" "+arrayLiga2[5]);
			
			escriure2.println(arrayLiga2[0]+" "+arrayLiga2[3]);
			escriure2.println(arrayLiga2[1]+" "+arrayLiga2[4]);
			escriure2.println(arrayLiga2[2]+" "+arrayLiga2[5]);
			
			escriure3.println(arrayLiga2[0]+" "+arrayLiga2[2]);
			escriure3.println(arrayLiga2[1]+" "+arrayLiga2[3]);
			escriure3.println(arrayLiga2[4]+" "+arrayLiga2[0]);
			
			escriure4.println(arrayLiga2[0]+" "+arrayLiga2[5]);
			escriure4.println(arrayLiga2[1]+" "+arrayLiga2[4]);
			escriure4.println(arrayLiga2[2]+" "+arrayLiga2[3]);
		
		aparellaments(f2,f3,f4,f5);
		return f5;
	}
	public static String[][] aparellaments(File f2,File f3,File f4,File f5) throws IOException {
		File fichero=f2;
		Scanner sc = new Scanner(fichero);
		String jugador;
		String[][]arrayAparellaments= new String[3][2];
		for (int i=0;i<3;i++) {
			for(int j=0;j<2;j++) {
				jugador=sc.next();
				arrayAparellaments[i][j]=jugador;
			}
		}
		
		/*for (int i=0;i<3;i++) {
			for(int j=0;j<2;j++) {
				System.out.println(arrayAparellaments[i][j]);
			}
		}*/
		tirades(f2,f3,f4,f5);
		return arrayAparellaments;
		
		}
	public static void tirades(File f2,File f3,File f4,File f5) throws IOException {
		int numero;
		File fichero=f2;
		Scanner sc = new Scanner(fichero);
		int tirada;
		int[][]arrayTirades= new int[3][2];
		for (int i=0;i<3;i++) {
			for(int j=0;j<2;j++) {
				while(true) {
				tirada=(int)(Math.random()*12);
				if (tirada>=2&&tirada<=12) {
					break;
				}
				}
				arrayTirades[i][j]=tirada;
			}
		}
		/*for (int i=0;i<3;i++) {
			for(int j=0;j<2;j++) {
				System.out.println(arrayTirades[i][j]);
			}
	}*/
	arxiuResultats(arrayTirades);
	}
	public static void arxiuResultats(int[][]arrayTirades) throws IOException {
		int numero=1;
		String arxiu="f"+"2";
		Scanner sc = new Scanner(arxiu);
		
		File f2 = new File("C:\\Users\\adria\\Documents\\eclipse-worksapce\\uf3_AdrianGonzalez\\examen",
				"jornada1.txt");
		File f3 = new File("C:\\Users\\adria\\Documents\\eclipse-worksapce\\uf3_AdrianGonzalez\\examen",
				"jornada2.txt");
		File f4 = new File("C:\\Users\\adria\\Documents\\eclipse-worksapce\\uf3_AdrianGonzalez\\examen",
				"jornada3.txt");
		File f5 = new File("C:\\Users\\adria\\Documents\\eclipse-worksapce\\uf3_AdrianGonzalez\\examen",
				"jornada4.txt");
		File f = new File("C:\\Users\\adria\\Documents\\eclipse-worksapce\\uf3_AdrianGonzalez\\examen","resultats"+numero+".txt");
		f.createNewFile();
		PrintStream escriure = new PrintStream(f);
		for (int i=0;i<3;i++) {
		for(int j=0;j<2;j++) {
			escriure.println(arrayTirades[i][j]);
		}
}
		
	}
	
	
	
	
	
	
	
	
	

}
