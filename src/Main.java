import java.util.Scanner;

public class Main {
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         menuUtilisateur menu = new menuUtilisateur();
         menu.menu1();
         int choix1 = sc.nextInt();

         switch (choix1){
             case 1:
                 System.out.println("Saisie au clavier");
                 break;
             case 2:
                 System.out.println("Random");
                 break;
             case 3:
                 System.out.println("Quitter");
                 break;
         }

         menu.menu2();
         int choix2 = sc.nextInt();

         switch (choix2){
             case 1:
                 System.out.println("ROT-13");
                 break;
             case 2:
                 System.out.println("Le chiffre César");
                 break;
             case 3:
                 System.out.println("César au choix");
                 break;
             case 4:
                 System.out.println("Le Poly-Alphavariante");
                 break;
             case 5:
                 System.out.println("Je sé po");
                 break;
         }
     }
}
