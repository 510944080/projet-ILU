package ZY;

import java.util.Scanner;
import ZY.Salle;
import ZY.Time;
import ZY.Sommaire;

public class Client {
	public static String str;
	private int d=0;
	private int s=0;
	
	public int faireChoix() {
		System.out.println("Veuillez faire votre choix(en chiffre):");
		Scanner scanner=new Scanner(System.in);
		int a =scanner.nextInt();
		return a;
			
	}


	
	
	public static void main(String[] args) {
		// creat  objets
		
		Salle salle=new Salle();
		Sommaire sommaire=new Sommaire();
		Scanner scanner=new Scanner(System.in);
		Client client=new Client();
		Time date=new Time();
		//begin!
		
		while (true){
			System.out.println("Bienvenu de utiliser le system pour r¨¦server une salle d'¨¦tude!\n");
			sommaire.afficherSommaire();
			switch (client.faireChoix()) {
			case 1:
				date.afficherTime();
				client.d=date.selectDate();
				salle.afficherSalle(client.d);
				client.s=salle.selectSalle(client.d);
				break;
			case 2 :
				if(client.d==0) {
					System.out.println("Vous n'a pas de r¨¦servation!");
					System.out.println("-----------------------------------------");
				}else {
					System.out.println("Date:");
					date.afficher(client.d);
					System.out.println("Salle:");
					salle.afficher(client.s);
					System.out.println("-----------------------------------------");
				}
				break;
			case 3 :
				System.out.println("Merci de utilisation!");
				System.exit(0);
			default:
				System.out.println("entr¨¦e invalide!\n");
				break;
			}
		}
		
}
		
		
		
		
		
		
}
		
		
		
	
		
		

		
		
		
		
		

		
