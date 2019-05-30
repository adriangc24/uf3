package fitxersByte;

import java.util.*;

import java.io.*;

public class ex3 {
	public static void main(String[] args) throws IOException {
		nomArxiu();

	}

	public static void nomArxiu() throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduiex el nom de l'arxiu");
		while (true) {
			String nomArxiu = sc.nextLine();
			File f = new File("C:\\Users\\adria\\Documents\\eclipse-worksapce\\uf3_AdrianGonzalez\\pt4", nomArxiu);
			if (f.exists()) {
				histograma_leer(nomArxiu);
				break;
			} else {
				System.out.println("Introduiex un altre nom");
			}
		}
	}

	public static void histograma_leer(String nomArxiu) throws IOException {
		File f = new File("C:\\Users\\adria\\Documents\\eclipse-worksapce\\uf3_AdrianGonzalez\\pt4", nomArxiu);
		Scanner sc = new Scanner(f);
		RandomAccessFile raf = new RandomAccessFile(f, "r");
		String numero;
		int posicion = 0;
		String[] array = sc.next().split(",");
		double[] array2 = new double[array.length];
		for (int i = 0; i < array.length; i++) {
			array2[i] = Double.parseDouble(array[i]);
		}
		System.out.println(Arrays.toString(array2));
		histograma_escriure(array2);
	}

	public static void histograma_escriure(double[] array) {
		String[] arrayHistograma=new String[array.length];
		for(int i=0;i<array.length;i++) {
			if(array[i]<=10&&array[i]>=9) {
				if(arrayHistograma[0] == null) {
					arrayHistograma[0]="*";
				}
				else {
				arrayHistograma[0]+="*";
				}
			}
			else if(array[i]<9&&array[i]>=6.5) {
				if(arrayHistograma[1] == null) {
					arrayHistograma[1]="*";
				}
				else {
				arrayHistograma[1]+="*";
				}
			}
			else if(array[i]<6.5&&array[i]>=5) {
				if(arrayHistograma[2] == null) {
					arrayHistograma[2]="*";
				}
				else {
				arrayHistograma[2]+="*";
				}
			}
			else if(array[i]<5) {
				if(arrayHistograma[3] == null) {
					arrayHistograma[3]="*";
				}
				else {
				arrayHistograma[3]+="*";
				}
			}
			
		}
		System.out.println("Histograma de notes \r----------------- \rSuspés: "+arrayHistograma[3]+"\r"+"Aprovat: "+arrayHistograma[2]+"\r"+"Notable: "+arrayHistograma[1]+"\r"+"Excelent: "+arrayHistograma[0]);
		
		
		
	}
}
