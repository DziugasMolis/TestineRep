package Switch;

public class Switchas {


    public static void main(String[] args) {

        Integer skaicius = 2;
        gautiSkaiciuString(skaicius);
    }

    public static void gautiSkaiciuString(Integer skaicius) {
        switch (skaicius) {
            case 1:
                System.out.println("vienas");
                break;

            case 2:
                System.out.println("du");
                break;

            case 3:
                System.out.println("trys");
                break;
            default:
                System.out.println("nepazistamas skaicius");
                break;
        }
    }
}
