package SkaitymasIrRasymas;

import java.io.*;

/*
7 uzduotis
 */
public class SkaitymasIrRasymas {

    public static void main(String[] args) {
        String file = "C:\\TestineRep\\HelloWorld\\src\\SkaitymasIrRasymas\\Test.txt";
        String fileRasymui = "C:\\TestineRep\\HelloWorld\\src\\SkaitymasIrRasymas\\Irasytas.txt";
        try {
            Integer[] nuskaitytiSkaiciai = Skaityti(file);
            Integer gautaSuma = Suma(nuskaitytiSkaiciai);
            Rasyti(fileRasymui, gautaSuma, nuskaitytiSkaiciai);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Integer Suma(Integer[] skaiciuMasyvas) {
        Integer suma = 0;
        for (int i = 0; i < skaiciuMasyvas.length; i++) {
            suma += skaiciuMasyvas[i];
        }
        return suma;
    }

    public static Integer[] Skaityti(String failas) throws IOException {

        Integer[] masyvas = null;
        BufferedReader br = new BufferedReader(new FileReader(failas));
        try {
            StringBuilder sb = new StringBuilder();
            String nReiksme = br.readLine();
            Integer n = Integer.parseInt(nReiksme);
            masyvas = new Integer[n];
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                String[] skaiciai = line.split(" ");
                for (int i = 0; i < skaiciai.length; i++) {
                    masyvas[i] = Integer.parseInt(skaiciai[i]);
                }
                line = br.readLine();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Failas nerastas");
        } finally {
            br.close();
        }

        return masyvas;
    }

    public static void Rasyti(String failas, Integer ats, Integer[] masyvas) throws IOException {
        BufferedWriter output = null;
        try {
            output = new BufferedWriter(new FileWriter(failas));
            output.write("Gauta suma lygi = " + ats + "\n");
            for (int i = 0; i < masyvas.length; i++) {
                output.write(masyvas[i] + " ");
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

