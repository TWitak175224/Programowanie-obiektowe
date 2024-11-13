import java.util.ArrayList;

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
        int k = -1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                k++;
                if (k < (tab.length)) {
                    System.out.print(tab[k]);

                } else {
                    System.out.print(0);
                }
                System.out.print('\t');


            }
            System.out.println();
        }
    }

    public static int ileNieparzystych(int[] tab) {
        int ile_np = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] % 2 == 1) {
                ile_np++;
            }

        }
        return ile_np;
    }

    public static int ileParzystych(int[] tab) {
        int ile_p = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] % 2 == 0) {
                ile_p++;
            }

        }
        return ile_p;
    }

    public static int ileDodatnich(int[] tab) {
        int ile_dod = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > 0) {
                ile_dod++;
            }

        }
        return ile_dod;
    }

    public static int ileUjemnych(int[] tab) {
        int ile_uj = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < 0) {
                ile_uj++;
            }

        }
        return ile_uj;
    }

    public static int ileZerowycg(int[] tab) {
        int ile_zer = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == 0) {
                ile_zer++;
            }

        }
        return ile_zer;
    }

    public static int ileMaxymalnych(int[] tab) {
        int ile_max = 0;
        int max = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (tab[i] > max) {
                max = tab[i];
            }
        }
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == max) {
                ile_max++;
            }

        }
        return ile_max;
    }

    public static int ileMinimalnych(int[] tab) {
        int ile_min = 0;
        int max = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (tab[i] < max) {
                max = tab[i];
            }
        }
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == max) {
                ile_min++;
            }

        }
        return ile_min;
    }

    public static void ileUnikalnych(int[] tab) {
        ArrayList<Integer> unikat = new ArrayList<Integer>();
        for (int i = 0; i < tab.length; i++) {
            if (checker(unikat, tab[i])) {
                unikat.add(tab[i]);
            }
        }

    }

    public static boolean checker(ArrayList Al, int lookFor) {
        for (int i = 0; i < Al.size(); i++) {
            if ((int) Al.get(i) == lookFor) {
                return false;
            }
        }
        return true;
    }

    public static int sumaDodatnich(int[] tab) {
        int ile_dod = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > 0) {
                ile_dod += tab[i];
            }

        }
        return ile_dod;
    }

    public static int sumaUjemnych(int[] tab) {
        int ile_uj = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < 0) {
                ile_uj += tab[i];
            }

        }
        return ile_uj;
    }
    public static double sumaOdwrotnbych(int[] tab) {
        int ile_uj = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < 0) {
                ile_uj += (1/tab[i]);

            }

        }
        return ile_uj;
    }


    public static void wypiszTablice(double[] tab) {
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i]);
            System.out.print(", ");
        }
    }

    public static double[] generujZakres(int n, int minWartosc, int maxWartosc) {
        double[] tablica = new double[n];
        tablica[0] = minWartosc;
        tablica[n - 1] = maxWartosc;
        double podzielnik = ((double) (maxWartosc - minWartosc)) / (n - 1);
        for (int i = 1; i < n - 1; i++) {
            tablica[i] = minWartosc + podzielnik * i;
            System.out.println(tablica[i]);
        }
        return tablica;
    }

    public static void main(String[] args) {
//        int[]tablica=generujTablice(40, 2, 10);
//        wypiszTablice(tablica,10,20);
        double[] zakres = generujZakres(7, 5, 20);
        wypiszTablice(zakres);
    }
}

