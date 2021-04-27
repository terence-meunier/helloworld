package demenagement;
import java.util.Scanner;

public class Demenagement {
	public static int readCartons() {
		Scanner input = new Scanner(System.in);
		return input.nextInt();
	}
	
	public static void main(String[] args) {
		int contenanceCamion = 9;
		System.out.println("Saississez le nombre de cartons (nombre entier) :");
		int nbCartons = Demenagement.readCartons();
		
		while ((nbCartons - contenanceCamion) > 0) {
			nbCartons = nbCartons - contenanceCamion;
			System.out.println("un voyage de " + contenanceCamion + " cartons.");
		}
		
		if (nbCartons > 0) {
			System.out.println("un voyage de " + nbCartons + " cartons.");
		}
	}
}
