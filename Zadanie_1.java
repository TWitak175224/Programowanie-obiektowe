import java.time.LocalDate;
import java.time.LocalTime;

public class Zadanie_1 {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        String imie = "Tomasz Witak";
        System.out.println(imie);
        System.out.println(imie.length());
        String ala = "Ala";
        String ma = " ma ", kota = "kota";
        String ciag = ala + ma + kota;
        System.out.println(ciag);
        System.out.println("                    *\n                    * *\n                    * * *\n* * * * * * * * * * * * * *\n* * * * * * * * * * * * * * *\n" +
                "* * * * * * * * * * * * * *\n                    * * *\n                    * *\n                    *\n");
        System.out.println("     *     \n" + "    * *    \n" + "   * * *   \n" +
                "  * * * *  \n" + " * * * * * \n" + "* * * * * *\n" +
                " * * * * * \n" + "  * * * *  \n" + "   * * *   \n" + "    * *    \n" + "     *     \n");
        String a_na_e = ciag.replace("a", "e");
        System.out.println(a_na_e);
        String zmiana_duzych_na_male = ciag.toUpperCase().replaceFirst("A", "a");
        System.out.println(zmiana_duzych_na_male);
        int A = 'A';
        int wykrzyknik = '!';
        int malpa = '@';
        int mniejszosc = '>';
        int tylda = '~';
        int nowalinia = '\n';
        int b = '\b';
        System.out.println("wartosc A to " + A + " wartosc ! to " + wykrzyknik + " wartosc @ to " + malpa +
                " wartosc > to " + mniejszosc + "\n wartosc ~ to " + tylda + " wartosc \\n to " + nowalinia + " wartosc \\b to " + b);
        System.out.println("małe litery są między: " + (int) 'a' + " a " + (int) 'z');
        System.out.println("duże litery są między: " + (int) 'A' + " a " + (int) 'Z');
        System.out.println("cyfry są między: " + (int) '0' + " a " + (int) '9');
        String zdanie = "Grzesiek nie wiedział dlaczego %s jest tak\ndrapieżnym %s mimo, że jego %s na to nie wskazuje.";
        zdanie = zdanie.format(zdanie, "lew", "ssakiem", "kolor");
        System.out.println(zdanie);
        zdanie = "%s to najlepsza ksiazka napisana przez %s";
        zdanie = zdanie.format(zdanie, "Władca Pierścieni", "J.R.R Tolkiena");
        System.out.println(zdanie);
        System.out.printf("wodrze".repeat(5));
        System.out.printf("\n");
        String data = "Dzisiaj jest " + LocalDate.EPOCH.getDayOfMonth() + '.' +
                LocalDate.EPOCH.getMonthValue() + '.' +
                LocalDate.EPOCH.getYear() + " godzina " + LocalTime.now();
        System.out.println(data);
        System.out.println((char) 54 + " " + (char) 103 + " " + (char) 241 + " " + (char) 67 + " " + (char) 9999 + " "+
                (char)imie.length()+" "+(char)175224);
    }
}
