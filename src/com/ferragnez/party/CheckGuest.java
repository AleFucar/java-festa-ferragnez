package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {

	public static void main(String[] args) {
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

		
		Scanner scan = new Scanner(System.in);
				System.out.println("Ciao, prima di entrare, immetti il tuo nome e cognome qui");
		String TryGuest =  scan.nextLine();
		
		//System.out.println(TryGuest);
		
		for (int i = 0; i < Guest.length; i++) {
			String string = Guest[i];
			//System.out.println(Guest[i]);
			
			
			if (Guest[i].equals(TryGuest)) {
				System.out.println("Entra pure!");
				break;
			}else if(i == Guest.length-1){
				System.out.println("Non sei stato invitato, mi dispiace.");
				break;
			}
			
		}

	}

}
