import java.util.Scanner;

public class Zadanie_2 {
    public static void main(String[] args) {
        System.out.println(23.0 + 76);
        System.out.println(41 * 2.0 + 3);
        System.out.println(5 - 33);
        System.out.println(109 % 3);
        System.out.println(50 / 22);
        System.out.println(4 | 2);
        System.out.println(3 ^ 5);
        System.out.println(7 & 9);
        double pierwsze = 23.0 + 76;
        double drugie = 41 * 2.0 + 3;
        int trzecie = 5 - 33;
        int czwarte = 109 % 3;
        int piate = 50 / 22;
        int szoste = 4 | 2;
        int siodme = 3 ^ 5;
        int osme = 7 & 9;

        double dwa_jeden = ((Math.sqrt(7) - 1) / 2) + Math.pow(3, 3) % 2;
//    System.out.println(dwa_jeden);
        System.out.println((int) dwa_jeden);
        double dwa_dwa = 1999 / (7 * 3);
//    System.out.println(dwa_dwa);
        System.out.println((int) dwa_dwa);
        double dwa_trzy = ((3 + Math.sqrt(3)) / ((Math.sqrt(5) / 2) / 3)) + 1;
//        System.out.println(dwa_trzy);
        System.out.println((int) dwa_trzy);
        int dwa_cztery = 8 % 9 % 3;
        System.out.println(dwa_cztery);
        String imie = "Tomasz", nazwisko = "Witak";
        double dwa_piec = (imie.length() % nazwisko.length() + 1) / (Math.pow(2, (1 / 4)));
        System.out.println(dwa_piec);
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Wpisz slowo");

        String slowo1 = myObj.nextLine();
        System.out.println("Wpisz slowo");

        String slowo2 = myObj.nextLine();// Read user input
        System.out.println(slowo1 + slowo2);  // Output user input
        System.out.println("Wpisz 1 liczbe");

        String input = myObj.nextLine();
        int liczba1 = Integer.parseInt(input);
        System.out.println("Wpisz 2 liczbe");
        input = myObj.nextLine();
        int liczba2 = Integer.parseInt(input);
        System.out.println(liczba1 + liczba2);  // Output user input
        System.out.println(liczba1 - liczba2);
        System.out.println(liczba1 * liczba2);
        System.out.println(liczba1 / liczba2);

        System.out.println("Wpisz  liczbe");

        input = myObj.nextLine();
        double liczba = Integer.parseInt(input);
        System.out.println(liczba + 140);  // Output user input
        System.out.println(liczba - 31);
        System.out.println(liczba * 7);
        System.out.println(liczba / 13);
        System.out.println((int) liczba % 7);
        System.out.println((int) liczba / 4);
        System.out.println(Math.pow(liczba, 45));
        System.out.println((int) liczba & 67);
        System.out.println((int) liczba | 59);
        System.out.println((int) liczba ^ 23);
        System.out.println((int) liczba << 5);
        System.out.println((int) liczba >> 6);
    }
}
