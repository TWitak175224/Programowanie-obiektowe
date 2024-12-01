
public class Main {
    public static void main(String[] args) {
        Produkt ksiazka = new Produkt("ksiazka", 20, 53);
        Produkt szynka = new Produkt("szynka", 1.1, 18);
        Produkt chleb = new Produkt("ksiazka", 4.5, 20);
        Produkt jablko = new Produkt("ksiazka", 21, 124);
        KoszykZakupowy koszyk = new KoszykZakupowy();
        koszyk.dodajProdukt(ksiazka,30);
        koszyk.dodajProdukt(szynka,12);
        System.out.println(koszyk.obliczCalkowitaWartosc());
    }
}
