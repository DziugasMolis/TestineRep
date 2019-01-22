package TrikampioPlotas;

import java.util.Scanner;

/*
    Apskaiciuoti Stačiakampio plotą
 */
public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Iveskite skaicius ");
        Integer skaicius = reader.nextInt();
        reader.close();

        if(skaicius > 0) {
            System.out.println("Teigiamas");
        } else if (skaicius == 0) {
            System.out.println("Lygus nuliui");
        } else {
            System.out.println("Neigiamas");
        }
    }
}
