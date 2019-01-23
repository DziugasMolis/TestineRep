package uzduotis10;

import java.io.*;

/*
Iš duomenų failo nustatyti kokie skaičiai yra lyginiai
ir išvesti į rezultatų failą skaičių ir ar jis lyginis.
Pvz: 1 - nelyginis
     2 – lyginis

 */
public class uzduotis10 {
    public static void main(String[] args) {
        String file = "C:\\TestineRep\\HelloWorld\\src\\uzduotis10\\Duomenys.txt";
        String fileRasymui = "C:\\TestineRep\\HelloWorld\\src\\uzduotis10\\Atsakymai.txt";
        try {
            String nuskaitytiSkaiciai = Skaityti(file);
            // \\W+ pasalina viskas kas ne zodziai
            String[] skaiciuMasyvasString = nuskaitytiSkaiciai.split("\\W+");
            Integer[] skaiciuMasyvas = GautiSkaiciuMasyva(skaiciuMasyvasString);
            Rasyti(fileRasymui, skaiciuMasyvas);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Integer[] GautiSkaiciuMasyva(String[] skaiciai) {
        Integer[] skaiciuMasyvas = new Integer[skaiciai.length];
        for (int i = 0; i < skaiciai.length; i++) {
            skaiciuMasyvas[i] = Integer.parseInt(skaiciai[i]);
        }
        return skaiciuMasyvas;
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

    public static void Rasyti(String failas, Integer[] skaiciuMasyvas) throws IOException {
        BufferedWriter output = null;
        try {
            output = new BufferedWriter(new FileWriter(failas));
            for(int i = 0; i < skaiciuMasyvas.length; i++) {
                if (skaiciuMasyvas[i] % 2 == 0) {
                    output.write(skaiciuMasyvas[i] + " - Skaicius yra lyginis" + "\n");
                } else {
                    output.write(skaiciuMasyvas[i] + " - Skaicius yra nera lyginis" + "\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (output != null) {
                output.close();
            }
        }
    }
}
