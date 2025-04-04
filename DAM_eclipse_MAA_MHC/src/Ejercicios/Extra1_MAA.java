package Ejercicios;

import java.util.*;

public class Extra1_MAA {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Pregunta los productos y el precio
		String[][] productos = new String[3][2];
		for (int i = 0; i < productos.length; i++) {
			int j = 0;
			System.out.println("Que producto quieres comprar?");
			String producto = sc.nextLine();
			productos[i][j] = producto;
			j++;
			System.out.println("Que precio tiene el producto?");
			double precio = sc.nextDouble();
			productos[i][j] = validarDescuento(precio);
			sc.nextLine(); // Salto de linea
		}
		// Muestra los productos
		for (int i = 0; i < productos.length; i++) {
			int j = 0;
			System.out.println("Producto " + (i + 1));
			System.out.println();
		}

	}

	public static String validarDescuento(Double precio) {

	}
}
