package Ejercicios;

import java.util.*;

public class Extra1_MAA {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Pregunta los productos y el precio
		String[][] productosDescuento = new String[3][2];
		String[][] productos = new String[3][2];
		for (int i = 0; i < productos.length; i++) {
			int j = 0;
			System.out.println("Que producto quieres comprar?");
			String producto = sc.nextLine();
			productos[i][j] = producto; // Se rellena el array de productos sin el descuento
			productosDescuento[i][j] = producto; // Se rellena el array de productos con el descuento
			j++;
			System.out.println("Que precio tiene el producto?");
			double precio = sc.nextDouble();
			productos[i][j] = precio + "";// Se rellena el array de productos sin el descuento
			productosDescuento[i][j] = validarDescuento(precio);// Se rellena el array de productos con el descuento
			sc.nextLine(); // Salto de linea
		}
		System.out.println("\n--------------------\n");
		// Muestra los productos
		for (int i = 0; i < productos.length; i++) {
			double precio= Double.parseDouble(productos[i][1]);
			double precioDescuento= Double.parseDouble(productosDescuento[i][1]);
			System.out.println("Producto " + (i + 1));
			System.out.println(productos[i][0] + " " + productos[i][1] + " euros " + "(descuento de " + productosDescuento[i][1] + " euros)");
		}
		// Calcula precio total sin descuentos
		double precioTotal = 0;
		for (int i = 0; i < productos.length; i++) {
			precioTotal += Double.parseDouble(productos[i][1]);
		}
		// Calcula precio total con descuentos
		double precioTotalDescuento = 0;
		for (int i = 0; i < productosDescuento.length; i++) {
			precioTotalDescuento += Double.parseDouble(productosDescuento[i][1]);
		}
		// TOTAL
		System.out.println("\n--------------------\n");
		System.out.println("Precio a pagar sin descuento (" + precioTotal + ")");
		System.out.println("Precio a pagar con descuento (" + (precioTotal - precioTotalDescuento) + ")");
	}

	public static String validarDescuento(Double precio) {
		Double precioDescuento = precio;
		if (precio <= 50.0) {
			precioDescuento = precio * 0.08;
		} else {
			precioDescuento = precio * 0.1;
		}
		return (precioDescuento + "");
	}
}
