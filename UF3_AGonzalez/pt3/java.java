package nFactorial;
import java.util.*;
public class nFactorial {
	
	public static int factor (int num) {
		int factorial=1;
		for (int i=num;i>0;i--) {
			factorial=factorial*i;
		}
		return factorial;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero");
		int num = sc.nextInt();
		System.out.println(factor(num));
	}
}
