package es.studium.operaciones;

import java.util.Scanner;

public class operaciones
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner (System.in);
		int num1, num2, suma, resta, producto;
		float cociente;
		System.out.println("Dame un numero ");
		num1=teclado.nextInt();
		System.out.println("Dame otro numero ");
		num2=teclado.nextInt();
		suma = num1+num2;
		resta = num1-num2;
		producto = num1*num2;
		System.out.println("La suma de los numeroe es " + suma);
		System.out.println("El numero1 y el numero2 es " + resta);
		System.out.println("El numero1 y el numero2 es " + producto);
		if (num2!=0)
		{
			cociente= (float)(num1/num2);
			System.out.println("El cociente del numero 1 dividido por el numero 2 es  " + cociente);

		}
		else
		{
			System.out.println("La division no puede tener un valor cero no es posible" );
		}
	}

}
