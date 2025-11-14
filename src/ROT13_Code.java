public class ROT13_Code {

    public String rot13(String entree) {
        char[] tab = entree.toCharArray();
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] alphabetMaj = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        System.out.println("Rot13");

        for (int i = 0; i < tab.length; i++) {
            char charactere = tab[i];

            for (int j = 0; j < alphabet.length; j++) {
                if (charactere == alphabet[j]) {
                    tab[i] = alphabet[j + 13];
                }
            }

            for (int j = 0; j < alphabetMaj.length; j++) {
                if (charactere == alphabetMaj[j]) {
                    tab[i] = alphabetMaj[j + 13];
                }
            }
        }

        System.out.println();
        return new String(tab);
    }
}