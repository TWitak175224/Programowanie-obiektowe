import java.util.Objects;

public class Produkt {
    private String nazwa;
    private double cena;
    private int iloscNaMagazynie;

    public Produkt(String nazwa, double cena, int iloscNaMagazynie) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.iloscNaMagazynie = iloscNaMagazynie;
    }


    public void wyswietlInformacje() {
        System.out.println("nazwa produktu:" + this.nazwa);
        System.out.println("cena produktu:" + this.cena);
        System.out.println("ilość produktu na magazynie:" + this.iloscNaMagazynie);
    }

    public void dodajDoMagazynu(int ile) {
        this.iloscNaMagazynie += ile;
    }

    public void usunZMagazynu(int ile) {
        if (ile <= this.iloscNaMagazynie) {
            this.iloscNaMagazynie -= ile;
        } else {
            System.out.println("Brak tylu obiektów na magazynie!!");
        }
    }

    public double getCena() {
        return cena;
    }

    public int getIloscNaMagazynie() {
        return iloscNaMagazynie;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public void setIloscNaMagazynie(int iloscNaMagazynie) {
        this.iloscNaMagazynie = iloscNaMagazynie;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nazwa, cena, iloscNaMagazynie);
    }
}