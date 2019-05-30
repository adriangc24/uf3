package pt2_fitxers;
import java.util.*;
import java.io.*;
public class ex2 {

	public static void main(String[] args) {
		try {
			inici();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	public static void inici() throws FileNotFoundException {
		// Els decimals de les notes s'han d'introduir amb punts, si s'hi introdueixen comes fallara
		File f = new File("C:\\Users\\adria\\Documents\\eclipse-worksapce\\uf3_AdrianGonzalez\\notas\\notas.txt");
		File f2 = new File("C:\\Users\\adria\\Documents\\eclipse-worksapce\\uf3_AdrianGonzalez\\notas\\notaMitja.txt");
		Scanner sc = new Scanner(f);
		int contador = 0;
		final int posicions = 4;
		String holaaa[] = new String[posicions];
		double arrayMedias[] = new double[posicions];
		String arrayNombres[] = new String[posicions];
		String arrayFinal[] = new String[posicions];
		PrintStream escriure=new PrintStream(f2);
		while (true) {
			String hola = sc.nextLine();
			if (hola.endsWith("fi")) {
				break;
			} else {
				holaaa = hola.split(" ");
				arrayNombres[contador] = holaaa[0] + " " + holaaa[1];
				arrayMedias[contador] = (Double.parseDouble(holaaa[2]) + Double.parseDouble(holaaa[3])
						+ Double.parseDouble(holaaa[4])) / 3;
				contador++;
			}
		}
		for (int i=0;i<arrayFinal.length;i++) {
			arrayFinal[i]=arrayMedias[i]+" "+arrayNombres[i];
		}
		for (int i=0;i<arrayFinal.length;i++) {
			escriure.println(arrayFinal[i]);
		}
	}

	
}
