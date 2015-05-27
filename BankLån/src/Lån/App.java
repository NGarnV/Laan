package L�n;

import java.util.Scanner;

public class App {


	
	@SuppressWarnings("resource")
	public static void main(String[]args){
		
		/*
		 * Scanner Objektet
		 */
		
			//lag en Scanner (Objekt)
		Scanner input = new Scanner(System.in);
		
		
		/*
		 *  Rente Informasjon
		 */
		
			//sp�r bruker etter �rlig prosent
		System.out.println("Legg til �rlig rente f.eks 3,4: ");
		
			//f� Rente raten
		double �rligRente = input.nextDouble();
		
			//kalkuler m�nedlig rente
		double M�nedligRente = �rligRente / 1200;
		
		
		/*
		 *  �r Informasjon
		 */
		
			//sp�r bruker etter hvor mange �r de skal bruke p� � betale
		System.out.println("Skriv hvor mange �r du tenker � bruke p� � nedbetale dette l�net f.eks 20: ");
		
			//F� antall �r
		int Antall�r = input.nextInt();
		
		
		/*
		 * L�n Informasjon
		 */
		
			//sp�r hvor mye brukeren skal l�ne.
		System.out.println("Skriv inn hvor mye du skal l�ne");
		
			//F� informasjon om hvor mye du skal l�ne.
		double L�nSum = input.nextDouble();
		
		
		/*
		 * Kalkulering Og Logikken Til all Informasjon
		 */
		
			//kalkuler en m�nedlig betaling
		double M�nedligBetaling = L�nSum * M�nedligRente / (1*1/Math.pow(1+ M�nedligRente, Antall�r * 12));
			//dat formel doe
		
			//kalkuler en total betaling
		double TotalBetaling = M�nedligBetaling *Antall�r*12;
		
		
		/*
		 * Viser resultat av all informasjon og resultat av kalkuleringen 
		 */
		
			//vis m�nedlig kostnad
		System.out.println("Det koster " +M�nedligBetaling+"kr hver m�ned");
			//linje for finere resultat
		System.out.println("");
			//vis total kostnad
		System.out.println("Det koster " + TotalBetaling + "kr total");
		
	}

	
}