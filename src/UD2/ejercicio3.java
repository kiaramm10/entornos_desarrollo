package UD2;

/*
 * f11 para poner modo depuración
 * f6 sirve para ejecutar una linea paso a paso sin entrar en el método(Step Over) 
 * f5 sirve para ejecutar paso a paso entrando en el método
 * f8 para ir al siguiente punto de ruptura (Resume)
 * f7 para forzar a que salga de la función (Step Return)
 * */

public class ejercicio3 {

	public static void main(String[] args) {

		int n = 10;
		int a = 0, b = 1;
		System.out.print(a + ", " + b);
		for (int i = 2; i < n; i++) {
			int temp = a + b;
			System.out.print(", " + temp);
			a = b;
			b = temp;
		}
	}

}
