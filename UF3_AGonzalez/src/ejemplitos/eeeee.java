package ejemplitos;
import java.io.*;
public class eeeee {
	public static void main(String[] args) {
		System.out.println(File.separator);
		File carpetaFotos = new File("C:/Personal/LesMevesFotos");
		 File unaFoto = new File("C:/Personal/LesMevesFotos/Foto1.png");
		 File unaAltraFoto = new File("C:/Personal/LesMevesFotos/Foto2.png");
		 System.out.println(System.getProperty("user.dir"));
		 System.out.println(System.getProperty("user.dir","/tmp"));
		 System.out.println("user.dir");
		 unaFoto.getParent();
	}
	
		
	

}
