package ioc.xtec.cat.selectionsort;

import java.util.Scanner;

/**
 * Classe principal per demostrar l'ús de l'algorisme de Selection Sort i la validació d'arrays.
 * <p>
 * Aquesta classe permet a l'usuari introduir un array, validar-lo, buscar un element
 * i ordenar-lo utilitzant l'algorisme de Selection Sort.
 * </p>
 * 
 * @author Mario Pareja Nieto
 * @version 1.0
 */
public class Main {

    /**
     * Mètode principal de l'aplicació.
     * <p>
     * Permet a l'usuari introduir un array, validar-lo, buscar un valor dins l'array,
     * ordenar l'array i mostrar els resultats a la consola.
     * </p>
     * 
     * @param args arguments de la línia de comandes (no utilitzats).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introdueix la mida de l'array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Introdueix els elements de l'array:");
        for (int i = 0; i < size; i++) {
            System.out.println("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        SelectionSort sorter = new SelectionSort();
        ArrayValidator validator = new ArrayValidator();

        try {
            // Validació de l'array
            validator.validateArray(array);

            System.out.print("Array original:");
            printArray(array);

            // Cerca d'un valor a l'array
            System.out.println("Introdueix un valor a buscar a l'array: ");
            int valueToSearch = scanner.nextInt();

            boolean contains = sorter.contains(array, valueToSearch);
            if (contains) {
                System.out.println("El valor " + valueToSearch + " existeix a l'array.");
            } else {
                System.out.println("El valor " + valueToSearch + " no existeix a l'array.");
            }

            // Ordenació de l'array
            sorter.sort(array);

            System.out.print("Array ordenat:");
            printArray(array);

        } catch (IllegalArgumentException e) {
            // Tractament d'errors
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }

    /**
     * Mostra els elements d'un array.
     * <p>
     * Imprimeix els elements de l'array proporcionat a la consola separats per espais.
     * </p>
     * 
     * @param arr l'array d'enters a mostrar.
     */
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
