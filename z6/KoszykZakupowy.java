import java.util.*;

public class KoszykZakupowy {
    Map<Produkt, Integer> koszyk;


    public KoszykZakupowy() {
        this.koszyk = new HashMap<Produkt, Integer>() {
        }
        ;
    }

    public void dodajProdukt(Produkt p, int howMany) {
        if (p.getIloscNaMagazynie() < howMany) {
            throw new NumberFormatException("nie ma tylu obiektów " + p.getNazwa());
        } else {
            p.usunZMagazynu(howMany);
            this.koszyk.put(p, howMany);
        }
    }
    public void wyswietlZawartoscKoszyka(){
        for (Produkt p : this.koszyk.keySet()) {
            System.out.println(p.getNazwa() + " : " + this.koszyk.get(p));
        }
    }
    public double obliczCalkowitaWartosc(){
        double wartosc=0;
        for (Produkt p : this.koszyk.keySet()) {
            wartosc+=(this.koszyk.get(p)*p.getCena());
        }
        return wartosc;
    }
}
