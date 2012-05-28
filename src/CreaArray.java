/**
 * Questo package serve a creare gli array random su cui fare i test
 */

public class CreaArray{

	public static int decidi_dimensione() {
		int dimensione;
/* Inizializzo dimensione array  */

    	System.out.println("Prima di procedere si deve creare un Array;\nInserire la dimensione dell'array\n");
    	dimensione = Read.readInt();

    	while(dimensione < 0) {
    		System.out.println("Scelta non valida: Inserire un numero maggiore di 0\n");
			dimensione = Read.readInt();
    	}
		return dimensione;
	}

	/**
	 * @param array: l'array passato dal main in cui salvare valori random
	 * @param dimensione: la dimensione dell'array anch'essa proveniente dal main
	 */

	public static void interi(int [] array,int dimensione){

    	int i;
    	String risposta;
		for (i=0; i<dimensione; i++){
			if(i==0) array[i] = (int) (Math.random()*(dimensione-1));
			else {
				array[i] = (int) (Math.round(Math.random()*(dimensione-1)));
			}
		}
		System.out.println("Vuoi stampare l'array creato?\n");
		risposta = Read.readString();
		if(risposta.equals("si") || risposta.equals("Si") || risposta.equals("SI") || risposta.equals("yes") || risposta.equals("Yes") || risposta.equals("YES")) {
			for(i=0;i<dimensione;i++) {
				System.out.println(array[i]);
			}
		}
		else;
	}
}