import java.util.Optional;

public class Adres {
    String ulica;
    int numerDomu;
    Integer numerMieszkania=null;
    String miasto;
    String kodPocztowy;

    Adres(String ulica, int numerDomu, String miasto,String kodPocztowy) {
        this.ulica = ulica;
        this.numerDomu = numerDomu;
        this.miasto = miasto;
        this.kodPocztowy = kodPocztowy;
    }
    Adres(String ulica, int numerDomu, Integer numerMieszkania, String miasto,String kodPocztowy) {
        this.ulica = ulica;
        this.numerDomu = numerDomu;
        this.miasto = miasto;
        this.kodPocztowy = kodPocztowy;
        this.numerMieszkania = numerMieszkania;
    }
    public String pokaz(){
        return kodPocztowy+" "+miasto+"\n"+ulica+" "+numerDomu+" "+numerMieszkania;
    }
    public boolean przed(Adres adres){
        if(adres.kodPocztowy.compareTo(this.kodPocztowy)>=0){
            return true;
        }
        return false;
    }

}
