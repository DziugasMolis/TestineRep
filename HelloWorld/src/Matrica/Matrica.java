package Matrica;

public class Matrica {
    public static void main(String[] Args) {
        Integer[][] matrica = new Integer[][]{
                {1, 2, 3, 4, 5, 6},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15}
        };
    SpausdintiMatrica(matrica);
    }

    public static void SpausdintiMatrica(Integer[][] masyvas) {
        int eilutes = masyvas.length;
        int stulpeliai;
        for(int i = 0; i < eilutes; i++) {
            stulpeliai = masyvas[i].length;
            for(int j = 0; j < stulpeliai; j++) {
                System.out.print(masyvas[i][j] + " ");
            }
            System.out.println("\n");
        }
    }
}
