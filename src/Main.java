import java.util.Scanner;

/*
 * Scrivete un'applicazione che legga un'importo ed uno sconto. In output dovrà fornire un risultato
 * del genere:
 * Prezzo: EURO 10,60
 * Sconto: EURO 0,53
 * Prezzo scontato: EURO 10,07
 */
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Inserire un prezzo: ");
		float prezzo = input.nextFloat();
		System.out.print("Inserire la percentuale di sconto: ");
		int sconto = input.nextInt();
	}
}
