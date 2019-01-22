package Degalai;

/*
Automobilis 100 km sunaudoja k litrų kuro (realusis skaičius).
Į m kilometrų kelionę (realusis skaičius) išsirengė n žmonių.
Kiek litų s kainuos kelionė vienam žmogui, jei vienas litras
kuro kainuoja kk (realusis skaičius) litų.
Pasitikrinkite: kai k = 7.5, m = 305.5, n = 4, kk = 4.09, tai s = 23.4.

 */
public class Degalai {
    public static void main(String[] args) {
        Double k = 7.5;
        Double m = 305.5;
        Integer n = 4;
        Double kk = 4.09;

        Double s = k * m / 100;

        double sumaZmogui = s * kk / n;
        System.out.println("Suma vienam zmogui " + sumaZmogui);
    }
}
