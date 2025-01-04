import java.util.*;

public class KoszykZakupowy {
    Map<Produkt, Integer> koszyk;


    public KoszykZakupowy() {
        this.koszyk = new HashMap<Produkt, Integer>() {
        }
        ;
    }

    public void usunProdukt(Produkt p, int howMany) {

        if (this.koszyk.containsKey(p)) {
            if (this.koszyk.get(p) > howMany) {
                p.dodajDoMagazynu(howMany);
                this.koszyk.put(p, this.koszyk.get(p) - howMany);
            }else{
                p.dodajDoMagazynu(this.koszyk.get(p));
                this.koszyk.remove(p);
            }
        }
    }

    public void dodajProdukt(Produkt p, int howMany) {

        try {
            p.usunZMagazynu(howMany);
        } catch (Exception e) {
            System.out.println("brak na magazynie");
            return;
        }
        this.koszyk.put(p, howMany);

    }

    public void wyswietlZawartoscKoszyka() {
        for (Produkt p : this.koszyk.keySet()) {
            System.out.println(p.getNazwa() + " : " + this.koszyk.get(p));
        }
    }

    public double obliczCalkowitaWartosc() {
        double wartosc = 0;
        for (Produkt p : this.koszyk.keySet()) {
            wartosc += (this.koszyk.get(p) * p.getCena());
        }
        return wartosc;
    }
}