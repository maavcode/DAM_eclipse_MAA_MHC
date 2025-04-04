package Ejercicios;
import java.util.*;

public class Extra2_MHC {

	public static final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("--VAMOS A CALCULAR TU SALARIO SEMANAL--\n\n"
				+ "INTRODUCE LAS HORAS TRABAJADAS: ");
		int horas = sc.nextInt();
		if (calcularSalario(horas)>640) {
			System.out.println("\nSALARIO BASE: 640€\n"
					+ "SALARIO POR HORAS EXTRA: " + (calcularSalario(horas) - 640) + "€\n\n"
					+ "SALARIO TOTAL: " + calcularSalario(horas) + "€");
		} else {
			System.out.println("\nSALARIO TOTAL: " + calcularSalario(horas) + "€");
		}
	}
	
	public static int calcularSalario(int horas) {
		int salario = 0;
		int horasExtra = 0;
		int salarioExtra = 0;
		
		if (horas <= 40 ) {
			salario = horas*16;
			return salario;
		} else {
			salario = horas*16;
			horasExtra = horas-40;
			salarioExtra = horasExtra*20;
			return salario+salarioExtra;
		}
	}
}
