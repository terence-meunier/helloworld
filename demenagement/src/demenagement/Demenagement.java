package demenagement;

public class Demenagement {
	public static void main(String[] args) {
		int contenanceCamion = 9;
		int nbCartons = 34;
		
		while ((nbCartons - contenanceCamion) > 0) {
			nbCartons = nbCartons - contenanceCamion;
			System.out.println("un voyage de " + contenanceCamion + " cartons.");
		}
		
		if (nbCartons > 0) {
			System.out.println("un voyage de " + nbCartons + " cartons.");
		}
	}
}
