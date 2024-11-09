import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class z5 {


    public static ArrayList<Integer[]> uniqueArrayList(ArrayList<Integer> tab) {
        ArrayList<Integer> unikat = new ArrayList<Integer>();
        for (int i = 0; i < tab.size(); i++) {
            if (checker(unikat, tab.get(i))) {
                unikat.add(tab.get(i));
            }
        }
        ArrayList<Integer[]> tablica=new ArrayList<Integer[]>();

        for(int i=0;i<unikat.size();i++){
            tablica.add(new Integer[2]);
            tablica.get(i)[0]=unikat.get(i);
            tablica.get(i)[1]=0;
        }
        return tablica;
    }

    public static boolean checker(ArrayList Al, int lookFor) {
        for (int i = 0; i < Al.size(); i++) {
            if ((int) Al.get(i) == lookFor) {
                return false;
            }
        }
        return true;
    }

    public static void wypiszTablice(ArrayList<Integer[]> tab) {
        for(int i = 0; i < tab.size(); i++) {
            for(int j = 0; j < 2; j++) {
            System.out.print(tab.get(i)[j]);

            }System.out.print(", ");
        }
    }


    public static void main(String[] args) {
        ArrayList<Integer> nowa = new ArrayList<Integer>();
        nowa.add(3);
        nowa.add(2);
        nowa.add(5);
        nowa.add(3);
        wypiszTablice(uniqueArrayList(nowa));

    }
}

