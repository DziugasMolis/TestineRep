package Masyvai;

import java.util.Arrays;

public class Masyvai {
    public static void main(String[] args) {
        Integer[] sveikuSkaiciuMasyvas = {
                2, 3, 4, 2, 9, 8, 7, 4, 1, 5
        };

//        sveikuSkaiciuMasyvas = pridetiElementa(sveikuSkaiciuMasyvas, 10);
//        SpausdintiMasyva(sveikuSkaiciuMasyvas);
//        sveikuSkaiciuMasyvas = pasalintiPaskutiniElementa(sveikuSkaiciuMasyvas);
//        SpausdintiMasyva(sveikuSkaiciuMasyvas);
//        sveikuSkaiciuMasyvas = pasalintiElementaPagalIndeksa(sveikuSkaiciuMasyvas, 0);
//        SpausdintiMasyva(sveikuSkaiciuMasyvas);
//        sveikuSkaiciuMasyvas = iterptiElementaPagalIndeksa(sveikuSkaiciuMasyvas, 999, 1);
//        SpausdintiMasyva(sveikuSkaiciuMasyvas);

//        sveikuSkaiciuMasyvas = MinMaxRikiavimas(sveikuSkaiciuMasyvas);
        sveikuSkaiciuMasyvas = mazesniUzVidurki(sveikuSkaiciuMasyvas);
        SpausdintiMasyva(sveikuSkaiciuMasyvas);
    }
    //Pašalinti visus elementus mažesnius už vidurkį
    public static Integer[] mazesniUzVidurki(Integer[] masyvas) {
        Double suma = 0.0;
        for(int i = 0; i < masyvas.length; i++) {
            suma += masyvas[i];
        }
        Double vidurkis = suma / masyvas.length;
        Integer[] mazesniUzVidurki = null;
        for(int i = 0; i < masyvas.length; i++) {
            if(vidurkis > masyvas[i]) {
                if(mazesniUzVidurki == null) {
                    mazesniUzVidurki = new Integer[0];
                }
                mazesniUzVidurki = pridetiElementa(mazesniUzVidurki, masyvas[i]);
            }
        }
        return mazesniUzVidurki;
    }

    public static Integer[] pridetiElementa(Integer[] masyvas, Integer skaicius) {
        masyvas = Arrays.copyOf(masyvas, masyvas.length + 1);
        masyvas[masyvas.length - 1] = skaicius;
        return masyvas;
    }

    public static Integer[] iterptiElementaPagalIndeksa(Integer[] masyvas, Integer skaicius, Integer indeksas) {
        Integer[] tmp = new Integer[masyvas.length + 1];
        int pridejimoIndeksas = 0;
        for (int i = 0; i < masyvas.length; i++) {
            if (i == indeksas) {
                tmp[pridejimoIndeksas++] = skaicius;
            }
            tmp[pridejimoIndeksas++] = masyvas[i];

        }
        return tmp;
    }

    public static Integer[] pasalintiPaskutiniElementa(Integer[] masyvas) {
        masyvas = Arrays.copyOf(masyvas, masyvas.length - 1);
        return masyvas;
    }

    public static Integer[] pasalintiElementaPagalIndeksa(Integer[] masyvas, Integer indeksas) {
        Integer[] tmp = new Integer[masyvas.length - 1];
        int istrynimoIndeksas = 0;
        for (int i = 0; i < masyvas.length; i++) {
            if (i != indeksas) {
                tmp[istrynimoIndeksas++] = masyvas[i];
            }
        }
        return tmp;
    }

    public static void SpausdintiMasyva(Integer[] masyvas) {
        for (int i = 0; i < masyvas.length; i++) {
            System.out.println(masyvas[i]);
        }
    }

    public static Integer[] MinMaxRikiavimas(Integer[] masyvas) {
        int temp;
        for (int i = 0; i < masyvas.length - 1; i++) {
            /* find the min element in the unsorted a[j .. n-1] */
            /* assume the min is the first element */
            int minIndeksas = i;
            /* test against elements after j to find the smallest */
            for (int j = i + 1; j < masyvas.length; j++) {
                /* if this element is less, then it is the new minimum */
                if (masyvas[j] < masyvas[minIndeksas]) {
                    /* found new minimum; remember its index */
                    minIndeksas = j;
                }
            }
            if (minIndeksas != i) {
                temp = masyvas[i];
                masyvas[i] = masyvas[minIndeksas];
                masyvas[minIndeksas] = temp;
            }
        }
        return masyvas;
    }
}
