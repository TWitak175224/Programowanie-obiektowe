import java.util.ArrayList;
import java.util.List;

public class Klient {
    private String imie;
    private String nazwisko;
    List<Zamowienie> listaZamowien;
    Klient(String imie, String nazwisko){
        this.imie = imie;
        this.nazwisko = nazwisko;
        listaZamowien = new ArrayList<>();
    }
    public String getImie(){return this.imie;}
    public String getNazwisko(){return this.nazwisko;}
    public void setImie(String imie){this.imie = imie;}
    public void setNazwisko(String nazwisko){this.nazwisko = nazwisko;}
    public void dodajZamowienie(Zamowienie zamowienie){
        listaZamowien.add(zamowienie);
    }
    public void wyswietlHistorieZamowien(){
        for(Zamowienie z : listaZamowien){
            z.wyswietlZamowienie();
        }
    }
    public double obliczLacznyKosztZamowien(){
        double koszt=0;
        for(Zamowienie z : listaZamowien){
            koszt+=z.koszyk.obliczCalkowitaWartosc();
        }
        return koszt;
    }
}
