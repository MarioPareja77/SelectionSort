package ioc.xtec.cat.selectionsort;

/**
 * Classe per validar arrays.
 * Aquesta classe proporciona una funcionalitat per verificar si un array és nul o buit.
 * 
 * @author Mario Pareja Nieto
 * @version 1.0
 */
public class ArrayValidator {

    /**
     * Valida un array d'enters.
     * <p>
     * Comprova si l'array proporcionat és nul o buit i llança una excepció si es detecta
     * algun d'aquests casos.
     * </p>
     * 
     * @param arr l'array d'enters a validar.
     * @throws IllegalArgumentException si l'array és nul o buit.
     */
    public void validateArray(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("L'array no pot ser nul.");
        }
        if (arr.length == 0) {
            throw new IllegalArgumentException("L'array no pot estar buit.");
        }
    }
}
