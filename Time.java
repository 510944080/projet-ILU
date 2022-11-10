package ZY;

import java.util.Scanner;

public class Time {
	private int[] date= {1,2,3,4,5};
	
	public void afficher(int date){
		switch (date) {
			case 1:
				System.out.println("1.Lundi\n");
				break;
			case 2:
				System.out.println("2.Mardi\n");
				break;
			case 3 :
				System.out.println("3.Mercredi\n");
				break;
			case 4 :
				System.out.println("4.Jeudi\n");
				break;
			case 5 :
				System.out.println("5.Vendredi\n");
				break;
			default:
				System.out.println("entr¨¦e invalide!\n");
				break;
			} 
	}
	public int  selectDate() {
		System.out.println("Veuillez s¨¦lectionner la date!(en chiffre):\n");
		Scanner scanner=new Scanner(System.in);
		int a =scanner.nextInt();
		
		return a;
	}
	
	public void afficherTime() {
		for (int i = 0; i < date.length; i++) {
			this.afficher(date[i]);
		}
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		
	}





}
