package ioc.xtec.cat.selectionsort;

/**
 * Classe que implementa l'algorisme de Selection Sort i proporciona funcionalitat addicional
 * per treballar amb arrays.
 * 
 * @author Mario Pareja Nieto
 * @version 1.0
 */
public class SelectionSort {

    /**
     * Ordena un array d'enters utilitzant l'algorisme de Selection Sort.
     * <p>
     * L'algorisme busca iterativament el valor mínim des de la posició actual fins al final 
     * de l'array i l'intercanvia amb el valor de la posició actual.
     * </p>
     * 
     * @param arr l'array d'enters a ordenar.
     */
    public void sort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // Cerca del mínim a la subllista no ordenada
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Intercanvi dels elements
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    /**
     * Comprova si un array conté un valor específic.
     * <p>
     * Itera pels elements de l'array per determinar si el valor donat es troba present.
     * </p>
     * 
     * @param arr l'array d'enters on buscar.
     * @param value el valor a buscar dins l'array.
     * @return {@code true} si el valor existeix a l'array, {@code false} en cas contrari.
     * @throws IllegalArgumentException si l'array proporcionat és nul.
     */
    public boolean contains(int[] arr, int value) {
        if (arr == null) {
            throw new IllegalArgumentException("L'array no pot ser nul.");
        }

        // Comprovació de la presència del valor
        for (int num : arr) {
            if (num == value) {
                return true;
            }
        }
        return false;
    }

    /**
     * Mètode principal per mostrar el missatge.
     * 
     * @param args arguments de la línia de comandes (no utilitzats aquí).
     */
    public static void main(String[] args) {
        // Mostra el missatge
        System.out.println("Sóc el Mario Pareja Nieto. He aprés molt fent el mòdul 8 de DAW encara que hagi estat dur!!!");
    }
}
