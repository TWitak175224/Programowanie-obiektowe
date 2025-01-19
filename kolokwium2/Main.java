
public class Main {
    public static void main(String[] args) {
        House domek = new House(15.7, "czerwony", 6);
        System.out.println(domek.color + " " + domek.height + " " + domek.numberOfRooms);

        String[] tabStr={"a","g","c","b"};
        String chk = "";
        for(int i = 0;i<tabStr.length;i++){
            chk+=tabStr[i];
        }
        System.out.println(chk);
        sortDescending(tabStr);
        chk = "";
        for(int i = 0;i<tabStr.length;i++){
            chk+=tabStr[i];
        }
        System.out.println(chk);



    }

    public static<T extends Comparable<T>> void sortDescending(T[] tab){

        for(int i=0;i<tab.length;i++){

            for(int j = 0;j< i;j++){
                if(tab[i].compareTo(tab[j])<0){
                    T temp = tab[i];
                    tab[i]=tab[j];
                    tab[j]=temp;
                }
            }
        }
    }
}

class Building {
    public double height;
    public String color;

    public Building(double height, String color) {
        this.height = height;
        this.color = color;
    }

}
//1
class House extends Building {
    public int numberOfRooms;

    public House(double height, String color, int numberOfRooms) {
        super(height, color);
        this.numberOfRooms = numberOfRooms;
    }


}
//2
abstract class ComputerGraphic {
    public int width;
    public int height;
    public String fileName;

    abstract void loadFile();

    abstract void saveFile();
}

class Bitmap extends ComputerGraphic {
    @Override
    void loadFile() {
        System.out.println("ładuje plik typu bitmap");
    }

    @Override
    void saveFile() {
        System.out.println("zapisuje pliktypu bitmap");
    }
}

class Vector extends ComputerGraphic {
    @Override
    void loadFile() {
        System.out.println("ładuje plik typu vector");
    }

    @Override
    void saveFile() {
        System.out.println("zapisuje pliktypu vector");
    }
}
//3
interface MediaPlayer {
    void play(String trackName);

    void pause();

    String GetCurrentTrack();
}

class AudioPlayer implements MediaPlayer{
    String trackName;
    boolean paused;

    AudioPlayer(){
        this.paused = false;
    }
    @Override
    public void play(String trackName) {
        this.trackName=trackName;
        this.paused =  false;
    }

    @Override
    public void pause() {
        this.paused = true;
    }

    @Override
    public String GetCurrentTrack() {
        return this.trackName;
    }
}
class VideoPlayer implements MediaPlayer{
    String filmName;
    boolean paused;

    VideoPlayer(){
        this.paused = false;
    }
    @Override
    public void play(String trackName) {
        this.filmName=trackName;
        this.paused =  false;
    }

    @Override
    public void pause() {
        this.paused = true;
    }

    @Override
    public String GetCurrentTrack() {
        return this.filmName;
    }
}
//4
 class Storage<T> {
    T item = null;

    public void store(T item){
        this.item = item;
    }
    public T retrive(){
        return this.item;
    }
 }
// 5
 interface Authentication{
    boolean login(String username, String password);
    boolean resetPassword(String username,String oldPassword,String newPassword);
    void logout();
 }

 class UserAuthentication implements Authentication{
    String username;
    String pass;

     @Override
     public boolean login(String username, String password) {
         if((username==this.username) && (password==this.pass)){
             return true;
         }
         return false;
     }

     @Override
     public boolean resetPassword(String username, String oldPassword, String newPassword) {
         if((username==this.username) && (oldPassword==this.pass)){
             this.pass = newPassword;
             return true;
         }
         return false;
     }

     @Override
     public void logout() {
         System.out.println("wylogowano");

     }
 }

class AdminAuthentication implements Authentication{
    String username;
    String password;

    @Override
    public boolean login(String username, String password) {
        if((username==this.username) && (password==this.password)){
            return true;
        }
        return false;
    }

    @Override
    public boolean resetPassword(String username, String oldPassword, String newPassword) {
        if((username==this.username) && (oldPassword==this.password)){
            this.password = newPassword;
            return true;
        }
        return false;
    }

    @Override
    public void logout() {
        System.out.println("wylogowano admina");

    }
}
