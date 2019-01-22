import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number: ");
        Double number = reader.nextDouble();
        reader.close();
        System.out.println(number);

    }


    /* ashkjdfhaskjhasjghafg
    sakjhkhgakfjghalkfgh
     */

    public static void AtspausdintiKintamaji(Object kintamasis) {
        if(kintamasis instanceof Integer) {
            System.out.println("Sveikas Skaicius = " + kintamasis.toString());
        } else if (kintamasis instanceof Double) {
            System.out.println("Skaicius su kableliu = " + kintamasis.toString());
        }
    }



//    public static int DidziausiasSkaicius(int[] masyvas) {
//        int max = 9999;
//        for(int i = 0; i < masyvas.length; i++) {
//            if(max > masyvas[i]) {
//                max = masyvas[i];
//            }
//        }
//        return max;
//    }
//
//
//    public static void Test() {
//        System.out.println("123");
//    }
//
}
