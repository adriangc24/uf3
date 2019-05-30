package ejemplitos;

import java.io.File;
import java.io.RandomAccessFile;

public class MoureApuntadorSkipBytes {
	public static void main(String[] args) {
		MoureApuntadorSkipBytes programa = new MoureApuntadorSkipBytes();
		programa.inici();
	}

	public void inici() {
		try {
			File f = new File("Enters.bin");
			RandomAccessFile raf = new RandomAccessFile(f, "r");
			long skip = raf.skipBytes(20);
			long pos = raf.getFilePointer();
			System.out.print("L'apuntador ha avan�at " + skip + " posicions. ");
			System.out.println("Est� a la posici� " + pos);
			skip = raf.skipBytes(8);
			pos = raf.getFilePointer();
			System.out.print("L'apuntador ha avan�at " + skip + " posicions. ");
			System.out.println("Est� a la posici� " + pos);
			// S'intenta avan�ar molt m�s enll� de la mida del fitxer
			skip = raf.skipBytes(400);
			pos = raf.getFilePointer();
			System.out.print("L'apuntador ha avan�at " + skip + " posicions. ");
			System.out.println("Est� a la posici� " + pos);
			raf.close();
		} catch (Exception e) {
			// Excepci�!
			System.out.println("Error: " + e);
		}
	}
}
