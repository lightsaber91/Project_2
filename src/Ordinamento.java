
 /**
 * In questo package si testeranno gli algoritmi di ordinamento
 *
 */

import asdlab.libreria.Ordinamento.*;

public class Ordinamento {

	@SuppressWarnings("static-access")
	public static long integersort(int [] array, int dimensione, AlgoritmiOrdinamento alg) {

		long tempo;
		int i;
		int [] array_appoggio;
		array_appoggio = new int [dimensione];
		for(i=0; i<dimensione; i++) {
			array_appoggio[i] = (int) array[i];
		}
		tempo = System.nanoTime();
		alg.integerSort(array_appoggio, dimensione);
		tempo = System.nanoTime() - tempo;

		return tempo;
	}

	@SuppressWarnings("static-access")
	public static long quicksort(int [] array, int dimensione, AlgoritmiOrdinamento alg) {

		long tempo;
		int i;
		Integer array_appoggio[], dimensione_ap;
		dimensione_ap = new Integer (dimensione);
		array_appoggio = new Integer [dimensione_ap];
		for(i=0; i<dimensione; i++) {
			array_appoggio[i] = new Integer (array[i]);
		}
		tempo = System.nanoTime();
		alg.quickSort(array_appoggio);
		tempo = System.nanoTime() - tempo;

		return tempo;
	}

	@SuppressWarnings("static-access")
	public static long mergesort(int [] array, int dimensione, AlgoritmiOrdinamento alg){

		long tempo;
		int i;
		Integer array_appoggio[], dimensione_ap;
		dimensione_ap = new Integer (dimensione);
		array_appoggio = new Integer [dimensione_ap];
		for(i=0; i<dimensione; i++) {
			array_appoggio[i] = new Integer (array[i]);
		}
		tempo = System.nanoTime();
		alg.mergeSort(array_appoggio);
		tempo = System.nanoTime() - tempo;
		
		return tempo;
	}

	@SuppressWarnings("static-access")
	public static long heapsort(int [] array, int dimensione, AlgoritmiOrdinamento alg){

		long tempo;
		int i;
		Integer array_appoggio[], dimensione_ap;
		dimensione_ap = new Integer (dimensione);
		array_appoggio = new Integer [dimensione_ap];
		for(i=0; i<dimensione; i++) {
			array_appoggio[i] = new Integer (array[i]);
		}
		tempo = System.nanoTime();
		alg.heapSort(array_appoggio);
		tempo = System.nanoTime() - tempo;

		return tempo;
	}

	@SuppressWarnings("static-access")
	public static long radixsort(int [] array, int dimensione, AlgoritmiOrdinamento alg, int base) {

		long tempo;
		int i;
		int [] array_appoggio;
		array_appoggio = new int [dimensione];
		for(i=0; i<dimensione; i++) {
			array_appoggio[i] = array[i];
		}
		tempo = System.nanoTime();
		alg.radixSort(array_appoggio, dimensione, base);
		tempo = System.nanoTime() - tempo;

		return tempo;
	}
}