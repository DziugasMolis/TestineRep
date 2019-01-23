package Uzduotis9;

import java.io.*;

/*
Suskaičiuoti vidurkį iš duomenų esančių tekstiniam faile.
Rezultatą išsaugoti rezultatų faile
 */
public class uzduotis9 {
    public static void main(String[] args) {
        String file = "C:\\TestineRep\\HelloWorld\\src\\uzduotis9\\Duomenys.txt";
        String fileRasymui = "C:\\TestineRep\\HelloWorld\\src\\uzduotis9\\Atsakymai.txt";
        try {
            String nuskaitytiSkaiciai = Skaityti(file);
            // \\W+ pasalina viskas kas ne zodziai
            String[] skaiciuMasyvasString = nuskaitytiSkaiciai.split("\\W+");
            Integer[] skaiciuMasyvas = GautiSkaiciuMasyva(skaiciuMasyvasString);
            double vid = GautiVidurki(skaiciuMasyvas);
            Rasyti(fileRasymui, vid);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Integer[] GautiSkaiciuMasyva(String[] skaiciai) {
        Integer[] skaiciuMasyvas = new Integer[skaiciai.length];
        for(int i = 0; i < skaiciai.length; i++) {
            skaiciuMasyvas[i] = Integer.parseInt(skaiciai[i]);
        }
        return skaiciuMasyvas;
    }

    public static Double GautiVidurki(Integer[] skaiciai) {
        double suma = 0;
        double vidurkis = 0;
        for(int i = 0; i < skaiciai.length; i++) {
            suma += skaiciai[i];
        }
        vidurkis = suma / skaiciai.length;
        return vidurkis;
    }

    public static String Skaityti(String failas) throws IOException {
        String visosEilutes = "";
        BufferedReader br = new BufferedReader(new FileReader(failas));
        try {
            String line = br.readLine();
            while (line != null) {
                visosEilutes += line + " ";
                line = br.readLine();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Failas nerastas");
        } finally {
            br.close();
        }

        return visosEilutes;
    }

    public static void Rasyti(String failas, Double vidurkis) throws IOException {
        BufferedWriter output = null;
        try {
            output = new BufferedWriter(new FileWriter(failas));
            output.write("Nuskaitytu skaiciu vidurkis = " + String.format("%.2f", vidurkis) + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (output != null) {
                output.close();
            }
        }
    }
}
