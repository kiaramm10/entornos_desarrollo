package UD2;

//Muestre los numeros del 1 al 10
//y muestre la suma de todos ellos 

public class EjemploUno {
	
	public static void main(String[] args) {
		int suma = 0;
		for (int i=0; i<10; i++) {
			System.out.println(i);
			suma = suma + i;
		}
		System.out.println(suma);
	}

}
/*
 * f11 para poner modo depuración
 * f6 sirve para ejecutar una linea paso a paso sin entrar en el método(Step Over) 
 * f5 sirve para ejecutar paso a paso entrando en el método
 * f8 para ir al siguiente punto de ruptura (Resume)
 * f7 para forzar a que salga de la función (Step Return)
 * */
