package ZY;

import java.util.Scanner;

public class Salle {
		
	public static int[][] salle= { {1,2,3},{1,2,3},{1,2,3},{1,2,3},{1,2,3} };
	
	public int selectSalle(int choix){
		System.out.println("Veuillez s¨¦lectionner la salle!(en chiffre):");
		Scanner scanner=new Scanner(System.in);
		int a =scanner.nextInt();
		
		salle[choix-1][a-1]=0;
		System.out.println("Op¨¦ration r¨¦ussie!Votre r¨¦servation est bien enregistr¨¦e!\n");
		System.out.println("-------------------------------------------------------------------");
	
		return a;
	}
	
	
	
	
	public void afficher(int salle){
		switch (salle) {
		
		case 1:
			System.out.println("1.Salle1\n");
			break;
		case 2:
			System.out.println("2.Salle2\n");
			break;
		case 3 :
			System.out.println("3.Salle3\n");
			break;
		default:
			System.out.println("entr¨¦e invalide!\n");
			break;
		} 
			
		
	}
	public void afficherSalle(int choixDate) {
		for (int i = 0; i < salle[choixDate-1].length; i++) {
			if (salle[choixDate-1][i]==i+1){
				this.afficher(salle[choixDate-1][i]);
			}else {
				System.out.println(i+1 +".Salle"+ (i+1) +"(Non disponible)\n");
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Salle a = new Salle();
		a.selectSalle(2);
		
	}
		
	

}
