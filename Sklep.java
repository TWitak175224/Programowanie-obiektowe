import java.util.ArrayList;
import java.util.List;

public class Sklep {
    Magazyn produkty;
    private String nazwa;
    private String adres;
    Sklep(String nazwa, String adres,List<Produkt> produkty, List<Integer> ilosc) {
        this.nazwa = nazwa;
        this.adres = adres;
        this.produkty = new Magazyn(produkty, ilosc);

    }
    public void dodajProdukt(Produkt produkt, Integer ilosc) {
        produkty.produkty.put(produkt,ilosc);
    }
    public void wyswietlOferty(){
        produkty.PokazMagazyn();
    }
    public Produkt wyszukajProdukt(String nazwa){
        for(Produkt produkt : produkty.produkty.keySet()){
            if(produkt.getNazwa().equals(nazwa)){
                return produkt;
            }
        }
        return null;
    }
    public void zakupy(Produkt produkt,int ilosc,Klient klient){
        klient.listaZamowien.getLast().koszyk.dodajProdukt(produkt,ilosc);
    }
}
