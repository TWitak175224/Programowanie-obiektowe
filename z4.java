import java.math.*;

public class z4 {
    public static int[] generujTablice(int n, int minWartosc, int maxWartosc) {
        int[] tablica = new int[n];
        for (int i = 0; i < n; i++) {
            tablica[i] = (int) (Math.random() * (maxWartosc - minWartosc + 1)) + minWartosc;
            System.out.println(tablica[i]);
        }
        return tablica;
    }

    public static void wypiszTablice(int[] tab, int m, int n) {
        int k=-1;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    k++;
                    if(k<(tab.length)) {
                        System.out.print(tab[k]);

                    }else{
                        System.out.print(0);
                    }
                    System.out.print('\t');


                }
                System.out.println();
            }
        }
    public static void wypiszTablice(double[] tab) {
        for(int i=0;i<tab.length;i++){
            System.out.print(tab[i]);
            System.out.print(", ");
        }
    }

    public static double[] generujZakres(int n, int minWartosc, int maxWartosc) {
        double[] tablica = new double[n];
        tablica[0]=minWartosc;
        tablica[n-1]=maxWartosc;
        double podzielnik=((double)(maxWartosc-minWartosc))/(n-1);
        for (int i = 1; i < n-1; i++) {
            tablica[i] = minWartosc+podzielnik*i;
            System.out.println(tablica[i]);
        }
        return tablica;
    }

    public static void main(String[] args) {
//        int[]tablica=generujTablice(40, 2, 10);
//        wypiszTablice(tablica,10,20);
        double[]zakres=generujZakres(7, 5, 20);
        wypiszTablice(zakres);
    }
}

