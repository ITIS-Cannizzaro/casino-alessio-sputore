import java.util.Scanner;
public class Casino extends Conti {
	
	public Casino(double ContoGiocatore, double ContoCasino) {
		super(ContoGiocatore, ContoCasino);
		
		}
	Scanner in=new Scanner(System.in);
	
	public void Gioco () {
		while (true) {	
			System.out.println("Inserisci il numero su cui punti: ");
			int n=in.nextInt(); //numero su cui si punta
			if (n>6||n<1) {
				System.out.println("Numero non valido.");
			}
			else {
				System.out.println("Inserisci il valore della tua puntata");
				double importo=in.nextDouble();
				double vincita=5*importo;
				
				if (importo>ContoGiocatore) {
					System.out.println("Importo non valido.");
				}
				else {
					int dado=(int)(Math.random()*7);
					if(n==dado) {
						System.out.println("Hai vinto.");
						ContoGiocatore=ContoGiocatore+vincita;
						ContoCasino=ContoCasino-vincita;
						System.out.println("Conto aggiornato: "+ ContoGiocatore);
					}
				
					else {
						System.out.println("Hai perso.");
						ContoGiocatore=ContoGiocatore-importo;
						ContoCasino=ContoCasino+importo;
						System.out.println("Conto aggiornato: "+ ContoGiocatore);
					}
				}	
			}
			
			
			if (ContoGiocatore<=0) 
				break;
			System.out.println("Giocare nuovamente?");
			String risposta=in.next();
			if (risposta.equals("No") || risposta.equals("no"))
				break;
		}
		System.out.println("Conto finale giocatore: "+ContoGiocatore+"Conto finale casino: "+ ContoCasino);
	}
}
