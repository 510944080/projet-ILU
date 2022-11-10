package ZY;

public class Sommaire {
	
	public static int[] choix= {1,2,3};
	
	

	
	
	
	public void afficher(int choix){
		switch (choix) {
		
		case 1:
			System.out.println("1.Faire une r¨¦servation \n");
			break;
		case 2:
			System.out.println("2.Votre r¨¦servation\n");
			break;
		case 3 :
			System.out.println("3.Exit\n");
			break;
		default:
			System.out.println("entr¨¦e invalide!");
			break ;
		} 
	}
	
	public void afficherSommaire() {
		for (int i = 0; i < choix.length; i++) {
			this.afficher(choix[i]);
		}
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
	}

}
