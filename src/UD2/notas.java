package UD2;
import java.util.Scanner;

public class notas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double acum = 0;
		double conta = 0;
		
		boolean salir = false;
		while(!salir) {
			System.out.println("Ingresa la nota e introduce 0 para salir: ");
			double num = sc.nextDouble();
			
			if(num != 0) {
				acum = acum + num;
				conta = conta + 1;
			}else if(acum == 0) {
				System.out.println("Ninguna nota introducida");
			}
			else {
				salir = num==0;
				double media = acum / conta;
				System.out.println("La media es: " + media);
			}
		}
		System.out.println("Fin del programa");
	}

}
