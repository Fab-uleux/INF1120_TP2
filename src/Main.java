import java.util.Scanner;
import java.util.Random;

public class Main {
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         String entree = "";

         //Appelle de la méthode ROT13_Code et création de l'objet rot13
         ROT13_Code rot13 = new ROT13_Code();

         //Appelle de la méthode menu_Code et création de l'objet menu
         menu_Code menu = new menu_Code();

         //Appelle du premier menu et lecture de la réponse
         menu.menu1();
         int choix1 = sc.nextInt();
         sc.nextLine();

         switch (choix1){
             case 1:
                 System.out.println("Saisie au clavier");
                 entree = sc.nextLine();
                 System.out.println("Le tete que vous désirez encrypter: " + entree);
                 break;
             case 2:
                 System.out.println("Random");
                 Random rnd = new Random();
                 int nombre =rnd.nextInt(1,5);
                 System.out.println(nombre);
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
                 String resultat = rot13.rot13(entree);
                 System.out.println("Texte encrypté: " + resultat);
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
                 Random rnd = new Random();
                 choix2 =rnd.nextInt(1,4);
                 System.out.println(choix2);
         }

     }

}
