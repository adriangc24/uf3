package fitxersByte;

import java.util.*;

import java.io.*;

public class ex1_3 {
	public static void main(String[] args) throws IOException {

		mostrarFitxer(inici());
	}

	public static File inici() throws IOException {
		Scanner sc = new Scanner(System.in);
		String origen = "";
		System.out.println("Introduiex el nombre del fitxer a editar amb extensio .bin");
		origen = sc.nextLine();
		while (true) {
			File f2 = new File("C:\\Users\\adria\\Documents\\eclipse-worksapce\\uf3_AdrianGonzalez\\pt4", origen);
			if (!f2.exists() && String.valueOf(f2).endsWith(".bin")) {
				f2.createNewFile();
				return f2;
			} else if (f2.exists() && String.valueOf(f2).endsWith(".bin")) {
				return f2;
			}
		}
	}

	public static void mostrarFitxer(File f) throws IOException {
		RandomAccessFile raf = new RandomAccessFile(f, "rw");
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(f);
		String numeritos = "";
		String valor;
		int valorNumeric;
		String[] arrayString = new String[(int) f.length()];
		if (f.length() == 0) {
			System.out.println("fitxer buit");
		} else {
			raf.seek(0);
			numeritos = raf.readLine();
			arrayString = numeritos.split(" ");
			
		
		System.out.println(Arrays.toString(arrayString));
		String comanda;
		while(true) {
			System.out.print("Comanda: ");
			comanda=sc.nextLine();
			if(comanda.startsWith("a")) {
				valor=comanda.substring(2);
				raf.writeChars(valor);
				System.out.println(sc2.nextLine());
			}
			else if(comanda.startsWith("d")) {
				valor=comanda.substring(2);
				valorNumeric=Integer.parseInt(valor);
				raf.write(valorNumeric);
			}
			else if (comanda.startsWith("x")) {
				System.out.println("Fi del programa");
				break;
			}
			else {
				System.out.println("Comanda desconeguda");
			}
		}
			
		}
		
		
		
		
	}
}
