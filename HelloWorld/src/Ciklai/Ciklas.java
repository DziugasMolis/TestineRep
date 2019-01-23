package Ciklai;

public class Ciklas {
    public static void main(String[] args) {
        Integer[] sveikuSkaiciuMasyvas = {0, 2, 5, 7, 9, 0, 2, 0, -2, -6};
        Double[] skaiciuMasyvas = {10.0, 9.0, 8.0, 7.0, 6.0, 5.0, 4.0, 3.0, 2.0, 1.0};
        String[] stringuMasyvas = {"aaaa", "bbbb", "cccc", "dddd", "eeeee"};

        Integer suma = 0;
        for (int i = 0; i < sveikuSkaiciuMasyvas.length; i++) {
            if (suma > 10) {
                break;
            }
            suma += sveikuSkaiciuMasyvas[i];

        }
        System.out.println(suma);

        Integer indeksas = 0;
//
//        while (indeksas < skaiciuMasyvas.length) {
//            System.out.println(skaiciuMasyvas[indeksas]);
//            indeksas++;
//        }
//
//        indeksas = 0;
//
//        do {
//            System.out.println(stringuMasyvas[indeksas]);
//            indeksas++;
//        } while (indeksas < stringuMasyvas.length);
//
//
//        indeksas = 1;
//        do {
//            System.out.println("Ivyks viena karta");
//            indeksas++;
//        } while (indeksas < 3);
    }
}
