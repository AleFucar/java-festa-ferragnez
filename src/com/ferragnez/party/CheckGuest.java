package com.ferragnez.party;

//Importiamo la utility di java "Scanner" che serve a prendere dei parametri o file in input
import java.util.Scanner;

//Creiamo una classe parlante
public class CheckGuest {

	//creiamo il metodo main per inizializzare lo script
	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		
		//creiamo l'array di stringhe che equivale ai nomi e cognomi degli invitati
		String Guest [] = new String [11];
		Guest[0] = "Dua Lipa";
		Guest[1] = "Paris Hilton";
		Guest[2] = "Manuel Agnelli";
		Guest[3] = "J-Ax";
		Guest[4] = "Francesco Totti";
		Guest[5] = "Ilary Blasi";
		Guest[6] = "Bebe Vio";
		Guest[7] = "Luis";
		Guest[8] = "Pardis Zarei";
		Guest[9] = "Martina Maccherone";
		Guest[10] = "Rachel Zeilic";
		

		//inizializziamo in una variabile "scan" l'utility Scanner
		Scanner scan = new Scanner(System.in);
		
			//stampiamo a video la domanda all'ingresso di ogni persona
			System.out.println("Ciao, prima di entrare, immetti il tuo nome e cognome qui!");
			
		//creiamo una variabile "TryGuest" dove salviamo la stringa in input che immette l'utente attraverso "scan.nextln()"		
		String TryGuest =  scan.nextLine();
		
		//creiamo un ciclo for dove la "i" è il contatore e Guest.length è la lunghezza dell'array "Guest"
//		for (int i = 0; i < Guest.length; i++) {
//					
//			//Dato il ciclo for, dato ogni indice dell'array "Guest" attraverso ".equals" controlla se il contenuto di ogni indice dell'array è uguale al contenuto della stringa "TryGuest"
//			if (Guest[i].equals(TryGuest)) {
//				System.out.println("Entra pure!");
//				break;
//				
//			//Se il ciclo arriva all'ultimo indice dell'array e sopra la condizione non si è verificata, allora stampa a video. 
//			}else if(i == Guest.length-1){
//				System.out.println("Non sei stato invitato, mi dispiace.");
//				break;
//			}
			
//		} 
		
		
		
		int i = 0;
		
		while (i < Guest.length) {
						
			if (Guest[i].equals(TryGuest)) {
				System.out.println("Entra pure!");
				break;
				
			}else if(i == Guest.length-1){
				System.out.println("Non sei stato invitato, mi dispiace.");
				break;
			}
			
			i++;
		}
		
	}

}
