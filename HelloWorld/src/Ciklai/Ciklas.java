package Ciklai;

public class Ciklas {
    public static void main(String[] args) {
        Integer[] sveikuSkaiciuMasyvas = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Double[] skaiciuMasyvas = {10.0, 9.0, 8.0, 7.0, 6.0, 5.0, 4.0, 3.0, 2.0, 1.0};
        String[] stringuMasyvas = {"aaaa", "bbbb", "cccc", "dddd", "eeeee"};

        for (int i = 0; i < sveikuSkaiciuMasyvas.length; i++) {
            System.out.println(sveikuSkaiciuMasyvas[i]);
        }

        Integer indeksas = 0;

        while (indeksas < skaiciuMasyvas.length) {
            System.out.println(skaiciuMasyvas[indeksas]);
            indeksas++;
        }

        indeksas = 0;

        do {
            System.out.println(stringuMasyvas[indeksas]);
            indeksas++;
        } while (indeksas < stringuMasyvas.length);


        indeksas = 1;
        do {
            System.out.println("Ivyks viena karta");
            indeksas++;
        } while (indeksas < 0);
    }
}
