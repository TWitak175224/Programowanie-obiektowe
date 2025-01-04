import java.util.ArrayList;
import java.util.List;

public class Main {
public static void main(String[] args){
    Produkt maslo = new Produkt("maslo",12,100);
    Produkt mleko = new Produkt("mleko",5,10);
    List<Produkt> produkt = new ArrayList<>();
    List<Integer> ilosc = new ArrayList<>();
    produkt.add(maslo);
    produkt.add(mleko);
    ilosc.add(100);
    ilosc.add(10);
    Magazyn mn = new Magazyn(produkt,ilosc);
    mn.PokazMagazyn();
}

    }

