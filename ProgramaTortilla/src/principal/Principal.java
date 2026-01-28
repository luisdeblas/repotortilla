package principal;

import java.util.Scanner;

/**
 * @author luisdbb
 */
public class Principal {

	public static void main(String[] args) {
		System.out.println("INICIAL");

		int patatas = 5;
		int huevos = 6;
		boolean concebolla = true;

		
		System.out.println("HOLA");
		System.out.println("HOLA");
		System.out.println("HOLA");
		System.out.println("HOLA");
		System.out.println("HOLA");
		
		System.out.println("1. Disponer ingredientes y utensilios de cocina.\n");
		prepararIngredientes(patatas, concebolla);
		freirIngredientes();
		batirHuevos(huevos);
		mezclarIngredientes();
		cuajarTortilla();
		System.out.println("La tortilla está lista para servir!");
		servirTortilla();
		System.out.println("FIN");
	}

	private static void prepararIngredientes(int patatas, boolean concebolla) {
		System.out.println("2. Preparar ingredientes:");
		for (int i = 1; i <= patatas;) {
			System.out.println("Pelando, lavando y troceando la patata #" + (i));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// e.printStackTrace();
			}
			finally {
				i++;
			}
		}
		System.out.println("Patatas listas!");
		if (concebolla) {
			System.out.println("Lavando y troceando la cebolla");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// e.printStackTrace();
			}
		}
		System.out.println("Ingredientes preparados.");
		
	}

	private static void freirIngredientes() {
		System.out.println("");
		System.out.println("3. Freir ingredientes:");
		System.out.println("Calentar aceite:");
		int temperatura_aceite = 20;
		do {
			System.out.println("aceite a " + temperatura_aceite + "ºC.");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// e.printStackTrace();
			}
			temperatura_aceite += 20;
		} while (temperatura_aceite < 80);
		System.out.println("\nEl aceite ya está caliente!");
		System.out.println("Añadimos la patata y la cebolla. Freimos a fuego medio.");
		boolean patata_blanda = false;
		boolean primeravez = true;
		while (!patata_blanda && primeravez) {
			System.out.println("Freir a fuego medio un poco más.");
			try {
				Thread.sleep(5000);
				primeravez =  false;
			} catch (InterruptedException e) {
				// e.printStackTrace();
				patata_blanda = true;
			}
		}
		System.out.println("Ya está frito todo. Ahora escurrimos.");
	}

	private static void batirHuevos(int huevos) {
		System.out.println("");
		System.out.println("4. Batir huevos:");
		boolean[] huevera = new boolean[huevos];
		huevera[0] = false;
		huevera[1] = false;
		huevera[2] = false;
		huevera[3] = false;
		huevera[4] = false;
		huevera[5] = false;
		for (int i = 0; i < huevera.length; i++) {
			System.out.println("Rompiendo huevo #" + (i + 1));
			huevera[i] = true;
			System.out.println("Batido huevo " + (i + 1) + " con los demás.");
		}
		System.out.println("\nTerminado con los huevos, añadimos una pizca de sal.");
	}

	private static void mezclarIngredientes() {
		System.out.println("5. Mezclamos todos los ingredientes.");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// e.printStackTrace();
		}
	}

	private static void cuajarTortilla() {
		System.out.println("");
		System.out.println("6.Cuajar tortilla.");
		try {
			System.out.println("Primero por un lado...");
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// e.printStackTrace();
		}
		try {
			System.out.println("Luego por el otro lado...");
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// e.printStackTrace();
		}
	}

	private static void servirTortilla() {
		Scanner in = new Scanner(System.in);
		System.out.println("\nDime el tamaño del trozo que quieras: ");
		System.out.println("'P' para pequeño, 'G' para grande");
		char porcion = in.nextLine().charAt(0);

		switch (porcion) {
		case 'p':
		case 'P':
			System.out.println("Sirviendo un trozo pequeño de tortilla!");
			break;
		case 'g':
		case 'G':
			System.out.println("Sirviendo un trozo grande de tortilla!");
			break;
		default:
			System.out.println("No te entendí. Toma un trozo normal.");
		}
	}

}
