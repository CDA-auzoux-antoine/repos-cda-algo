package exercice;

import java.util.Random;

public class PlacementAleatoireTeteSerie {

	public static void main(String[] args) {

		String[] liste = {"Ali", "Alice", "Antoine", "Aurélien", "Jonathan", "Loreen", "Mathieu", "Matthieu", "Ryadh", "Said", "Yassine", ""};		
		String[] teteSerie = {"FETHI", "MOHAMMED", "SAMUEL", "WEI"};
		String dernier = liste[liste.length-1];
		int count = 0;

		
		while (count < 11) {

			int aleatoire = new Random().nextInt(liste.length-2);
			int aleatoire2 = new Random().nextInt(teteSerie.length-1);
			
			if (dernier == liste[count]) {						//si le nom trouvé à l'indice[count] = celui contenu dans swap je décrémente [count].
				count--;
				continue;				
				
			}
				dernier = liste[count];							//je stocke la valeur de liste de [count] dans swap.
				liste[count] = liste[aleatoire];				//je stocke la valeur de liste de [count choisi aleatoirement] dans liste[0].
				liste[aleatoire] = dernier;						//je remplace le prénom déplacé par celui stocké dans swap.
		
			if (count < 4) {
				dernier = teteSerie[count];
				teteSerie[count] = teteSerie[aleatoire2];
				teteSerie[aleatoire2] = dernier;
			}
			count++;											//j'incrémente mon compteur.
		}
		System.out.println("***** Groupe 1 *****\n"+"********************\n"+teteSerie[0]+"\n"+liste[0]+"\n"+liste[1]+"\n"+liste[2]+"\n");
		System.out.println("***** Groupe 2 *****\n"+"********************\n"+teteSerie[1]+"\n"+liste[3]+"\n"+liste[4]+"\n"+liste[5]+"\n");
		System.out.println("***** Groupe 3 *****\n"+"********************\n"+teteSerie[2]+"\n"+liste[6]+"\n"+liste[7]+"\n"+liste[8]+"\n");
		System.out.println("***** Groupe 4 *****\n"+"********************\n"+teteSerie[3]+"\n"+liste[9]+"\n"+liste[10]);
	}
}
