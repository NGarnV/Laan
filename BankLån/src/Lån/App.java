package Lån;

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
		
			//spør bruker etter årlig prosent
		System.out.println("Legg til årlig rente f.eks 3,4: ");
		
			//få Rente raten
		double ÅrligRente = input.nextDouble();
		
			//kalkuler månedlig rente
		double MånedligRente = ÅrligRente / 1200;
		
		
		/*
		 *  År Informasjon
		 */
		
			//spør bruker etter hvor mange år de skal bruke på å betale
		System.out.println("Skriv hvor mange år du tenker å bruke på å nedbetale dette lånet f.eks 20: ");
		
			//Få antall år
		int AntallÅr = input.nextInt();
		
		
		/*
		 * Lån Informasjon
		 */
		
			//spør hvor mye brukeren skal låne.
		System.out.println("Skriv inn hvor mye du skal låne");
		
			//Få informasjon om hvor mye du skal låne.
		double LånSum = input.nextDouble();
		
		
		/*
		 * Kalkulering Og Logikken Til all Informasjon
		 */
		
			//kalkuler en månedlig betaling
		double MånedligBetaling = LånSum * MånedligRente / (1*1/Math.pow(1+ MånedligRente, AntallÅr * 12));
			//dat formel doe
		
			//kalkuler en total betaling
		double TotalBetaling = MånedligBetaling *AntallÅr*12;
		
		
		/*
		 * Viser resultat av all informasjon og resultat av kalkuleringen 
		 */
		
			//vis månedlig kostnad
		System.out.println("Det koster " +MånedligBetaling+"kr hver måned");
			//linje for finere resultat
		System.out.println("");
			//vis total kostnad
		System.out.println("Det koster " + TotalBetaling + "kr total");
		
	}

	
}