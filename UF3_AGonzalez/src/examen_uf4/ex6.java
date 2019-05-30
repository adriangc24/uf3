package examen_uf4;

import java.io.*;

public class ex6 {

	public static void CopiarArxiu(File in, File out, Boolean sobreescribir) {

		try {
			FileReader fr = new FileReader(in);
			FileWriter fw = new FileWriter(out, !sobreescribir);
			int i = fr.read();
			while ((i = fr.read()) != -1)
				fw.write(i);

			fr.close();
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void CopiarArxiu(String[] args) {
		File fo = new File(args[0]);
		File fd = new File(args[1]);

		if (!fo.isFile()) {
			System.out.println("El origen no es un fitxer");
		} else if (fo.isDirectory() && fd.isDirectory()) {
			System.out.println("Ambdos son directoris");
		}

		else if (fd.isDirectory() && !(new File(fd.toString() + fo.getName()).exists())) {
			CopiarArxiu(fo, new File(fd.toString() + File.separator + fo.getName()), false);
		}

		else if (fd.isDirectory() && (new File(fd.toString() + File.pathSeparatorChar + fo.getName()).exists())
				&& Boolean.parseBoolean(args[2])) {
			CopiarArxiu(fo, new File(fd.toString() + File.separator + fo.getName()), true);
		}

		else if (!fd.isDirectory() && !fd.exists()) {
			CopiarArxiu(fo, fd, false);
		}

		else if (!fd.isDirectory() && fd.exists() && Boolean.parseBoolean(args[2])) {
			CopiarArxiu(fo, fd, true);
		}

		else {
			throw new IllegalAccessError("Exception");
		}

	}

	public static void main(String[] args) throws IOException {
		String[] argumentos = { "C:\\Users\\adria\\Documents\\eclipse-worksapce\\uf3_AdrianGonzalez\\examen\\b.txt",
				"C:\\Users\\adria\\Documents\\eclipse-worksapce", "true" };
		CopiarArxiu(argumentos);
	}
}