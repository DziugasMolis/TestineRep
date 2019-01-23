package Uzduotis8;

import java.io.*;
/*
Parašyti programą, kuri nuskaito žodžius iš failo ir įrašo
žodžių skaičių į failo pirmą eilutę,
o kitoje eilutėje visas nuskaitytas tekstas.

 */

public class uzduotis8 {
    public static void main(String[] args) {
        String file = "C:\\TestineRep\\HelloWorld\\src\\uzduotis8\\Duomenys.txt";
        String fileRasymui = "C:\\TestineRep\\HelloWorld\\src\\uzduotis8\\Atsakymai.txt";
        try {
            String nuskaitytasTekstas = Skaityti(file);
            // \\W pasalina ne zodzius char elementus
            String[] zodziuMasyvas = nuskaitytasTekstas.split("\\W+");
            Integer zodziuSkaicius = zodziuMasyvas.length;

            Rasyti(fileRasymui, zodziuSkaicius, nuskaitytasTekstas);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String Skaityti(String failas) throws IOException {
        String nuskaitytasTekstas = "";
        BufferedReader br = new BufferedReader(new FileReader(failas));
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                nuskaitytasTekstas += line + " ";
                line = br.readLine();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Failas nerastas");
        } finally {
            br.close();
        }

        return nuskaitytasTekstas;
    }

    public static void Rasyti(String failas, Integer zodziuSkaicius, String tekstas) throws IOException {
        BufferedWriter output = null;
        try {
            output = new BufferedWriter(new FileWriter(failas));
            output.write("Zodziu skaicius = " + zodziuSkaicius + "\n");
            output.write(tekstas);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (output != null) {
                output.close();
            }
        }
    }
}
