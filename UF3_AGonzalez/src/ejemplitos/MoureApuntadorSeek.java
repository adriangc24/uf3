package ejemplitos;

import java.util.*;
import java.io.*;

public class MoureApuntadorSeek {
	public static void main(String[] args) {
		MoureApuntadorSeek programa = new MoureApuntadorSeek();
		programa.inici();
	}

	public void inici() {
		try {
			File f = new File("Enters.bin");
			RandomAccessFile raf = new RandomAccessFile(f, "r");
			raf.seek(20);
			long pos = raf.getFilePointer();
			System.out.println("L'apuntador està a la posició " + pos);
			raf.seek(0);
			pos = raf.getFilePointer();
			System.out.println("L'apuntador està a la posició " + pos);
			raf.seek(100);
			pos = raf.getFilePointer();
			System.out.println("L'apuntador està a la posició " + pos);
			raf.close();
		} catch (Exception e) {
			// Excepció!
			System.out.println("Error: " + e);
		}
	}
}
