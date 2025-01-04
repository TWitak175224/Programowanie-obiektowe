public class Zamowienie {
    KoszykZakupowy koszyk = new KoszykZakupowy();

    enum statusZamowienia {zlozone, w_trakcie_realizacji, gotowe_do_wysylki, wyslane}

    private statusZamowienia Status = statusZamowienia.zlozone;

    Platnosc platnosc = new Platnosc(koszyk.obliczCalkowitaWartosc());

    public void ustawStatusZamowienia(int status) {
        switch (status) {
            case 1:
                this.Status = statusZamowienia.zlozone;
                break;
            case 2:
                this.Status = statusZamowienia.w_trakcie_realizacji;
                break;
            case 3:
                this.Status = statusZamowienia.gotowe_do_wysylki;
                break;
            case 4:
                this.Status = statusZamowienia.wyslane;
                break;

        }

    }

    public void wyswietlZamowienie() {
        System.out.println("status zamowienia: " + Status);
        koszyk.wyswietlZawartoscKoszyka();
    }

    public void finalizujZamowienie() {
        if (this.platnosc.statusPlatnosci == Platnosc.status.Oplacone) {
            this.Status = statusZamowienia.gotowe_do_wysylki;
        }
    }
    public void dodajProdukt(Produkt produkt,int ilosc) {
        koszyk.dodajProdukt(produkt,ilosc);
        platnosc.kwota= koszyk.obliczCalkowitaWartosc();
    }
    public void zwrocProdukt(Produkt produkt,int ilosc) {
        koszyk.usunProdukt(produkt,ilosc);
        platnosc.kwota= koszyk.obliczCalkowitaWartosc();
    }
}