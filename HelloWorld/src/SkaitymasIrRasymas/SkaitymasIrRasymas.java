package SkaitymasIrRasymas;

import java.io.*;

public class SkaitymasIrRasymas {

    public static void main(String[] args) {
        String file = "C:\\testrep\\HelloWorld\\src\\SkaitymasIrRasymas\\Test.txt";
        String fileRasymui = "C:\\testrep\\HelloWorld\\src\\SkaitymasIrRasymas\\Irasytas.txt";
        try {
            Skaityti(file);
            Rasyti(fileRasymui);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void Skaityti(String failas) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(failas));
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                System.out.println(line);
                line = br.readLine();
            }
            String everything = sb.toString();
        } catch (FileNotFoundException ex) {
            System.out.println("Failas nerastas");
        } finally {
            br.close();
        }
    }

    public static void Rasyti(String failas) throws IOException {
        BufferedWriter output = null;
        try {
            output = new BufferedWriter(new FileWriter(failas));
            output.write("abcd");
        } catch ( IOException e ) {
            e.printStackTrace();
        } finally {
            if ( output != null ) {
                output.close();
            }
        }
    }

}

