package Matrica;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;

public class Matrica {
    public static void main(String[] Args) {
        String failas = "C:\\TestineRep\\HelloWorld\\src\\Matrica\\Duomenys.txt";
        Integer[][] matrica = skaitytiMatrica(failas);
        SpausdintiMatrica(pasalintiEilutesKuriuSumaMazesneUz5(matrica));
//        pasalintiEilutesKuriuSumaMazesneUz5(matrica);
    }


    public static void SpausdintiMatrica(Integer[][] masyvas) {
        int eilutes = masyvas.length;
        int stulpeliai;
        for (int i = 0; i < eilutes; i++) {
            stulpeliai = masyvas[i].length;
            for (int j = 0; j < stulpeliai; j++) {
                System.out.print(masyvas[i][j] + " ");
            }
            System.out.println("\n");
        }
    }

    public static Integer[][] pasalintiEilutesKuriuSumaMazesneUz5(Integer[][] matrica) {
        Integer[][] temp = new Integer[0][];
        Integer eilutesSuma = 0;
        for (int i = 0; i < matrica.length; i++) {
            for (int j = 0; j < matrica[i].length; j++) {

                eilutesSuma += matrica[i][j];
            }
            if (eilutesSuma > 5) {
                temp = idetiEilute(temp, matrica[i]);
            }
        }
        return temp;
    }

    public static Integer[][] idetiEilute(Integer[][] matrica, Integer[] eilute) {
        Integer[][] tmp = Arrays.copyOf(matrica, matrica.length + 1);
        tmp[tmp.length - 1] = eilute;
        return tmp;
    }

    public static Integer[][] skaitytiMatrica(String failas) {
        Integer[][] matrica = new Integer[3][4];
        String[] eilutesMasyvas = new String[0];
        int eilutesIndeksas = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(failas))) {
            String line = br.readLine();
            while (line != null) {
                eilutesMasyvas = line.split(" ");

                    for(int j = 0; j < matrica[eilutesIndeksas].length; j++) {
                        matrica[eilutesIndeksas][j] = Integer.parseInt(eilutesMasyvas[j]);
                    }
                eilutesIndeksas++;
                line = br.readLine();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Failas nerastas");
        } catch (Exception e) {
            System.out.println("something else went wrong");
        }

        return matrica;
    }

}
