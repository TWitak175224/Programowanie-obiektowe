public class Platnosc {
    double kwota;
    enum status{Oczekuje,Oplacone};
    status statusPlatnosci = status.Oczekuje;
    Platnosc(double kwota){kwota=kwota;}
    public void zaplac(){
        statusPlatnosci = status.Oplacone;
    }
}
