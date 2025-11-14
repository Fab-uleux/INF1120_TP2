public class ROT13_Code {

    public String rot13(String entree) {
        char[] tab = entree.toCharArray();
        System.out.println("Rot13");

        for (int i = 0; i < tab.length; i++) {
            for (int j = i + 1; j < tab.length; j++) {
                char temp = tab[i];
            }
        }

        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i]);
        }

        System.out.println();
        return new String(tab);
    }
}