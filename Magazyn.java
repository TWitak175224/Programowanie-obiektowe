import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Magazyn {
    Map<Produkt,Integer> produkty = new HashMap<>();
    public Magazyn(List<Produkt> products,List<Integer> ilosc) {
        for (Produkt produkt : products) {
            this.produkty.put(produkt,ilosc.get(products.indexOf(produkt)));
        }
    }
    public void PokazMagazyn() {
        for (Produkt produkt : produkty.keySet()) {
            System.out.println(produkt.getNazwa() + " " + produkty.get(produkt));
        }
    }
}
