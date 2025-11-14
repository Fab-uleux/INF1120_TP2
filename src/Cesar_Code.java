public class Cesar_Code {

    public String cesar(String entree) {
        char[] tab = entree.toCharArray();
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] alphabetMaj = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

//        char[] alphabetCesar = "defghijklmnopqrstuvwxyzabc".toCharArray();
//        char[] alphabetCesarMaj = "DEFGHIJKLMNOPQRSTUVWXYZABC".toCharArray();

        for (int i = 0; i < tab.length; i++) {
            char charactere = tab[i];

            //l'alphabet minuscule
            for (int j = 0; j < alphabet.length; j++) {
                if (charactere == alphabet[j]) {
                    tab[i] = alphabet[j + 3];
//                    tab[i] = alphabetCesar[j];
                }
            }
            //l'alphabet majuscule
            for (int j = 0; j < alphabetMaj.length; j++) {
                if (charactere == alphabetMaj[j]) {
                    tab[i] = alphabetMaj[j + 3];
                }
            }
        }
        return new String(tab);
    }
}